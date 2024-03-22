package org.padmanabhadsmac.movieist.implementations;

import org.padmanabhadsmac.movieist.models.Movie;
import org.padmanabhadsmac.movieist.repositories.IMovieRepository;
import org.padmanabhadsmac.movieist.services.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author padmanabhadas
 */
@Service
public class MovieServiceImpl implements IMovieService {

    @Autowired
    private IMovieRepository movieRepository;

    /**
     * @return
     */
    @Override
    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    /**
     * @param movieId
     * @return
     */
    @Override
    public Optional<Movie> getMovieByImdbId(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }


}
