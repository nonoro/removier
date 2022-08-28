package src.type;

public enum MovieGenreCode {
    MELO_ROMANCE(1, "멜로/로맨스"),
    COMEDY(2, "코미디"),
    ROMANTIC_COMEDY(3, "로맨틱 코미디"),
    ACTION(4, "액션"),
    THRILLER(5, "스릴러"),
    MISTERY(6, "미스터리"),
    HORROR(7, "공포"),
    SF(8, "공상과학"),
    FANTASY(9, "판타지"),
    DRAMA(10, "드라마"),
    ANIMAITON(11, "애니메이션"),
    CRIMINAL(12, "범죄"),
    FAMILLY(13, "가족");

    int code;
    String name;

    MovieGenreCode(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static String getItems(int defaultSize) {
        MovieGenreCode[] values = MovieGenreCode.values();
        StringBuilder result = new StringBuilder();

        int totalPage = values.length / defaultSize;
        int offset = 0;

        if (values.length % defaultSize > 0) {
            totalPage++;
        }

        for (int page = 1; page <= totalPage; page++) {
            int offsetSize = page * defaultSize;

            if (page == totalPage) {
                offsetSize = values.length;
            }

            for (int i = offset; i < offsetSize; i++) {
                result.append(values[i].getCode()).append(". ").append(values[i].getName()).append(" ");
                offset++;
            }

            result.append("\n");
        }

        return result.toString();
    }
}
