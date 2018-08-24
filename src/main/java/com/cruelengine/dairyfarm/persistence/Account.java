package com.cruelengine.dairyfarm.persistence;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
	
	@Id
	private String dfId;
	private int accountType;
	private String userName;
	private String password;
	
	public String getDfId() {
		return dfId;
	}
	public void setDfId(String dfId) {
		this.dfId = dfId;
	}
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
