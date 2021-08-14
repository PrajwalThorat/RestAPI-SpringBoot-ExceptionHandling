package org.stackroute.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Computer {
	
	@Id
	private int computerId;
	private String computerModel;
	private String computerBrand;
	private String computerDetails;
	
	public Computer() {
		
	}

	public int getComputerId() {
		return computerId;
	}

	public void setComputerId(int computerId) {
		this.computerId = computerId;
	}

	public String getComputerModel() {
		return computerModel;
	}

	public void setComputerModel(String computerModel) {
		this.computerModel = computerModel;
	}

	public String getComputerBrand() {
		return computerBrand;
	}

	public void setComputerBrand(String computerBrand) {
		this.computerBrand = computerBrand;
	}

	public String getComputerDetails() {
		return computerDetails;
	}

	public void setComputerDetails(String computerDetails) {
		this.computerDetails = computerDetails;
	}
	
	

}
