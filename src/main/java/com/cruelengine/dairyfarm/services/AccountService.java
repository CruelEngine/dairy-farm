package com.cruelengine.dairyfarm.services;

import java.util.List;

import com.cruelengine.dairyfarm.persistence.Account;

public interface AccountService {
	
	public List<Account> findAll();
	public Account findAccount(String dfId);
	public Account findAccountByUserName(String userName);
	public List<Account> findAllByType(int type);
	
	
}
