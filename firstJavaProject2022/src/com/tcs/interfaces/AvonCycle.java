package com.tcs.interfaces;

public class AvonCycle implements Bicycle{



	@Override
	public void speedUp() {
		System.out.println("Speed up");
		
	}

	@Override
	public void applyBreak() {
		System.out.println("break");
		
	}

	public static void main(String[] args) {
		AvonCycle a = new AvonCycle();
		System.out.println(a.number);
		//a.number=11; this is final cant change the value.
	}
	

}
