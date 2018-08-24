package com.cruelengine.dairyfarm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cruelengine.dairyfarm.persistence.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, String>{
	
}
