package com.designpatterns.strategy;

public class FileWriter {

	public static void main(String[] args) {
		Bean bean = new Bean();
		bean.setCounter(10);
		bean.setName("Test");
		FileManager.instance().saveBean(bean);
		
		System.out.println("Strategy is usefull when we need to change the way of process. \n"
				+ "We can change handler implementation class from properties file without compiling code again. \n"
				+ "Of course it's useless with a console program like this.");
	}

}
