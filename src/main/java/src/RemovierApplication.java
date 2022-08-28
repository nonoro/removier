package src;

import src.controller.HomeController;
import src.controller.LoginController;

public class RemovierApplication {
    public static void main(String[] args) {
        new HomeController().home();
        new LoginController().login();


    }
}
