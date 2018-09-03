package com.cruelengine.dairyfarm.repository;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.cruelengine.dairyfarm.models.Account;

import reactor.core.publisher.Mono;

@Repository
public interface AccountRepository extends ReactiveCrudRepository<Account, String>{
	
	@Query("{'username' : ?0}")
	Mono<Account> findByName();
	
}
