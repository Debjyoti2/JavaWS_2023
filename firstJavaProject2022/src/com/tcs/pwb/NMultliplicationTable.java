package com.tcs.pwb;

public class NMultliplicationTable {
	
	
	public static void multiply(int number) {
		
		System.out.println("Table Of " + number + " is printed below");
		for (int i=1;i<=10;i++) {
			
			System.out.println(number + " * " + i + " = " + number*i);
			
		}
		
	}
	
	public static void main(String[] args) {
		multiply(6);
		
	}
	
	

}
