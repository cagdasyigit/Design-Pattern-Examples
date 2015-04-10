package com.designpatterns.iterator;

public class Lakers implements Team {
	
	private Player[] team = new Player[5];
	
	public Lakers(){
		team[0] = new Player("Bryant", 24);
		team[1] = new Player("Johnson", 11);
		team[2] = new Player("Clarkson", 6);
		team[3] = new Player("Brown", 15);
		team[4] = new Player("Boozer", 5);
	}
	
	public Player[] getTeam(){
		return team;
	}
	
	public void setTeam(Player[] team){
		this.team = team;
	}

	@Override
	public Iterator getIterator() {
		return new ArrayIterator(getTeam());
	}

	@Override
	public String getName() {
		return "Lakers";
	}

}
