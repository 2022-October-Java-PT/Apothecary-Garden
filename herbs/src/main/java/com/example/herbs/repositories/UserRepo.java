package com.example.herbs.repositories;

import com.example.herbs.models.AppUser;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepo extends CrudRepository<AppUser, Long> {

    Optional<AppUser> findByUserNameIgnoreCase(String userName);
    Optional<AppUser> findByUserPassword(String password);
}
