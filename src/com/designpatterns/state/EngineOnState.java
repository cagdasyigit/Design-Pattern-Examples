package com.designpatterns.state;

public class EngineOnState implements State {

	@Override
	public void on(Engine engine) {
		// TODO Auto-generated method stub
		System.out.println("Engines are already running!");
	}

	@Override
	public void off(Engine engine) {
		// TODO Auto-generated method stub
		engine.setState(new EngineOffState());
		System.out.println("Engines stopped.");
	}	

}
