package com.designpatterns.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DriveVehicle {
	
	static Vehicle vehicle;
	
	public static void main(String[] args) throws IOException { 
		Drive();		       
    }
	
	public static void Drive() throws IOException{
		// Create A New Vehicle
		vehicle = new Audi(2, 25, 320);
		
		// Read User Input
		String s = getUserInput(true);    
        handleControl(s.toString());
        
        // Print Message
        System.out.println("Your Car: " + vehicle.getBrand());
	}
	
	private static String getUserInput(boolean showInformation) throws IOException{
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Key Map Information
        if(showInformation){	        
        	System.out.print("Keyboard Controls: \n\r");
	        System.out.print("A: Accelerate \n");
	        System.out.print("B: Brake \n");
	        System.out.print("S: Switch Car \n");
	        System.out.print("E: Exit Car \n");
        }
        
        System.out.print(" \n\r");
        
        // Input Listener
        return br.readLine().toString();  
	}
	
	private static void handleControl(String key) throws IOException{
		if(key.equalsIgnoreCase("A")){
			vehicle.accelerate();
			giveMessage();
		}
		else if(key.equalsIgnoreCase("B")){
			vehicle.brake();
			giveMessage();
		}
		else if(key.equalsIgnoreCase("S")){
			if(vehicle.getBrand().equalsIgnoreCase("Audi"))
				vehicle = new Ford(2, 25, 270);
			else if(vehicle.getBrand().equalsIgnoreCase("Ford"))
				vehicle = new Audi(2, 25, 320);
			
			System.out.println("You are now using " + vehicle.getBrand());
			
			// Recursive User Input
	     	String s = getUserInput(false);    
	        handleControl(s.toString());
		}
		else if(key.equalsIgnoreCase("E")){
			System.out.println("Goodbye, come for drive me again.");
		}
		else {
			System.out.println("Wrong control, your car has crashed, you dumbass!");
		}		
	}
	
	private static void giveMessage() throws IOException{
		// Status Message
		System.out.println("Gear: " + vehicle.getGear() + ", Current Speed: " + vehicle.getSpeed() + ", TimeLine: " + vehicle.getT());
        System.out.print(" \n\r");
        
        // Recursive User Input
     	String s = getUserInput(false);    
        handleControl(s.toString());
	}

}
