package com.designpatterns.decorator;

public class Mirror implements HouseGears {

	@Override
	public void produce() {
		System.out.println("A mirror produced.");
	}

}
