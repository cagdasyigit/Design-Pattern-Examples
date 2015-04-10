package com.designpatterns.iterator;

public class ArrayIterator implements Iterator {
	
	private Player[] team;
	
	private int position;

	public ArrayIterator(Player[] team){
		setTeam(team);
	}
	
	public Player[] getTeam() {
		return team;
	}

	public void setTeam(Player[] team) {
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
		if(position >= getTeam().length || getTeam()[position] == null)
			return false;
		else
			return true;
	}

	@Override
	public Object next() {
		Player player = getTeam()[position];
		position++;
		return player;
	}

}
