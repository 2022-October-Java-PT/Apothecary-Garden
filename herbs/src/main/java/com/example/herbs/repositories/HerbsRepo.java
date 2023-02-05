package com.example.herbs.repositories;

import com.example.herbs.models.Herbs;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.Optional;

public interface HerbsRepo extends CrudRepository<Herbs, Long> {

    Optional<Herbs> findByName(String name);

    Collection<Herbs> findByIllnesses(String illness);
}
