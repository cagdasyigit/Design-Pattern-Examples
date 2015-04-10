package com.designpatterns.state;

public class Engine {
	
	private State state;
	
	public Engine(){
		setState(new EngineOffState());
		System.out.println("Engines off.");
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void start(){
		getState().on(this);
	}
	
	public void stop(){
		getState().off(this);
	}
}
