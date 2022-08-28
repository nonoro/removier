package src.view;

import src.dto.request.LoginRequest;
import src.utils.ViewUtil;

public class LoginView {
    public static LoginRequest login() {
        ViewUtil.printMessage("==================================================================");
        ViewUtil.printMessage("======================= 로그인을 해주세요 ========================");
        ViewUtil.printMessage("==================================================================");

        String id = ViewUtil.input("ID > ");
        String password = ViewUtil.input("PW > ");

        return new LoginRequest(id, password);
    }
}
