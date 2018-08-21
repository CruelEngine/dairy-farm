package com.cruelengine.dairyfarm.models;

public class Worker {

	private String name;
	private long updateTime;
	private long createdTime;
	private String expenses;
	private String salary;
	
	public Worker(String name, long updateTime, long createdTime, String expenses, String salary) {
		this.name = name;
		this.updateTime = updateTime;
		this.createdTime = createdTime;
		this.expenses = expenses;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(long updateTime) {
		this.updateTime = updateTime;
	}
	public long getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(long createdTime) {
		this.createdTime = createdTime;
	}
	public String getExpenses() {
		return expenses;
	}
	public void setExpenses(String expenses) {
		this.expenses = expenses;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	
}
