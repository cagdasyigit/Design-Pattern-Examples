package com.designpatterns.builder;

public class FordOrderBuilder extends OrderBuilder {
	
	public FordOrderBuilder(){
		
	}

	public void setBrand(String brand){
		getCar().setBrand(new Brand(brand));
	}
	
	public void setModel(String model){
		getCar().setModel(new Model(model));
	}
	
	public void setColor(String color){
		getCar().setColor(color);
	}
	
	public void setHorsePower(int hp){
		getCar().setHorsePower(hp);
	}
}
