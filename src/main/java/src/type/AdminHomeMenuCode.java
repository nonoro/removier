package src.type;

public enum AdminHomeMenuCode {
    SEARCH_USER(1, "회원정보 조회하기"),
    CREATE_NOTICE(2, "공지사항 작성하기"),
    UPDATE_NOTICE(3, "공지사항 수정하기"),
    EXIT(4, "종료");

    int code;
    String name;

    AdminHomeMenuCode(int code, String name) {
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
        AdminHomeMenuCode[] values = AdminHomeMenuCode.values();
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
