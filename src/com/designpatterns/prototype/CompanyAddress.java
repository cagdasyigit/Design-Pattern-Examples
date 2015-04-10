package com.designpatterns.prototype;

public class CompanyAddress extends AddressPrototype {

	private String company;

	public CompanyAddress(String street, String no, String state, String city, String company){
		setCompany(company);
		setStreet(street);
		setState(state);
		setCity(city);
		setNo(no);
	}
	
	@SuppressWarnings("unused")
	private String getCompany() {
		return company;
	}

	private void setCompany(String company) {
		this.company = company;
	}
}
