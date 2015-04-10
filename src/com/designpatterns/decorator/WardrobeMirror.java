package com.designpatterns.decorator;

public class WardrobeMirror extends MirrorDecorator {

	public void produce() {
		getMirror().produce();
		placeToWardrobe();
	}

	public void placeToWardrobe() {
		System.out.println("Mirror has been placed into wardrobe.");
	}

}
