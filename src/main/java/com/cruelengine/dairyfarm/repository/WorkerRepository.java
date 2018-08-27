package com.cruelengine.dairyfarm.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.cruelengine.dairyfarm.persistence.Worker;

@Repository
public interface WorkerRepository extends ReactiveCrudRepository<Worker, String>{

	
}
