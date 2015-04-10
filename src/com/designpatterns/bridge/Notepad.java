package com.designpatterns.bridge;

public class Notepad extends Inventory {
	
	public Notepad(Production production){
		super(production);
	}
	
	@Override
	public void produce() {
		produceNotepad();
	}

	public void produceNotepad() {
		getProduction().produceNotepad();
	}

}
