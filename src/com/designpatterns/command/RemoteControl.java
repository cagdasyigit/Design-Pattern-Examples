package com.designpatterns.command;

public class RemoteControl {
	
	public Command[] button = new Command[2];
	
	public RemoteControl(){
		Television tv = new Television();
		button[0] = new OpenTVCommand(tv);
		button[1] = new CloseTVCommand(tv);
	}
	
	public void press(int i){
		if(i > button.length || i < 0){
			throw new RuntimeException("Button not allowed.");
		}
		button[i].execute();
	}
	
}
