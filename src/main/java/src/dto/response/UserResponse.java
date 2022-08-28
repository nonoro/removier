package src.dto.response;

import src.domain.Movie;
import src.domain.User;

import java.util.List;
import java.util.stream.Collectors;

public class UserResponse {
    private String id;
    // TODO : 최애배우를 넣을지 생각해보자
    private List<MovieResponse> recommendByGenreMovies;
    private List<MovieResponse> recommendByActorMovies;

    public UserResponse(String id, List<MovieResponse> recommendByGenreMovies, List<MovieResponse> recommendByActorMovies) {
        this.id = id;
        this.recommendByGenreMovies = recommendByGenreMovies;
        this.recommendByActorMovies = recommendByActorMovies;
    }

    public String getId() {
        return id;
    }


    public List<MovieResponse> getRecommendByGenreMoviesMovies() {
        return recommendByGenreMovies;
    }

    public List<MovieResponse> getRecommendByActorMovies() {
        return recommendByActorMovies;
    }

    public static UserResponse createFrom(User user, List<Movie> moviesGenre, List<Movie> moviesActor) {
        return new UserResponse(
                user.getLoginId(),
                moviesGenre.stream()
                        .map(MovieResponse::from)
                        .collect(Collectors.toList()),
                moviesActor.stream()
                        .map(MovieResponse::from)
                        .collect(Collectors.toList()));
    }

    public static UserResponse getFixture() {
        List<MovieResponse> test1 = List.of(new MovieResponse(1, "한산"), new MovieResponse(2, "헌트"));
        List<MovieResponse> test2 = List.of(new MovieResponse(3, "토이스토리"), new MovieResponse(4, "미션임파서블"));
        return new UserResponse("test", test1, test2);
    }
}
