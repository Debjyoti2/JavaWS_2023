package com.tcs.abstractClass;

//abstract class >> extends
//interface >> implements

public class Recipe2 extends Recipe{

	@Override
	public void gerReady() {
		System.out.println("Get ready for dish2 ");
		
	}

	@Override
	public void doTheDish() {
		System.out.println("do dish2 ");
		
	}

	@Override
	public void cleanup() {
		System.out.println("clean dish2 ");
		
	}

}



