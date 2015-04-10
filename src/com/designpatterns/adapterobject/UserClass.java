package com.designpatterns.adapterobject;

public class UserClass {

	public static void main(String[] args){
		TheCurrentlyUsingClass inUseObject = (TheCurrentlyUsingClass) new AdapterClass();
		inUseObject.theMethod();
	}
	
}
