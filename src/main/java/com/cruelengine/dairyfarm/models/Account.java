package com.cruelengine.dairyfarm.models;

public class Account {
	private int accountType;
	private String username;
	private String password;
	
	public Account(String username , String password , int accountType) {
		this.username = username;
		this.password = password;
		this.accountType = accountType;
	}
	
	public int getAccountType() {
		return accountType;
	}
	public void setAccountType(int accountType) {
		this.accountType = accountType;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
