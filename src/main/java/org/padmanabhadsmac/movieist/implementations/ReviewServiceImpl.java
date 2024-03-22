package org.padmanabhadsmac.movieist.implementations;

import org.padmanabhadsmac.movieist.models.Movie;
import org.padmanabhadsmac.movieist.models.Review;
import org.padmanabhadsmac.movieist.repositories.IReviewRepository;
import org.padmanabhadsmac.movieist.services.IReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

/**
 * @author padmanabhadas
 */
@Service
public class ReviewServiceImpl implements IReviewService {

    @Autowired
    private IReviewRepository reviewRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * @return
     */
    @Override
    public Review createReview(String imdbId, String reviewText) {
        Review review = new Review();
        review.setBody(reviewText);
        Review insertedReview = reviewRepository.insert(review);

//        Review review = reviewRepository.insert(new Review(reviewText));

        mongoTemplate.update(Movie.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewIds").value(insertedReview))
                .first();

        return insertedReview;
    }
}
