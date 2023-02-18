package com.example.herbs.controllers;

import com.example.herbs.models.Illness;
import com.example.herbs.repositories.IllnessRepo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
public class IllnessController {
    @Resource
    private IllnessRepo illnessRepo;

    @GetMapping("api/illness/findByLetter/{letter}")
    public List<Illness> findIllnessByFirstLetter(@PathVariable("letter") String letter) {
        return illnessRepo.findByNameStartingWithIgnoreCase(letter);
    }
}
