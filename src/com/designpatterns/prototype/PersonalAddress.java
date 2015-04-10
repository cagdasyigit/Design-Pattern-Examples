package com.designpatterns.prototype;

public class PersonalAddress extends AddressPrototype {
	
	private String firstname;
	
	private String lastname;

	public PersonalAddress(String street, String no, String state, String city, String firstname, String lastname){
		setFirstname(firstname);
		setLastname(lastname);
		setStreet(street);
		setState(state);
		setCity(city);
		setNo(no);
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
