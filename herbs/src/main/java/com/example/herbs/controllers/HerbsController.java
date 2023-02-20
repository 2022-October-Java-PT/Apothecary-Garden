package com.example.herbs.controllers;

import com.example.herbs.models.Herbs;
import com.example.herbs.models.Illness;
import com.example.herbs.repositories.HerbsRepo;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

@RestController
@CrossOrigin
public class HerbsController {
    @Resource
    private HerbsRepo herbsRepo;

    @GetMapping("/api/herbs")
    public Collection<Herbs> getHerbs(){
        return (Collection<Herbs>) herbsRepo.findAll();
    }

    @GetMapping("/api/herbs/HerbName/{name}")
    public Optional<Herbs> getHerb(@PathVariable String name) {
        return Optional.of(herbsRepo.findByName(name).get());
    }

    @GetMapping("/api/herbs/id/{id}")
    public Herbs getHerbById(@PathVariable Long id) {
        return herbsRepo.findById(id).get();
    }

    @GetMapping("api/herbs/findByLetter/{letter}")
    public List<Herbs> findHerbsByFirstLetter(@PathVariable("letter") String letter) {
        return herbsRepo.findByNameStartingWithIgnoreCase(letter);
    }

    @GetMapping("/api/herbs/illness/{illness}")
    public Collection<Herbs> getHerbsByIllness(@PathVariable String illness){
        Collection<Herbs> herbsList = (Collection<Herbs>) herbsRepo.findAll();
        Collection<Herbs> returnedHerbs = new ArrayList<>();
        for(Herbs H: herbsList) {
            Collection<Illness> illnessCheck = H.getIllnesses();
            for (Illness I : illnessCheck) {
                if (I.getName().equalsIgnoreCase(illness)) {
                    returnedHerbs.add(H);
                }
            }
        }
        return returnedHerbs;
    }

    @GetMapping("/api/herbs/herbSpotlight")
    public Optional<Herbs> getHerbSpotlight(){
        return herbsRepo.findById(ThreadLocalRandom.current().nextLong(32,49));
    }

//    @PostMapping("/api/herbs/add-herb")
//    public Collection<Herbs> addHerbs(@RequestBody String body) throws JSONException {
//        JSONObject newHerb = new JSONObject(body);
//        String herbName = newHerb.getString("name");
//        String herbDescription = newHerb.getString("description");
//        String herbFact = newHerb.getString("fact");
//        String herbPicture = newHerb.getString("picture");
//        String herbScience = newHerb.getString("science");
//        Collection<Illness> herbIllnesses= newHerb.getString("illnesses");
//        ArrayList<String> herbSideEffects = newHerb.getString("sideEffects");
//        Optional<Herbs> herbsToAddOpt = herbsRepo.findByName(herbName);
//        if(herbsToAddOpt.isEmpty()){
//            Herbs herbsToAdd = new Herbs(herbName, herbDescription, herbFact, herbPicture,
//                    herbScience, herbIllnesses, herbSideEffects);
//            herbsRepo.save(herbsToAdd);
//        }
//        return (Collection<Herbs>) herbsRepo.findAll();
//    }


}
