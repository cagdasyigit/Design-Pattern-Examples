package com.designpatterns.strategy;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.io.BufferedWriter;

public class BeanToFileStrategyImpl implements Strategy {

	@Override
	public void save(Bean bean) {
		try {
			StringBuilder temp = new StringBuilder();
			temp.append("Counter: " + bean.getCounter() + " \n\r");
			temp.append("Name: " + bean.getName() + "\n");
			
			File file = new File("D:/Temp/Bean.txt");
			if(file.exists()) {
				file.delete();
				file = new File("D:/Temp/Bean.txt");
			}
			
			Writer output = null;
			try {
				output = new BufferedWriter(new FileWriter(file));
				output.write(temp.toString());
			}
			finally {
				if(output != null) 
					output.close();
			}
			System.out.println("Bean.txt updated.");
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
