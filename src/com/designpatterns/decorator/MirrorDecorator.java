package com.designpatterns.decorator;

public abstract class MirrorDecorator implements HouseGears {

	private HouseGears mirror = new Mirror();
	
	public HouseGears getMirror(){
		return mirror;
	}
	
	public void setMirror(HouseGears mirror){
		this.mirror = mirror;
	}
	
}
