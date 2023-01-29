package com.java8.practice;

public class Functional_Interface_Divide_2_num_main {

	public static void main(String[] args) {

		//by creating anonymous class
		Functional_Interface_Divide_2_num fi = new Functional_Interface_Divide_2_num() {
			
			@Override
			public int divide_2_num(int x, int y) {
				return x/y;
			}
		};
		System.out.println(fi.divide_2_num(10,2));
		
		//by using lambda exprn
		
		Functional_Interface_Divide_2_num fi2 = (x,y)->x/y;
		System.out.println(fi2.divide_2_num(20,10));
		

		

	}

}
