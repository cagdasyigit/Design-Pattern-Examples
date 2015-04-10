package com.designpatterns.memento;

public class TextEditor {

	public static void main(String[] args) {
		// Creating a document and adding lines
		Document doc = new Document();
		doc.addLine(0, "<html>");
		doc.addLine(1, "<head>");
		doc.addLine(2, "<title>");
		doc.addLine(3, "Memento Test");
		doc.addLine(4, "</title>");
		doc.addLine(5, "<body>");
		doc.addLine(6, "<p>Hello JAVA.</p>");
		doc.addLine(7, "<p>This is a test html output for java memento design pattern tutorial.</p>");
		doc.addLine(8, "</body>");
		doc.addLine(9, "</html>");
		
		// Creating memento object
		Memento memento = doc.createMemento();
		
		// Print document
		System.out.println("FIRST");
		System.out.println("-----");
		System.out.println(doc.ToString());
		
		// Make changes on document
		doc.removeLine(6);
		
		// Print up-to-date document 
		System.out.println("UPDATED");
		System.out.println("-------");
		System.out.println(doc.ToString());
		
		// Undo changes
		doc.setMemento(memento);
		
		// Print old document
		System.out.println("OLD");
		System.out.println("---");
		System.out.println(doc.ToString());
	}

}
