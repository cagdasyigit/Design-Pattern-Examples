package com.designpatterns.builder;

public class OrderManager {
	
	private OrderBuilder builder;
	
	public Car createOrder(String brand, String model, String color, int hp){
		if(brand.equals("Ford")){
			builder = new FordOrderBuilder();
		}
		else if(brand.equals("Audi")){
			builder = new AudiOrderBuilder();
		}
		
		builder.setBrand(brand);
		builder.setModel(model);
		builder.setColor(color);
		builder.setHorsePower(hp);
		
		return builder.getCar();
	}
	
}
