package com.cruelengine.dairyfarm.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.cruelengine.dairyfarm.models.Animal;

interface AnimalRepository extends ReactiveCrudRepository<Animal, String>{
}
