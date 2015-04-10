package com.designpatterns.decorator;

public class HouseShop {

	public static void main(String[] args) {
		System.out.println("Assume that there is an old existing class with name 'Mirror' \n"
				+ "and one day you come up to create a different mirror type without changing Mirror class.\n"
				+ "You can create a decorator class and then extend with a different type of classes to get success.\n"
				+ "Check the example below:\n");
		
		HouseGears mirror = new BorderedMirror();
		mirror.produce();
		
		System.out.println(" ");
		
		mirror = new WardrobeMirror();
		mirror.produce();
	}

}
