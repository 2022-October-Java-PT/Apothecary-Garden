package com.example.herbs.controllers;

import com.example.herbs.models.AppUser;
import com.example.herbs.models.Favorites;
import com.example.herbs.models.Herbs;
import com.example.herbs.repositories.FavoritesRepo;
import com.example.herbs.repositories.HerbsRepo;
import com.example.herbs.repositories.UserRepo;
import org.json.JSONException;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@CrossOrigin
public class FavoritesController {

    @Resource
    private FavoritesRepo favoritesRepo;

    @Resource
    private UserRepo userRepo;

    @Resource
    private HerbsRepo herbsRepo;

    @GetMapping("/api/{userName}/favorites")
    public Collection<Herbs> getUserFavorites(@PathVariable String userName) {
        return (Collection<Herbs>) favoritesRepo.findByAppUser(userRepo.findByUserNameIgnoreCase(userName).get()).get().getFavorites();
    }

    @GetMapping("/api/{userName}/favorites/{herbName}")
    public <Optional>Herbs getFavoriteHerb(@PathVariable String userName, @PathVariable String herbName) {
        AppUser loggedInUser = userRepo.findByUserNameIgnoreCase(userName).get();
        Favorites userFavorites = favoritesRepo.findByAppUser(loggedInUser).get();
        if (userFavorites.getFavorites().contains(herbsRepo.findByName(herbName).get())) {
            return (
                    herbsRepo.findByName(herbName).get());
        } else {
            return null;
        }
    }

    @PostMapping("/api/{userName}/add-user-favorites")
    public Favorites createUserFavorites(@PathVariable String userName) {
        AppUser user = userRepo.findByUserNameIgnoreCase(userName).get();
        Favorites favoriteToAdd = new Favorites(user);
        favoritesRepo.save(favoriteToAdd);
        userRepo.save(userRepo.findByUserNameIgnoreCase(userName).get());
        return favoritesRepo.findByAppUser(userRepo.findByUserNameIgnoreCase(userName).get()).get();
    }

    @DeleteMapping("/api/{userName}/favorites/{id}/delete-favorite-herbs")
    public Favorites deleteFavoriteHerbs(@PathVariable String userName, @PathVariable Long id) throws JSONException {
        Favorites favoritesToEdit = favoritesRepo.findByAppUser(userRepo.findByUserNameIgnoreCase(userName).get())
                .get();
        Herbs herbToRemove = herbsRepo.findById(id).get();
        if (favoritesToEdit.getFavorites().contains(herbToRemove)) {
            favoritesToEdit.getFavorites().remove(herbToRemove);
        }
        favoritesRepo.save(favoritesRepo.findByAppUser(userRepo.findByUserNameIgnoreCase(userName).get()).get());
        return favoritesRepo.findByAppUser(userRepo.findByUserNameIgnoreCase(userName).get()).get();

    }

    @PutMapping("/api/{userName}/favorites/{id}/edit-favorite-herb")
    public Favorites editFavoriteHerb(@PathVariable String userName, @PathVariable Long id) throws JSONException {
        Favorites favoriteToEdit = favoritesRepo.findByAppUser(userRepo.findByUserNameIgnoreCase(userName).get()).get();
        Herbs herbToAdd = herbsRepo.findById(id).get();
        if (!favoriteToEdit.getFavorites().contains(herbToAdd)) {
            favoriteToEdit.getFavorites().add(herbToAdd);
        }
        favoritesRepo.save(favoritesRepo.findByAppUser(userRepo.findByUserNameIgnoreCase(userName).get()).get());
        return favoritesRepo.findByAppUser(userRepo.findByUserNameIgnoreCase(userName).get()).get();
    }

}
