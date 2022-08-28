package src.domain;

import src.type.MovieGenreCode;
import src.type.PK;

import java.time.LocalDate;

public class Movie {
    @PK
    private int id;

    private String title;
    private MovieGenreCode mainGenre;
    private String plot;
    private LocalDate releaseDate;

    public Movie(int id, String title, MovieGenreCode mainGenre, String plot, LocalDate releaseDate) {
        this.id = id;
        this.title = title;
        this.mainGenre = mainGenre;
        this.plot = plot;
        this.releaseDate = releaseDate;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public MovieGenreCode getMainGenre() {
        return mainGenre;
    }

    public String getPlot() {
        return plot;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }
}
