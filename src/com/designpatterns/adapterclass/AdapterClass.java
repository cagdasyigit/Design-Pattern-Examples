package com.designpatterns.adapterclass;

public class AdapterClass extends TheClassToBeAdapted implements TheInterface {

	@Override
	public void theMethod() {
		anotherMethod();
	}

}
