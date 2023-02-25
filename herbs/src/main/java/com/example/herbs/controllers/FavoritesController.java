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
//import java.util.Collection;
//import java.util.Optional;

@RestController
@CrossOrigin
public class FavoritesController {

    @Resource
    private FavoritesRepo favoritesRepo;

    @Resource
    private UserRepo userRepo;

    @Resource
    private HerbsRepo herbsRepo;

    @PostMapping("/api/{userName}/add-user-favorites")
    public Favorites createUserFavorites(@PathVariable String userName, @RequestBody String body){
        JSONObject newFavorites = new JSONObject(body);
        String favoritesUser = newFavorites.getString("appUser");
        String favoriteHerbs = newFavorites.getString("favorites");
        AppUser user = userRepo.findByUserNameIgnoreCase(userName).get();
        Favorites favoriteToAdd = new Favorites(user);
        favoritesRepo.save(favoriteToAdd);
        return favoritesRepo.findByAppUser(userRepo.findByUserNameIgnoreCase(userName).get()).get();
    }


    @DeleteMapping("/api/{userName}/favorites/{id}/delete-favorite-herbs")
    public Favorites deleteFavoriteHerbs(@PathVariable String userName, @PathVariable Long id) throws JSONException {
        Favorites favoritesToEdit = favoritesRepo.findByAppUser(userRepo.findByUserNameIgnoreCase(userName).get()).get();
        Herbs herbToRemove = herbsRepo.findById(id).get();
        if(favoritesToEdit.getFavorites().contains(herbToRemove)){
            favoritesToEdit.getFavorites().remove(herbToRemove);
        }
//        Optional<Favorites> favoriteHerbsToRemoveOpt = favoritesRepo.findById(id);
//        favoriteHerbsToRemoveOpt.ifPresent(Favorite -> favoritesRepo.deleteById(id));
//        Optional<AppUser> user = userRepo.findByUserNameIgnoreCase(userName);
        return favoritesRepo.findByAppUser(userRepo.findByUserNameIgnoreCase(userName).get()).get();

    }


    @PutMapping("/api/{userName}/favorites/{id}/edit-favorite-herb")
    public Favorites editFavoriteHerb(@PathVariable String userName, @PathVariable Long id) throws JSONException {
//        JSONObject editFavorite = new JSONObject(body);
//        String favoriteHerb = editFavorite.getString("favorites");
        Favorites favoriteToEdit = favoritesRepo.findByAppUser(userRepo.findByUserNameIgnoreCase(userName).get()).get();
        Herbs herbToAdd = herbsRepo.findById(id).get();
        if(!favoriteToEdit.getFavorites().contains(herbToAdd)){
            favoriteToEdit.getFavorites().add(herbToAdd);
        }
//        AppUser user = userRepo.findByUserNameIgnoreCase(userName).get();
//        Optional<Favorites> favoritesHerbToEdit  = favoritesRepo.findById(id);
//        favoritesHerbToEdit.get().changeFavoriteHerb(favoriteHerb);
//        Herbs herbsToAdd = user.getUserFavorites();
//        FavoritesRepo.save(favoritesHerbToEdit.get());
        return favoritesRepo.findByAppUser(userRepo.findByUserNameIgnoreCase(userName).get()).get();
    }




}
