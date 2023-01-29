package com.pwb.practice;

public class FountainPen extends Pen{

	@Override
	public void write() {
		System.out.println("Write");
	}
	
	@Override
	public void refill() {
		System.out.println("refill");
	}
	
	public void changeNib() {
		System.out.println("change nib");
	}
	
}
