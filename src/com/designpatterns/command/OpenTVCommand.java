package com.designpatterns.command;

public class OpenTVCommand implements Command {
	
	private Television tv;
	
	public OpenTVCommand(Television tv){
		this.tv = tv;
	}

	@Override
	public void execute() {
		this.tv.open();
	}
	
}
