package com.cruelengine.dairyfarm.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.cruelengine.dairyfarm.persistence.Animal;

interface AnimalRepository extends ReactiveCrudRepository<Animal, String>{
}
