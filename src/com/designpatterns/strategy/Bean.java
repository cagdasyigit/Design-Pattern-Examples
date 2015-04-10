package com.designpatterns.strategy;

import java.io.Serializable;

public class Bean implements Serializable {

	/**
	 * Generated serial version ID
	 */
	private static final long serialVersionUID = 3925599656945478153L;
	
	private int counter;
	
	private String name;

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
