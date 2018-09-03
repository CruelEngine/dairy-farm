package com.cruelengine.dairyfarm.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.cruelengine.dairyfarm.models.Worker;

@Repository
public interface WorkerRepository extends ReactiveCrudRepository<Worker, String>{

	
}
