package com.example.herbs;

import com.example.herbs.repositories.HerbsRepo;
import com.example.herbs.repositories.IllnessRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private HerbsRepo herbsRepo;

    @Resource
    private IllnessRepo illnessRepo;

    @Override
    public void run(String... args) throws Exception {

    }
}
