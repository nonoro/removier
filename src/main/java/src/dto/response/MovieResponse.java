package src.dto.response;

import src.domain.Movie;

public class MovieResponse {
    private int id;
    private String title;

    public MovieResponse(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public static MovieResponse from(Movie movie) {
        return new MovieResponse(movie.getId(), movie.getTitle());
    }
}
