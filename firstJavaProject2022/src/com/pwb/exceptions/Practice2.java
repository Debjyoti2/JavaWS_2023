package com.pwb.exceptions;

public class Practice2 {

	public static void main(String[] args) {
		Practice2 p = new Practice2();
		p.calculateInterest(1, 2, -1);
	}
	
	public int calculateInterest(int principle, int percentage,int time) throws IllegalArgumentException,ArithmeticException{
		int amount=0;
		try {
			if(principle<0) {
				throw new IllegalArgumentException("HEHE");
			}
			else if(time<0) {
				throw new ArithmeticException("HAHA");
			}
			
			amount = principle*percentage*time;
			return amount;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return amount;
		
	}
	
}
