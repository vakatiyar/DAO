package com.sopra.carRentals;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * 
 */
@Entity
public class Cars {
	
	@Id
	public int carNo;
	
	public String carCompany;
	
	public String carModel;
	
	public int carCapacity;
	
	public int quantity;

	public int getCarNo() {
		return carNo;
	}



	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}



	public String getCarCompany() {
		return carCompany;
	}



	public void setCarCompany(String carCompany) {
		this.carCompany = carCompany;
	}



	public String getCarModel() {
		return carModel;
	}



	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}



	public int getCarCapacity() {
		return carCapacity;
	}



	public void setCarCapacity(int carCapacity) {
		this.carCapacity = carCapacity;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	@Override
	public String toString() {
		return "Cars [carNo=" + carNo + ", carCompany=" + carCompany + ", carModel=" + carModel + ", carCapacity="
				+ carCapacity + ", quantity=" + quantity + "]";
	}
	
	

}
