package com.designpatterns.singleton;

public class Translate {
	
	private static IDictionary dictionary;
	
	public static void main(String[] args){
		// Print English Sentence
		System.out.println("English sentence: man's bottom");
		
		// Get Translate From Turkish Language
		dictionary = new TurkishDictionary();
		System.out.println("Turkish translate: " + dictionary.getKey("man") + dictionary.getKey("'s") + " " + dictionary.getKey("bottom"));
		
		// Now Switch To The Japanese Dictionary
		dictionary = new JapaneseDictionary();
		System.out.println("Japanese translate: " + dictionary.getKey("man") + dictionary.getKey("'s") + " " + dictionary.getKey("bottom"));
	}
	
}
