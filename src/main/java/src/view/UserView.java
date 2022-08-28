package src.view;

import src.dto.response.MovieResponse;
import src.dto.response.UserResponse;
import src.type.UserHomeMenuCode;
import src.utils.ViewUtil;

import java.util.List;

public class UserView {

    public static final int DEFAULT_MENU_SIZE = 4;

    public static void userHomeAfterLogin(UserResponse user) {
        ViewUtil.printMessage(ViewConst.banner);
        showRecommendMovies(user);

        showMenu();
    }

    private static void showMenu() {
        UserHomeMenuCode[] menuCodes = UserHomeMenuCode.values();

        int totalPage = menuCodes.length / DEFAULT_MENU_SIZE;
        int offset = 0;

        if (menuCodes.length % DEFAULT_MENU_SIZE > 0) {
            totalPage++;
        }

        for (int page = 1; page <= totalPage; page++) {
            int offsetSize = page * DEFAULT_MENU_SIZE;

            if (page == totalPage) {
                offsetSize = menuCodes.length;
            }

            for (int i = offset; i < offsetSize; i++) {
                System.out.print(menuCodes[i].getCode() + ". " + menuCodes[i].getName() + " ");
                offset++;
            }

            ViewUtil.newLine();
        }
    }

    private static void showRecommendMovies(UserResponse user) {
        List<MovieResponse> recommendGenreMovies = user.getRecommendByGenreMoviesMovies();
        List<MovieResponse> recommendByActorMovies = user.getRecommendByActorMovies();
        String message = "======= < " + user.getId() + "님의 취향저격 Best 콘텐츠 > =======";
        ViewUtil.printMessage(message);
        ViewUtil.printMessage(getStringFromMovieList(recommendGenreMovies, " / "));
        ViewUtil.printMessage("===== < 최애배우 출연 Best 콘텐츠 > =============");
        ViewUtil.printMessage(getStringFromMovieList(recommendByActorMovies, " / "));
        ViewUtil.newLine();
    }

    private static String getStringFromMovieList(List<MovieResponse> movieList, String delimiter) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < movieList.size(); i++) {
            result.append(movieList.get(i).getTitle());
            if (i != movieList.size() - 1) {
                result.append(delimiter);
            }
        }

        return result.toString();
    }


}
