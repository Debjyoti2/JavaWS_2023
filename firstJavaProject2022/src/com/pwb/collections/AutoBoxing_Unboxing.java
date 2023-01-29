package com.pwb.collections;

public class AutoBoxing_Unboxing {
	
	public static void main(String[] args) {
		//primitive data type = int and etar wrapper class Integer
		
		int a; //a primitive data type
		
		Integer b=10; //b is a Object of Integer Wrapper class
		
		a=b;
		System.out.println("value of a is : "  +a);
		
		//so a Object is automatically inserted into  a primitive data type ..this is called autoboxing
		
		
		
		//now reverse
		Integer b1;
		int b2=10;
		b1=b2;
		
		//this is called auto unboxing
	}
}
