package com.cruelengine.dairyfarm.repository;

import org.springframework.data.repository.CrudRepository;

import com.cruelengine.dairyfarm.persistence.Worker;


public interface WorkerRepository extends CrudRepository<Worker, String>{

	
}
