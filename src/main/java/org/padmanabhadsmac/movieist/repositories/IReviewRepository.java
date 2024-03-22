package org.padmanabhadsmac.movieist.repositories;

import org.bson.types.ObjectId;
import org.padmanabhadsmac.movieist.models.Review;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author padmanabhadas
 */
@Repository
public interface IReviewRepository extends MongoRepository<Review, ObjectId> {
}
