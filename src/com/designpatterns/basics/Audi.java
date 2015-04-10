package com.designpatterns.basics;

public class Audi extends Vehicle {
	
	public Audi(int a, int b, int m){
		acceleration = a;
		brakePower = b;
		maxSpeed = m;
		brand = "Audi";
	}
	
	public Audi(int a, int b){
		acceleration = a;
		brakePower = b;
		brand = "Audi";
	}
	
	public Audi(){
		brand = "Audi";
	}

}
