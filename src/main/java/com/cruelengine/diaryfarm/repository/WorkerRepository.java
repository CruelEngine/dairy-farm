package com.cruelengine.diaryfarm.repository;

import org.springframework.data.repository.CrudRepository;

import com.cruelengine.dairyfarm.models.Worker;

public interface WorkerRepository extends CrudRepository<Worker, String>{

	
}
