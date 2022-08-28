package src.service.impl;

import src.domain.Movie;
import src.repository.MovieOracleRepository;
import src.repository.MovieRepository;
import src.service.MovieService;
import src.type.MovieGenreCode;

import java.util.List;

public class MovieServiceImpl implements MovieService {
    private final MovieRepository movieRepository = new MovieOracleRepository();

    @Override
    public List<Movie> getMoviesByGenre(MovieGenreCode genreCode) {
        // TODO : 장르코드를 기반으로 DB 검색

        return List.of();
    }

    @Override
    public List<Movie> getMoviesByActor(String string) {
        // TODO : 배우를 기반으로 DB 검색

        return List.of();
    }
}
