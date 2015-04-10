package com.designpatterns.abstractfactory;

public class Bazaar {

	public static void main(String[] args){
		// Create First Factory And Get Objects
		AbstractFactory foodFactory = new ConcreteFactoryImpl();
		Apple apple = foodFactory.getApple();
		Pepper pepper = foodFactory.getPepper();
		System.out.println(apple.getType() + " and " + pepper.getType() + " foods are exists in first store.");		

		// Create Second Factory And Get Objects
		foodFactory = new ConcreteFactoryImpl2();
		apple = foodFactory.getApple();
		pepper = foodFactory.getPepper();
		System.out.println(apple.getType() + " and " + pepper.getType() + " foods are exists in second store.");
	}
	
}
