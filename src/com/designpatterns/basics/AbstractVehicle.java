package com.designpatterns.basics;

public abstract class AbstractVehicle {
	
	protected int maxSpeed = 0;
	
	protected int acceleration = 2;
	
	protected int brakePower = 10;
	
	protected String brand = "";	

	protected int speed = 0;
	
	protected int gear = 1;
	
	protected int t = 1;
	
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getT() {
		return t;
	}

	public void setT(int t) {
		this.t = t;
	}

	public int getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(int acceleration) {
		this.acceleration = acceleration;
	}

	public int getBrakePower() {
		return brakePower;
	}

	public void setBrakePower(int brakePower) {
		this.brakePower = brakePower;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSpeed() {
		return speed;
	}

	protected void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getGear() {
		return gear;
	}

	protected void setGear(int gear) {
		this.gear = gear;
	}
	
}
