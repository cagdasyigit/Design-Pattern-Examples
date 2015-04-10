package com.designpatterns.facade;

public class Client {

	public static void main(String[] args) {
		FacadeFactory.instance().getFacade().doSomething();
	}

}
