package com.example.herbs.repositories;

import com.example.herbs.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepo extends CrudRepository<User, Long> {

    Optional<User> findByNameStartingWithIgnoreCase( String userName);
    Optional<User> findByPassword(String password);
}
