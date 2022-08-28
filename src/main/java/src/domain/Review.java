package src.domain;

import src.type.FK;
import src.type.PK;

public class Review {
    @PK
    private int id;
    @FK
    private int userId;
    @FK
    private int movieId;

    private String comment;
    private double score;

}
