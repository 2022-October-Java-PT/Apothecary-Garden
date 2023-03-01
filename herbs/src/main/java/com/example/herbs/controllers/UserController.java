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
public class UserController {

    @Resource
    private UserRepo userRepo;

    @Resource
    private HerbsRepo herbsRepo;

    @Resource
    private FavoritesRepo favoritesRepo;

    @GetMapping("/api/user/{userName}")
    public Optional<AppUser> getUser(@PathVariable String userName) {
        return userRepo.findByUserNameIgnoreCase(userName);
    }

    @PostMapping("/api/user/new-user")
    public Collection<AppUser> newUser(@RequestBody String body) throws JSONException {
        JSONObject newUser = new JSONObject(body);
        String userName = newUser.getString("userName");
        String userPassword = newUser.getString("userPassword");
        Optional<AppUser> optNewUser = userRepo.findByUserNameIgnoreCase(userName);
        if(optNewUser.isEmpty()){
            AppUser userToAdd = new AppUser(userName, userPassword);
            userRepo.save(userToAdd);
        }
        return (Collection<AppUser>) userRepo.findAll();
    }

    @PutMapping("/api/users/{userName}/select-user")
    public Collection<AppUser> selectUser(@PathVariable String userName, @RequestBody String body) throws JSONException{
        JSONObject newUser = new JSONObject(body);
        String username = newUser.getString("userName");
        String userPassword = newUser.getString("password");
        Optional<AppUser> optUserToSelect = userRepo.findByUserNameIgnoreCase(userName);
        Optional<AppUser> optPasswordToSelect = userRepo.findByUserPassword(userPassword);
        while(optUserToSelect.isPresent()){
            optUserToSelect.get();
            userRepo.save(optUserToSelect.get());
        }
        while(optPasswordToSelect.isPresent()){
            optUserToSelect.get();
            userRepo.save(optPasswordToSelect.get());
        }
        return (Collection<AppUser>) userRepo.findAll();
    }

    @DeleteMapping("/api/user/{userName}/delete-user")
    public Collection<AppUser> deleteUser(@PathVariable String userName) throws JSONException{
        Optional<AppUser> userToRemoveOpt = userRepo.findByUserNameIgnoreCase(userName);
        userToRemoveOpt.ifPresent(username -> userRepo.delete(username));
        return (Collection<AppUser>) userRepo.findAll();
    }

    @GetMapping("/api/collection/herbs")
    public Collection<Herbs> getAllHerbs() throws JSONException{
        return (Collection<Herbs>) herbsRepo.findAll();
    }





//    @GetMapping("/api/{userName}/herbs")
//    public Collection<Herbs> getHerbs(@PathVariable String userName){
//        Optional<User> user = userRepo.findByUserNameIgnoreCase(userName);
//        return user.get().getFavorites();
//    }


}
