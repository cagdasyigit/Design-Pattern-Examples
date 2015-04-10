package com.designpatterns.facade;

public class FacadeFactory {
	
	private static FacadeFactory instance = new FacadeFactory();
	
	private FacadeFactory(){
		
	}
	
	public static FacadeFactory instance(){
		return instance;		
	}
	
	public ComponentFacade getFacade(){
		return new FacadeImpl();
	}
	
}
