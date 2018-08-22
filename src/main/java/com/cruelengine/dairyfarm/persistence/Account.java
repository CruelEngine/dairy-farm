package com.cruelengine.dairyfarm.persistence;

import javax.persistence.Entity;

@Entity
public class Account {
	
	private int accountType;
	private String userName;
	private String password;
	public int getAccountType() {
		return accountType;
	}
	public void setAccountType(int accountType) {
		this.accountType = accountType;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
