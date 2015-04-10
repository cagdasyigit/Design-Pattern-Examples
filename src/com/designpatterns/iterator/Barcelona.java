package com.designpatterns.iterator;

import java.util.ArrayList;

public class Barcelona implements Team {

	private ArrayList<Player> team;
	
	public Barcelona(){
		team = new ArrayList<Player>();
		team.add(new Player("Iniesta", 8));
		team.add(new Player("Messi", 10));
		team.add(new Player("Neymar", 11));
	}
	
	public ArrayList<Player> getTeam(){
		return team;
	}
	
	public void setTeam(ArrayList<Player> team){
		this.team = team;
	}

	@Override
	public Iterator getIterator() {
		return new ArrayListIterator(getTeam());
	}

	@Override
	public String getName() {
		return "Barcelona";
	}
}
