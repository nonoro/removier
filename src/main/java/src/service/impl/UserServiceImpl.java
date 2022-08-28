package src.service.impl;

import src.domain.User;
import src.dto.request.SignUpRequest;
import src.repository.UserOracleRepository;
import src.repository.UserRepository;
import src.service.UserService;
import src.type.MemberType;
import src.type.MovieGenreCode;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository = new UserOracleRepository();

    @Override
    public User login(String userId, String password) {
        // TODO : userId와 일치하는 회원정보를 DB 에서 찾아서 없으면 에러 처리
        User user = userRepository.findByUserId("test").orElseThrow();

        // TODO : 없으면 에러



        // TODO : 있으면 password를 비교
        // TODO : 틀리면 에러
        // TODO : 일치하면 User 반환



        return new User(1,
                "권규정",
                "test",
                "test",
                MemberType.USER,
                "010-1234-1234",
                "김영철",
                MovieGenreCode.SF);
    }

    @Override
    public void join(SignUpRequest request) {
        // request.getUserId() 중복인지

    }

    @Override
    public User findUser(String userId) {
        return null;
    }
}
