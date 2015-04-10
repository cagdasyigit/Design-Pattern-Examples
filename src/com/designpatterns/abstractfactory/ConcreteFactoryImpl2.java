package com.designpatterns.abstractfactory;

public class ConcreteFactoryImpl2 implements AbstractFactory {

	@Override
	public Apple getApple() {
		// TODO Auto-generated method stub
		return new GoldenApple();
	}

	@Override
	public Pepper getPepper() {
		// TODO Auto-generated method stub
		return new GreenPepper();
	}
	
}
