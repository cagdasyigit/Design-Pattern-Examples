package com.designpatterns.state;

public class EngineOffState implements State {

	@Override
	public void on(Engine engine) {
		// TODO Auto-generated method stub
		engine.setState(new EngineOnState());
		System.out.println("Engines started.");
	}

	@Override
	public void off(Engine engine) {
		// TODO Auto-generated method stub
		System.out.println("Engines are already offline!");
	}	

}
