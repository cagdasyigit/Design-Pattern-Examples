package com.designpatterns.bridge;

public class ProductionImpl2 implements Production {

	Factory2 factory = new Factory2();
	
	@Override
	public void produceNotepad() {
		factory.produceMusicNotepad();
	}

	@Override
	public void producePencil() {
		factory.producePencil();
	}

}
