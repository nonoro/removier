package src.repository;

import src.domain.Movie;

import java.util.Optional;

public interface MovieRepository {
    void save(Movie movie);
    Optional<Movie> findByName(String name);
}
