package com.tcs.abstractClass;

public class RecipeRunner {

	public static void main(String[] args) {
		Recipe1 r1 = new Recipe1();
		r1.gerReady();
		r1.doTheDish();
		r1.cleanup();
		Recipe2 r2= new Recipe2();
		r2.gerReady();
		r2.doTheDish();
		r2.cleanup();

	}

}
