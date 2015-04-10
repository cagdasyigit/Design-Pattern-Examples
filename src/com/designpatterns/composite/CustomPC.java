package com.designpatterns.composite;

import java.util.ArrayList;

public class CustomPC implements Oem {

	private String model;
	
	private String brand;
	
	private ArrayList<Oem> oemList = new ArrayList<Oem>();
	
	public CustomPC(String model, String brand) {
		this.model = model;
		this.brand = brand;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void addOem(Oem oem){
		oemList.add(oem);
	}
	
	public void removeOem(int index){
		oemList.remove(index);
	}
	
	public int getPrice(){
		int total = 0;
		for (Oem oem : oemList) {
			total += oem.getPrice();
		}
		
		return total;
	}

}
