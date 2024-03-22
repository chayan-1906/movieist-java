package org.padmanabhadsmac.movieist.services;

import org.padmanabhadsmac.movieist.models.Review;

/**
 * @author padmanabhadas
 */
public interface IReviewService {

    Review createReview(String imdbId, String reviewText);
}
