package com.cruelengine.dairyfarm.models;

import com.cruelengine.dairyfarm.enums.AccountType;

public class User extends Worker{
	
	private AccountType accountType;

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public User(String name, long updateTime, long createdTime, String expenses, String salary,String dfId ,
			AccountType accountType) {
		super(name, updateTime, createdTime, expenses, salary , dfId);
		this.accountType = accountType;
	}
	
	
}
