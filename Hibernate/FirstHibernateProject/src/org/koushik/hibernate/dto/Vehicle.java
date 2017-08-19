package org.koushik.hibernate.dto;

import javax.persistence.Embeddable;

@Embeddable
public class Vehicle {

	private String vin;
	private String model;
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
}
