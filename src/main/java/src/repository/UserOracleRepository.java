package src.repository;

import src.domain.User;

import java.util.Optional;

public class UserOracleRepository implements UserRepository {

    @Override
    public void save(User user) {
        // TODO : SQL 로직을 구현
    }

    @Override
    public Optional<User> findByUserId(String userId) {
        // TODO : SQL 로직을 구현

        return Optional.empty();
    }
}
