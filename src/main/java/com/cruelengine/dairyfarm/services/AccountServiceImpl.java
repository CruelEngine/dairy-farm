package com.cruelengine.dairyfarm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruelengine.dairyfarm.persistence.Account;
import com.cruelengine.dairyfarm.repository.AccountRepository;


@Service
public class AccountServiceImpl implements AccountService {

	
	@Autowired
	AccountRepository ar;
	
	@Override
	public List<Account> findAll() {
		List<Account> accountList = (List<Account>) ar.findAll();
		return accountList;
	}

	@Override
	public Account findAccount(String dfId) {
//		Account account = ar.findById(dfId)
		return null;
	}

	@Override
	public Account findAccountByUserName(String userName) {
		return null;
	}

	@Override
	public List<Account> findAllByType(int type) {
		return null;
	}

}
