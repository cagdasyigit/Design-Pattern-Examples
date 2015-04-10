package com.designpatterns.iterator;

public class SportsNews {

	public static void main(String[] args) {
		// Print Barcelona team player list
		Barcelona barcelona = new Barcelona();
		printPlayerList(barcelona);
		
		System.out.println(" ");
		
		// Print Lakers team player list
		Lakers lakers = new Lakers();
		printPlayerList(lakers);
	}
	
	public static void printPlayerList(Team team){
		// Creating instance of an object and then calling object's iterator
		// This will give appropriate iterator for us 
		Iterator iterator = team.getIterator();
		
		// Print player list to screen
		System.out.println(team.getName() + " players are:");
		System.out.println("----------------------");
		while(iterator.hasNext()){
			Player player = (Player) iterator.next();
			System.out.println("Player: " + player.getPlayerName() + ", Number: " + player.getPlayerNo());
		}
		
		System.out.println("\nEvery object gives correct iterator for itself and of course we built correct iterators for them");
	}

}
