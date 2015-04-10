package com.designpatterns.facade;

public class AnInnerClass implements ComponentFacade {

	@Override
	public void doSomething() {
		System.out.println("Let's say it's not possible to reach this class via your client class in a very large existing system, \n"
				+ "but with an interface you know what method(s) must be executed, \n"
				+ "so with FacadeFactory you can call modules of a large system.");
	}

}
