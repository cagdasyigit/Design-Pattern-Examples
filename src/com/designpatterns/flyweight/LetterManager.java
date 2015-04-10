package com.designpatterns.flyweight;

import java.util.ArrayList;

public class LetterManager {
	
	private static final LetterManager manager = new LetterManager();
	
	private static ArrayList<Letter> letterList = new ArrayList<Letter>();
	
	private Letter[][] document = new Letter[50][50];
	
	private LetterManager(){
		
	}
	
	public static final LetterManager instance(){
		return manager;
	}
	
	public static Letter getLetter(String l){
		Letter theLetter = null;
		// Find in list if exists
		for (Letter letter : letterList) {
			if(letter.equals(l)){
				theLetter = letter;
				break;
			}				
		}
		// If not exists, then add it
		if(theLetter == null){
			theLetter = new Letter(l);
			manager.getLetterList().add(theLetter);
		}
		return theLetter;
	}
	
	public void addLine(String line, int lineNumber){
		// Change the value of the line characters in the array by a line number
		for(int i = 0; i < line.length(); i++){
			String letter = line.substring(i, i + 1);
			document[lineNumber][i] = getLetter(letter);
		}
	}
	
	public static void getDocument(){
		for(int x = 0; x < 50; x++){
			for(int y = 0; y < 50; y++){
				if(manager.document[x][y] != null){
					System.out.println((manager.document[x][y]).getLetter());
				}
			}
		}
	}

	public ArrayList<Letter> getLetterList() {
		return letterList;
	}

	public static void setLetterList(ArrayList<Letter> letterList) {
		LetterManager.letterList = letterList;
	}

	public void setDocument(Letter[][] document) {
		this.document = document;
	}
	
}
