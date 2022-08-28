package src.domain;

import src.type.FK;
import src.type.PK;

public class Actor {
    @PK
    private int id;
    @FK
    private int movieId;

    private java.lang.String name;

    public Actor(int id, int movieId, String name) {
        this.id = id;
        this.movieId = movieId;
        this.name = name;
    }
}
