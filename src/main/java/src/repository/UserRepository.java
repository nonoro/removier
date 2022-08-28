package src.repository;

import src.domain.User;

import java.util.Optional;

public interface UserRepository {
    void save(User user);

    Optional<User> findByUserId(String userId);
}
