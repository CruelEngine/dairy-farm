package com.cruelengine.dairyfarm.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.cruelengine.dairyfarm.models.Account;

@Repository
public interface AccountRepository extends ReactiveCrudRepository<Account, String>{
	
	Account findByName();
	
}
