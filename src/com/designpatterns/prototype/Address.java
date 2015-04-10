package com.designpatterns.prototype;

public class Address extends AddressPrototype {

	public Address(String street, String no, String state, String city){
		setStreet(street);
		setState(state);
		setCity(city);
		setNo(no);
	}
	
}
