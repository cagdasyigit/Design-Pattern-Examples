package com.designpatterns.command;

public class Spectator {

	public static void main(String[] args) {
		// Take your pijamas and take the remote on your hand, enjoy your TV...
		RemoteControl remote = new RemoteControl();
		// Open the TV
		remote.press(0);
		// If your bored close itnow
		remote.press(1);
		
		System.out.println("\n The spectator class doesn't know anything about Television class or Command interface, all it needs is just a remote control.");
	}

}
