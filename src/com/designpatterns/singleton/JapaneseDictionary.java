package com.designpatterns.singleton;

public class JapaneseDictionary implements IDictionary {

	public JapaneseDictionary(){
		SingletonDictionary.setKey("man", "otoko");
		SingletonDictionary.setKey("'s", "no");
		SingletonDictionary.setKey("bottom", "botomu");	
	}

	@Override
	public String getKey(String key) {
		return SingletonDictionary.getKey(key);
	}	
	
}
