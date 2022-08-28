package src.service;

import src.domain.User;
import src.dto.request.SignUpRequest;

public interface UserService {
    User login(String userId, String password);

    void join(SignUpRequest request);

    User findUser(String userId);
}
