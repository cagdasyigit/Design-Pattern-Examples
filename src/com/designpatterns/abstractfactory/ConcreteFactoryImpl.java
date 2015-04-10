package com.designpatterns.abstractfactory;

public class ConcreteFactoryImpl implements AbstractFactory {

	@Override
	public Apple getApple() {
		// TODO Auto-generated method stub
		return new RedApple();
	}

	@Override
	public Pepper getPepper() {
		// TODO Auto-generated method stub
		return new SweetBellPepper();
	}

}
