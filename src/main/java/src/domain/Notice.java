package src.domain;

import src.type.PK;

public class Notice {
    @PK
    private int id;

    private String title;
    private String contents;

    public Notice(int id, String title, String contents) {
        this.id = id;
        this.title = title;
        this.contents = contents;
    }
}
