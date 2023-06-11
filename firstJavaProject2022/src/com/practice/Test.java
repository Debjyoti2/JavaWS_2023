package com.practice;

public class Test {

	public static void main(String[] args) {
		String a = "A";

		String b = "B";

		String c = "A";

		String d = new String("A");

		String e = new String("A");

		//sysout(a==b): false --ok
		//System.out.println("sysout(a==b): false " + a==b);
		
		
		//sysout (a==c) : true --ok
		//System.out.println("sysout (a==c) : true " + (a==c));
		
		
		//sysout(a==d) : false
		//System.out.println("sysout (a==d) : false " + (a==d));
		
		
		//d==e : true
		System.out.println("sysout (d==e) : false " + (d==e));
		
		
		 
	}

}
