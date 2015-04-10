package com.designpatterns.prototype;

public abstract class AddressPrototype implements Cloneable {
	
	private String street;
	
	private String no;
	
	private String state;
	
	private String city;
	
	public Object clone() throws CloneNotSupportedException{
		return (Object) super.clone();
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String ToString(){
		return this.street + ", No:" + this.no + ", " + this.state + "/" + this.city; 
	}
	
}
