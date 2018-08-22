package com.cruelengine.diaryfarm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.cruelengine.dairyfarm.persistence.Animal;

interface AnimalRepository extends CrudRepository<Animal, String>{
	@Query("Select a from Animal a where a.id= :animalId")
	List<Animal> getAnimalByHealthStatus(@Param("animalId") String animalId);
}
