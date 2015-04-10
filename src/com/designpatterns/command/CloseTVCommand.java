package com.designpatterns.command;

public class CloseTVCommand implements Command {

	private Television tv;
	
	public CloseTVCommand(Television tv){
		this.tv = tv;
	}

	@Override
	public void execute() {
		this.tv.close();
	}
	
}
