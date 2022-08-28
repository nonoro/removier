package src.domain;

import src.type.MemberType;
import src.type.MovieGenreCode;

public class User extends Member {
    private String phoneNumber;
    private String favoriteActorName;
    private MovieGenreCode favoriteGenre;

    public User(int id, String name, String loginId, String password, MemberType role, String phoneNumber, String favoriteActorName, MovieGenreCode favoriteGenre) {
        super(id, name, loginId, password, role);
        this.phoneNumber = phoneNumber;
        this.favoriteActorName = favoriteActorName;
        this.favoriteGenre = favoriteGenre;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFavoriteActor() {
        return favoriteActorName;
    }

    public MovieGenreCode getFavoriteGenre() {
        return favoriteGenre;
    }
}
