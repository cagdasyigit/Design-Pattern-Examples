package com.designpatterns.bridge;

public abstract class Inventory {
	
	private Production production;
	
	public abstract void produce();
	
	public Inventory(Production production){
		setProduction(production);
	}

	public Production getProduction() {
		return production;
	}

	public void setProduction(Production production) {
		this.production = production;
	}
	
}
