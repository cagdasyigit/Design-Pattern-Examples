package com.designpatterns.bridge;

public class ProductionImpl1 implements Production {
	
	Factory1 factory = new Factory1();
	
	@Override
	public void produceNotepad() {
		factory.produceMatrixNotepad();
	}

	@Override
	public void producePencil() {
		factory.producePen();
	}

}
