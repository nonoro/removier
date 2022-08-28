package src.view;

import src.type.AdminHomeMenuCode;
import src.utils.ViewUtil;

public class AdminView {

    public static String adminHome() {
        ViewUtil.printMessage("=================== 관리자 화면입니다 ===================");
        ViewUtil.printMessage(AdminHomeMenuCode.getItems(1));

        return ViewUtil.input("번호를 입력하세요 > ");
    }
}
