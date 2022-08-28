package src.type;

public enum UserHomeMenuCode {
    LATEST_MOVIE(1, "최신영화"),
    SEARCH_MOVIE(2, "영화검색"),
    NOTICE(3, "공지사항"),
    MY_PAGE(4, "MyPage"),
    EXIT(5, "종료");

    int code;
    String name;

    UserHomeMenuCode(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

}
