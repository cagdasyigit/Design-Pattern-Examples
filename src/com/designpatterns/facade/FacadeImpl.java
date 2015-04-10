package com.designpatterns.facade;

public class FacadeImpl implements ComponentFacade {

	@Override
	public void doSomething() {
		new AnInnerClass().doSomething();
	}

}
