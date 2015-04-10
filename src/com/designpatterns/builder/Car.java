package com.designpatterns.builder;

public class Car {
	
	private Brand brand = null;
	
	private Model model = null;
	
	private String color = "";
	
	private int horsePower = 0;
	
	public Car(){
		
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	
	public String ToString(){
		return this.brand.getBrand() + ", " + this.model.getModel() + ", " + this.color + ", " + this.horsePower + " HP";
	}
	
}
