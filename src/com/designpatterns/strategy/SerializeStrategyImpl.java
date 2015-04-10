package com.designpatterns.strategy;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializeStrategyImpl implements Strategy {

	@Override
	public void save(Bean bean) {
		try {
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("D:/Temp/Bean.ser"));
			out.writeObject(bean);
			out.close();
			
			System.out.println("Bean.ser created.");
		}
		catch (Exception e) {
			throw new RuntimeException();
		}
	}

}
