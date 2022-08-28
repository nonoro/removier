package src.repository;

import src.domain.Movie;

import java.util.Optional;

public class MovieOracleRepository implements MovieRepository {
    @Override
    public void save(Movie movie) {

    }

    @Override
    public Optional<Movie> findByName(String userId) {
        return Optional.empty();
    }
}
