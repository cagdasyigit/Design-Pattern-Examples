package com.designpatterns.builder;

public class AudiOrderBuilder extends OrderBuilder {
	
	public AudiOrderBuilder(){
		
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
