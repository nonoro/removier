package src.view;

import src.type.LoginMenuCode;
import src.utils.ViewUtil;

public class HomeView {
    public static String home() {
        ViewUtil.printMessage(ViewConst.banner);
        StringBuilder loginMenu = new StringBuilder();
        loginMenu.append("================= ");
        ViewUtil.printMessage(LoginMenuCode.getItems(3));
        loginMenu.append("==================");
        ViewUtil.printMessage(loginMenu);

        return ViewUtil.input("번호를 입력하세요 > ");
    }
}
