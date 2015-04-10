package com.designpatterns.factory;

public abstract class AbstractCar {

	private String brand;
	
	private String model;
	
	private int horsePower;
	
	public AbstractCar(String b, String m, int hp){
		setBrand(b);
		setModel(m);
		setHorsePower(hp);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	
}
