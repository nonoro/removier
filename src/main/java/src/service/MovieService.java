package src.service;

import src.domain.Movie;
import src.type.MovieGenreCode;

import java.util.List;

public interface MovieService {

    List<Movie> getMoviesByGenre(MovieGenreCode genreCode);

    List<Movie> getMoviesByActor(String string);

}
