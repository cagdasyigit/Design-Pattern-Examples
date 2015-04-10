package com.designpatterns.factory;

import java.util.ArrayList;

public abstract class AbstractCarFactory {

	private ArrayList<AbstractCar> carList = new ArrayList<AbstractCar>();
	
	public AbstractCarFactory(){
		this.createAuto();
	}
	
	public abstract void createAuto();
	
	public ArrayList<AbstractCar> getCarList(){
		return carList;
	}
	
	public void setCarList(ArrayList<AbstractCar> carList){
		this.carList = carList;
	}
	
}
