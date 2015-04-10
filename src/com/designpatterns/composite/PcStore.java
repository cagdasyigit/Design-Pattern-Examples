package com.designpatterns.composite;

public class PcStore {

	public static void main(String[] args){
		// Create pc object
		CustomPC pc = new CustomPC("Asus", "Z-10");
		
		// Create oem objects
		Oem cpu = new Cpu("Intel", "i5-4590", 530);
		Oem ram = new Ram("Corsair", "Vengeance", 280);
		Oem mainboard = new Mainboard("Gigabyte", "UD3H", 320);
		
		// Add oems to pc
		pc.addOem(cpu);
		pc.addOem(ram);
		pc.addOem(mainboard);
		
		// Print total price
		System.out.println("Total price: $" + pc.getPrice());
	}
	
}
