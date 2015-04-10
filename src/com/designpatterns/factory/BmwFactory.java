package com.designpatterns.factory;


public class BmwFactory extends AbstractCarFactory {

	@Override
	public void createAuto() {
		getCarList().add(new Z4(220));
	}

}
