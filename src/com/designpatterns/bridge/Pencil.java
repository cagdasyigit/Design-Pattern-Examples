package com.designpatterns.bridge;

public class Pencil extends Inventory {
	
	public Pencil(Production production){
		super(production);
	}

	@Override
	public void produce() {
		producePencil();
	}
	
	public void producePencil(){
		getProduction().producePencil();
	}
	
}
