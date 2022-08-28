package src.dto.request;

public class SignUpRequest {
/*
    String id = ViewUtil.input("ID > ");
    String password = ViewUtil.input("PW > ");
    String name = ViewUtil.input("이름 > ");
    String favoriteActor = ViewUtil.input("좋아하는 배우 > ");
    showGenre();
    String favoriteGenre = ViewUtil.input("좋아하는 장르 > ");
    String phoneNumber = ViewUtil.input("연락처 > ");*/

    private String userId;
    private String password;
    private String name;
    private String favoriteActor;
    private String favoriteGenre;
    private String phoneNumber;

    public SignUpRequest(String userId, String password, String name, String favoriteActor, String favoriteGenre, String phoneNumber) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.favoriteActor = favoriteActor;
        this.favoriteGenre = favoriteGenre;
        this.phoneNumber = phoneNumber;
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteActor() {
        return favoriteActor;
    }

    public String getFavoriteGenre() {
        return favoriteGenre;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
