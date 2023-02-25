package com.example.herbs.controllers;
import com.example.herbs.models.AppUser;
import com.example.herbs.models.Favorites;
import com.example.herbs.models.Herbs;
import com.example.herbs.repositories.FavoritesRepo;
import com.example.herbs.repositories.HerbsRepo;
import com.example.herbs.repositories.UserRepo;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Optional;

@RestController
@CrossOrigin
public class FavoritesController {

    @Resource
    private FavoritesRepo favoritesRepo;

    @Resource
    private UserRepo userRepo;

    @Resource
    private HerbsRepo herbsRepo;


    @DeleteMapping("/api/{userName}/favorites/{id}/delete-favorite-herbs")
    public Collection<Favorites> deleteFavoriteHerbs(@PathVariable String userName, @PathVariable Long id) throws JSONException {
        Optional<Favorites> favoriteHerbsToRemoveOpt = favoritesRepo.findById(id);
        favoriteHerbsToRemoveOpt.ifPresent(Favorite -> favoritesRepo.deleteById(id));
        Optional<AppUser> user = userRepo.findByUserNameIgnoreCase(userName);
        return (Collection<Favorites>) user.get().getUserFavorites();

    }


    @PutMapping("/api/{userName}/favorites/{id}/edit-favorite-herb")
    public Collection<Favorites> editFavoriteHerb(@PathVariable String userName, @PathVariable Long id, @RequestBody String body) throws JSONException {
        JSONObject editFavorite = new JSONObject(body);
        String favoriteHerb = editFavorite.getString("favoriteHerb");
        AppUser user = userRepo.findByUserNameIgnoreCase(userName).get();
        Optional<Favorites> favoritesHerbToEdit  = favoritesRepo.findById(id);
//        favoritesHerbToEdit.get().changeFavoriteHerb(favoriteHerb);
        Herbs herbsToAdd = user.getUserFavorites();
        FavoritesRepo.save(favoritesHerbToEdit.get());
        return AppUser.getUserFavorites();
    }




}
