package com.designpatterns.adapterobject;

public class AdapterClass extends TheCurrentlyUsingClass {

	private TheClassToBeAdapted classToBeAdapted = new TheClassToBeAdapted();
	
	public void theMethod(){
		getClassToBeAdapted().anotherMethod();
	}

	public TheClassToBeAdapted getClassToBeAdapted() {
		return classToBeAdapted;
	}

	public void setClassToBeAdapted(TheClassToBeAdapted classToBeAdapted) {
		this.classToBeAdapted = classToBeAdapted;
	}
	
}
