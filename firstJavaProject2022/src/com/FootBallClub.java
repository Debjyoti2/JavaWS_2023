package com;

public class FootBallClub {
	
	private String playerName;
	private int playerJersyNumber;
	//private int numberOfPlayerinClub;
	
	public static int numberOfPlayerinClub;
	
	
	public String getName() { 
		return playerName;
	}
	public void setName(String name) {
		this.playerName = name;
	}
	public int getId() {
		return playerJersyNumber;
	}
	public void setId(int id) {
		this.playerJersyNumber = id;
	}
	
	FootBallClub(String name,int id){
		this.playerName=name;
		this.playerJersyNumber=id;
		numberOfPlayerinClub++;
		//when adding a player in club increasing the variable
		
	}
	
	
	
	@Override
	public String toString() {
		return "FootBallClub [playerName=" + playerName + ", playerJersyNumber=" + playerJersyNumber + ", numberOfPlayerinClub=" + numberOfPlayerinClub + "]";
	}
	
	
	
	
	

}
