package com.designpatterns.adapterobject;

public class TheClassToBeAdapted {

	public void anotherMethod(){
		System.out.println("This method is nothing to do with UserClass, but with an adapter object it is possible to call this method. \r\n"
				+ "Please note: The original method of TheCurrentlyUsingClass method has been overwritten.");
	}
	
}
