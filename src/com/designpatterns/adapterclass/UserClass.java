package com.designpatterns.adapterclass;

public class UserClass {

	public static void main(String[] args) {
		TheInterface ourInterface = new AdapterClass();
		ourInterface.theMethod();
	}

}
