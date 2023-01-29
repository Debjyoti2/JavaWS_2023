package com.tcs.pwb;

public class Book {
	
	private int noOfCopies;
	
	
	Book(){
		System.out.println("Default Constructor Called");
	}
	
	Book(int initialCopies){
		this.noOfCopies=initialCopies;
	}
	
	public int getNoOfCopies() {
		return noOfCopies;
	}
	
	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies=noOfCopies;
	}
	
	
	public void increaseNoOfCopies(int howmuch) {
		this.noOfCopies+=howmuch;
	}
	
	
	

}
