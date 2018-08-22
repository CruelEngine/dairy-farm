package com.cruelengine.dairyfarm.utils;

public class UserIdGenerator {
	
	private static Integer userId = 0;
	private String projectPrefix = "df";
	private String seperator = "-#-";
	
	private static UserIdGenerator uig;
	
	public UserIdGenerator() {
		uig = this;
	}
	
	public UserIdGenerator getInstance() {
		return uig;
	}
	
	public String getUserId() {
		return String.valueOf(userId++);
	}
	
	
	public String getGlobalId(){
		StringBuilder globalId = new StringBuilder();
		globalId.append(projectPrefix);
		globalId.append(seperator);
		globalId.append(userId);
		
		return globalId.toString();
	}
	
	
	
}
