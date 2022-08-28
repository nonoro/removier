package src.domain;

import src.type.FK;
import src.type.PK;

public class MyMovie {
    @PK
    private int id;
    @FK
    private int userId;
    @FK
    private int movieId;

    public MyMovie(int id, int userId, int movieId) {
        this.id = id;
        this.userId = userId;
        this.movieId = movieId;
    }
}
