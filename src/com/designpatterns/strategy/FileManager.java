package com.designpatterns.strategy;

import java.util.ResourceBundle;

public class FileManager {

	private Strategy strategy;
	
	public static final FileManager manager = new FileManager();
	
	private FileManager(){
		String strategy = ResourceBundle.getBundle("com/designpatterns/strategy/strategy").getString("strategy");
		
		try {
			setStrategy((Strategy) Class.forName(strategy).newInstance()); 
		}
		catch (Exception e) {
			
		}
	}
	
	public static FileManager instance(){
		return manager;
	}

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void saveBean(Bean bean){
		getStrategy().save(bean);
	}
	
}
