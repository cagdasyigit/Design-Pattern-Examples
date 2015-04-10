package com.designpatterns.decorator;

public class BorderedMirror extends MirrorDecorator {

	public void produce() {
		getMirror().produce();
		addBorder();
	}
	
	public void addBorder(){
		System.out.println("Mirror has been bordered.");
	}

}
