package com.designpatterns.memento;

import java.util.ArrayList;

public class Document {

	private ArrayList<String> lines = new ArrayList<String>();
	
	public void addLine(int index, String line){
		getLines().add(index, line);
	}
	
	public void removeLine(int index){
		getLines().remove(index);
	}

	public ArrayList<String> getLines() {
		return lines;
	}

	public void setLines(ArrayList<String> lines) {
		this.lines = lines;
	}
	
	public Memento createMemento(){
		return new Memento(getLines().toArray());
	}
	
	public void setMemento(Memento memento){
		getLines().clear();
		Object[] tempLines = memento.getElements();
		for(int i = 0; i < tempLines.length; i++){
			String line = (String) tempLines[i];
			getLines().add(line);
		}
	}
	
	public String ToString(){
		StringBuilder temp = new StringBuilder();
		for(int i = 0; i < getLines().size(); i++){
			temp.append(getLines().get(i)).append(" \n");
		}
		return temp.toString();
	}
	
}
