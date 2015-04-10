package com.designpatterns.factory;

public class CarGallery {

	public static void main(String[] args) {
		// We don't know how many Audi or Bmw car exists, factories will know current cars to list
		AbstractCarFactory bmwFactory = new BmwFactory();
		AbstractCarFactory audiFactory = new AudiFactory();
		
		for(AbstractCar bmw: bmwFactory.getCarList()){
			System.out.println(bmw.getBrand() + " " + bmw.getModel() + ", " + bmw.getHorsePower() + "HP");
		}
		
		for(AbstractCar audi: audiFactory.getCarList()){
			System.out.println(audi.getBrand() + " " + audi.getModel() + ", " + audi.getHorsePower() + "HP");
		}
		
		System.out.println("\nWhen you want to use factories, they will begin to create with their own list.\n"
				+ "This is the difference between abstract factory and factory design patterns, in abstract factory; "
				+ "user class (CarGallery) will know what and how many object will be created.");
	}

}
