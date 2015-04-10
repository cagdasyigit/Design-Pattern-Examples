package com.designpatterns.state;

public class CarKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine engine = new Engine();
		engine.stop();
		engine.start();
		engine.start();
		
		System.out.println("\nObject is changing behaviour for each state, in this case there are on and off states for engine.");
	}

}
