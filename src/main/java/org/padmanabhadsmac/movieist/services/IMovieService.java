package org.padmanabhadsmac.movieist.services;

import org.padmanabhadsmac.movieist.models.Movie;

import java.util.List;
import java.util.Optional;

/**
 * @author padmanabhadas
 */
public interface IMovieService {

    List<Movie> allMovies();

    Optional<Movie> getMovieByImdbId(String imdbId);
}
