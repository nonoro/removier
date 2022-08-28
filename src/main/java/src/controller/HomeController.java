package src.controller;

import src.domain.Movie;
import src.domain.User;
import src.dto.request.LoginRequest;
import src.dto.response.UserResponse;
import src.service.UserService;
import src.service.MovieService;
import src.service.impl.MovieServiceImpl;
import src.service.impl.UserServiceImpl;
import src.type.LoginMenuCode;
import src.view.HomeView;
import src.view.LoginView;
import src.view.UserView;

import java.util.List;

public class HomeController {
    private final MovieService movieService = new MovieServiceImpl();
    private final UserService userService = new UserServiceImpl();

    public void home() {
        int selectedCode = Integer.parseInt(HomeView.home());

        if (LoginMenuCode.LOGIN.getCode() == selectedCode) {
            LoginRequest request = LoginView.login();

            User loginUser = userService.login(request.getId(), request.getPassword());
            List<Movie> moviesByGenre = movieService.getMoviesByGenre(loginUser.getFavoriteGenre());
            List<Movie> moviesByActor = movieService.getMoviesByActor(loginUser.getFavoriteActor());

            UserResponse response = UserResponse.createFrom(loginUser, moviesByGenre, moviesByActor);

            UserView.userHomeAfterLogin(response);

        } else if (LoginMenuCode.SIGN_UP.getCode() == selectedCode) {
            // TODO : SignUpRequest를 InputView로 부터 받아오기

            // userService.join(request);



        } else if (LoginMenuCode.EXIT.getCode() == selectedCode) {


        } else {

        }
    }
}
