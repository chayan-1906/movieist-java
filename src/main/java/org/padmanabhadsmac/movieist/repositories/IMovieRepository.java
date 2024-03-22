package org.padmanabhadsmac.movieist.repositories;

import org.bson.types.ObjectId;
import org.padmanabhadsmac.movieist.models.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author padmanabhadas
 */
@Repository
public interface IMovieRepository extends MongoRepository<Movie, ObjectId> {

    Optional<Movie> findMovieByImdbId(String imdbId);
}
