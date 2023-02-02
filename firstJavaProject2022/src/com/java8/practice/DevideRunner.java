package com.java8.practice;

public class DevideRunner {

	public static void main(String[] args) {

		Devide2Num div = new Devide2Num() {
			
			@Override
			public int devide(int a, int b) {
				return a/b;
			}
		};
		
		div.devide(124,2);
		
		Devide2Num div2 = (a,b)->a/b;
		div2.devide(12,4);

	}
	
	
	
}
