package com.example.herbs.controllers;

import com.example.herbs.models.Herbs;
import com.example.herbs.repositories.HerbsRepo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Optional;

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

//    @GetMapping("/api/herbs/illness/{illness}")
//    public Collection<Herbs> getHerbsByIllness(@PathVariable String illness){
//
//        return null;
//    }
}
