package src.domain;

import src.type.MemberType;

public class Admin extends Member {

    public Admin(int id, String name, String loginId, String password) {
        super(id, name, loginId, password, MemberType.ADMIN);
    }
}
