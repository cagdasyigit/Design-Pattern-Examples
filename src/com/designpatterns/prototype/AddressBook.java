package com.designpatterns.prototype;

public class AddressBook {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		// TEST 1
		
		// Build first address
		Address address = new Address("Atatürk Mahallesi", "10/A", "Sancaktepe", "ISTANBUL");		
		
		// Build second address with cloning first address
		Address address2 = (Address) address.clone();
		address2.setState("Sarýgazi - Sancaktepe");
		
		// See results are different
		System.out.println(address.ToString());
		System.out.println(address2.ToString());
		System.out.println("--------------------------------------------------------");
		
		
		// TEST 2

		// Build first address
		Address address3 = new Address("Atatürk Mahallesi", "10/A", "Sancaktepe", "ISTANBUL");		
		
		// Build second address with copying first address
		Address address4 = address3;
		address4.setState("Sarýgazi - Sancaktepe");
		
		// See results are SAME! (Because java variables are reference type)
		System.out.println(address3.ToString());
		System.out.println(address4.ToString());
	}

}
