package com.designpatterns.iterator;

import java.util.ArrayList;

public class ArrayListIterator implements Iterator {

	private ArrayList<Player> team;

	private int position;
	
	public ArrayListIterator(ArrayList<Player> team) {
		setTeam(team);
	}

	public ArrayList<Player> getTeam() {
		return team;
	}

	public void setTeam(ArrayList<Player> team) {
		this.team = team;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
	@Override
	public boolean hasNext() {
		if(position >= getTeam().size() || getTeam().get(position) == null)
			return false;
		else
			return true;
	}

	@Override
	public Object next() {
		Player player = getTeam().get(position);
		position++;
		return player;
	}

}
