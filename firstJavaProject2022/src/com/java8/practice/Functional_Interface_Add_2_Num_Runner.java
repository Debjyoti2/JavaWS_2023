package com.java8.practice;

public class Functional_Interface_Add_2_Num_Runner {

	public static void main(String[] args) {

		Functional_Interface_Add_2_Num fi1 = new Functional_Interface_Add_2_Num() {
			
			@Override
			public int add2Num(int a, int b) {
				return a+b;
			}
		};
		System.out.println(fi1.add2Num(1, 2));
		
		
		Functional_Interface_Add_2_Num fi = (a,b)->a+b;
		System.out.println(fi.add2Num(2,5));
		

	}

}
