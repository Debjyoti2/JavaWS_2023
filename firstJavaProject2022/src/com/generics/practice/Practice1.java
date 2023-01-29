package com.generics.practice;

public class Practice1 {
	
	public static void main(String[] args) {
		ListUtility<Integer> a1 = new ListUtility<>(1);
		System.out.println(a1.getObj());


		ListUtility<Double> a2 = new ListUtility<>(20.2);
		System.out.println(a2.getObj());
		
		//ListUtility<String> a3 = new ListUtility<>("AA"); --error
		//System.out.println(a2.getObj());
		
		
		

	}
	
}
 