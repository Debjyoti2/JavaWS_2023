package com.java8;

public class Player {
	
	private String name;
	private String type;
	private int score;
	
	
	public Player(String name, String type, int score) {
		super();
		this.name = name;
		this.type = type;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", type=" + type + ", score=" + score + "]";
	}
	
	
	

}
