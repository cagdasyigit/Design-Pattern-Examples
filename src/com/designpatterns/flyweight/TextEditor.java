package com.designpatterns.flyweight;

public class TextEditor {

	public static void main(String[] args) {
		LetterManager letterManager = LetterManager.instance();
		letterManager.addLine("Test Line", 1);
		letterManager.addLine("Testing Text Editor", 2);		
		LetterManager.getDocument();
		
		System.out.println("\n We created an arraylist which is holds the letters in it, \n "
				+ "same letters not saving again and this is increases the performance.");
	}

}
