package com.tcs.abstractClass;

public class Recipe1 extends Recipe{

	@Override
	public void gerReady() {
		System.out.println("Get ready for dish1 ");
		
	}

	@Override
	public void doTheDish() {
		System.out.println("do dish1 ");
		
	}

	@Override
	public void cleanup() {
		System.out.println("clean dish1 ");
		
	}

}
