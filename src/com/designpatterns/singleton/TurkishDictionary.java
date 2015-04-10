package com.designpatterns.singleton;

public class TurkishDictionary implements IDictionary  {

	public TurkishDictionary(){
		SingletonDictionary.setKey("man", "adam");
		SingletonDictionary.setKey("'s", "ýn");
		SingletonDictionary.setKey("bottom", "dibi");	
	}

	@Override
	public String getKey(String key) {
		return SingletonDictionary.getKey(key);
	}	
	
}
