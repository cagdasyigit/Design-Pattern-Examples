package com.designpatterns.basics;

public class Vehicle extends AbstractVehicle implements IVehicle {
	
	private int getSpeedFormula(int a){
		// Pyshics Speed Formula
		int V =  a * t * t;
		return V <= maxSpeed ? V : maxSpeed;
	}
	
	protected void gearControl(){
		if(speed < maxSpeed / 6)
			setGear(1);
		else if(speed < (maxSpeed / 6) * 2)
			setGear(2);
		else if(speed < (maxSpeed / 6) * 3)
			setGear(3);
		else if(speed < (maxSpeed / 6) * 4)
			setGear(4);
		else if(speed < (maxSpeed / 6) * 5)
			setGear(5);
		else if(speed <= maxSpeed)
			setGear(6);
	}
	
	@Override
	public void gearUp() {
		// Gear Up
		setGear(gear++);
	}

	@Override
	public void gearDown() {
		// Gear Down
		setGear(gear--);
	}

	@Override
	public void brake() {
		// Brake The Speed
		setSpeed(speed - brakePower);
		if(speed < 0)
			speed = 0;
		
		// Set New Time
		t = (int) Math.sqrt( speed / acceleration );
		
		// Set Gear
		gearControl();
	}

	@Override
	public void accelerate() {		
		// Set New Time();
		if(speed < maxSpeed)
			t++;
		
		// Set New Speed
		setSpeed(getSpeedFormula(acceleration));	
		
		// Set Gear
		gearControl();		
	}

}
