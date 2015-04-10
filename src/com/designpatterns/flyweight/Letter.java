package com.designpatterns.flyweight;

public class Letter {
	
	private String letter;
	
	public Letter(String l){
		letter = l;
	}

	public String getLetter() {
		return letter;
	}

	public void setLetter(String letter) {
		this.letter = letter;
	}
}
