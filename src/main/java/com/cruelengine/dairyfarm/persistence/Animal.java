package com.cruelengine.dairyfarm.persistence;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Animal {

	@Id
	private String id;
	
	private String type;
	
	private String healthStatus;
	
	private String[] medicalRecords;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getHealthStatus() {
		return healthStatus;
	}
	public void setHealthStatus(String healthStatus) {
		this.healthStatus = healthStatus;
	}
	public String[] getMedicalRecords() {
		return medicalRecords;
	}
	public void setMedicalRecords(String[] medicalRecords) {
		this.medicalRecords = medicalRecords;
	}
}
