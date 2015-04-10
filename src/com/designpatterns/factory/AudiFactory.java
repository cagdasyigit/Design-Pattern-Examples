package com.designpatterns.factory;


public class AudiFactory extends AbstractCarFactory {

	@Override
	public void createAuto() {
		getCarList().add(new A4(240));
		getCarList().add(new R8(280));
	}

}
