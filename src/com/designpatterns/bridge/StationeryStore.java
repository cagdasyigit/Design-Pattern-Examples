package com.designpatterns.bridge;

public class StationeryStore {

	public static void main(String[] args) {
		Inventory notepad = new Notepad(new ProductionImpl1());
		notepad.produce();
		
		notepad = new Notepad(new ProductionImpl2());
		notepad.produce();
		
		Inventory pencil = new Pencil(new ProductionImpl1());
		pencil.produce();
		
		pencil = new Pencil(new ProductionImpl2());
		pencil.produce();
		
		System.out.println("\nWith the bridge design pattern there is no need for complex class designs,"
				+ "class implementations can be changed in runtime.\n");
		
	}

}
