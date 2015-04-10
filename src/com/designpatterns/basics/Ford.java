package com.designpatterns.basics;

public class Ford extends Vehicle {
	
	public Ford(int a, int b, int m){
		acceleration = a;
		brakePower = b;
		maxSpeed = m;
		brand = "Ford";
	}
	
	public Ford(int a, int b){
		acceleration = a;
		brakePower = b;
		brand = "Ford";
	}
	
	public Ford(){
		brand = "Ford";
	}
	
	protected void gearControl(){
		if(speed < maxSpeed / 5)
			setGear(1);
		else if(speed < (maxSpeed / 5) * 2)
			setGear(2);
		else if(speed < (maxSpeed / 5) * 3)
			setGear(3);
		else if(speed < (maxSpeed / 5) * 4)
			setGear(4);
		else if(speed < maxSpeed)
			setGear(5);
	}

}
