package com.example.herbs.repositories;

import com.example.herbs.models.Illness;
import org.springframework.data.repository.CrudRepository;

public interface IllnessRepo extends CrudRepository<Illness, Long> {

}
