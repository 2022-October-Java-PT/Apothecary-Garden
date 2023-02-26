package com.example.herbs.repositories;

import com.example.herbs.models.AppUser;
import com.example.herbs.models.Favorites;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface FavoritesRepo  extends CrudRepository<Favorites,Long> {

    Optional<Favorites> findByAppUser(AppUser userName);
}
