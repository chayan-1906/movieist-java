package org.padmanabhadsmac.movieist.controllers;

import org.padmanabhadsmac.movieist.models.Review;
import org.padmanabhadsmac.movieist.services.IReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author padmanabhadas
 */
@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {

    @Autowired
    private IReviewService reviewService;

    @PostMapping
    public ResponseEntity<Review> createReview(@RequestBody Map<String, String> payload) {
        return new ResponseEntity<>(reviewService.createReview(payload.get("imdbId"), payload.get("reviewText")), HttpStatus.CREATED);
    }
}
