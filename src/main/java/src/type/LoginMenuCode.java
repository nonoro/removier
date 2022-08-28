package src.type;

public enum LoginMenuCode {
    LOGIN(1, "로그인"),
    SIGN_UP(2, "회원가입"),
    EXIT(3, "종료");

    int code;
    String name;

    LoginMenuCode(int code, String name) {
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
        LoginMenuCode[] values = LoginMenuCode.values();
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
