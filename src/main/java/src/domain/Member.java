package src.domain;

import src.type.MemberType;
import src.type.PK;

public abstract class Member {
    @PK
    private int id;

    private String name;
    private String loginId;
    private String password;
    private MemberType role;

    public Member(int id, String name, String loginId, String password, MemberType role) {
        this.id = id;
        this.name = name;
        this.loginId = loginId;
        this.password = password;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLoginId() {
        return loginId;
    }

    public String getPassword() {
        return password;
    }

    public MemberType getRole() {
        return role;
    }
}
