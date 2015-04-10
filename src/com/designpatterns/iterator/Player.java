package com.designpatterns.iterator;

public class Player {
	
	private String playerName;
	
	private int playerNo;
	
	public Player(String name, int no) {
		playerName = name;
		playerNo = no;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerNo() {
		return playerNo;
	}

	public void setPlayerNo(int playerNo) {
		this.playerNo = playerNo;
	}

}
