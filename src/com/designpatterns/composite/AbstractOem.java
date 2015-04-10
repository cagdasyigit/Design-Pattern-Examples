package com.designpatterns.composite;

public abstract class AbstractOem {
	
	private String model;
	
	private String brand;
	
	private int price;
	
	public AbstractOem(String model, String brand, int price){
		this.model = model;
		this.brand = brand;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
