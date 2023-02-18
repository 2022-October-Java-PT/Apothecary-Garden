package com.example.herbs.repositories;

import com.example.herbs.models.Illness;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IllnessRepo extends CrudRepository<Illness, Long> {
    List<Illness> findByNameStartingWithIgnoreCase(String letter);
}
