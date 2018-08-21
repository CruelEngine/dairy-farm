package com.cruelengine.dairyfarm.models;

import com.cruelengine.dairyfarm.enums.HealthStatus;
import com.cruelengine.dairyfarm.enums.Type;

public class Animal {

	private Type type;
	private String id;
	private HealthStatus healthStatus;
	private String[] medicalRecords;
	
	public Animal(Type type, String id, HealthStatus healthStatus) {
		super();
		this.type = type;
		this.id = id;
		this.healthStatus = healthStatus;
	}
		
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public HealthStatus getHealthStatus() {
		return healthStatus;
	}
	public void setHealthStatus(HealthStatus healthStatus) {
		this.healthStatus = healthStatus;
	}

	public String[] getMedicalRecords() {
		return medicalRecords;
	}

	public void setMedicalRecords(String[] medicalRecords) {
		this.medicalRecords = medicalRecords;
	}

	
	
}
