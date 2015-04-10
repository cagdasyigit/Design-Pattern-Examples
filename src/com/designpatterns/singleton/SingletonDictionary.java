package com.designpatterns.singleton;

import java.util.HashMap;
import java.util.Map;

public class SingletonDictionary {
 
	private static SingletonDictionary instance = null;
	
	private static Object lock = new Object();
	
	public static Map<String, String> wordList = new HashMap<String, String>();
	
	private SingletonDictionary(){
		System.out.println("Dictionary Is Initializing...");
	}
	
	public static SingletonDictionary instance(){
		if(instance == null){
			synchronized (lock) {
				if(instance == null){
					instance = new SingletonDictionary();
				}
			}
		}
		return instance;
	}
	
	public static void setKey(String key, String value){
		wordList.put(key, value);
	}
	
	public static String getKey(String key){
		return wordList.get(key);
	}
	
}
