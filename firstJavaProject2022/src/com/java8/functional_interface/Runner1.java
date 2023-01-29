package com.java8.functional_interface;

public class Runner1 {
	
	public static void main(String[] args) {
		
		
		//using anonymus class
		FunctionalInterface1 fi =  new FunctionalInterface1() {
			
			@Override
			public int multiply2Num(int x, int y) {
			 return x*y;
				
			}
		};
		System.out.println(fi.multiply2Num(1,2));
		
		
		//same using lamdba expression
		FunctionalInterface1 fi2 = (x,y)->x*y; 
		System.out.println(fi.multiply2Num(1, 2));
	}

}
