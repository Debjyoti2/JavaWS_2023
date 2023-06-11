package com.java8;

public class Lambda_Expression {
	
	//normal function
	public int sum(int a,int b) {
		return a+b;
	}
	
	
	//now remove public, int , return sum i.e (access modifier, return type, name) and then write , it became a lambda function
	
	//(a, b)-> a+b;
	
	
	//example 2
	
	//normal function
	
	public int getLength(String name) {
		return name.length();
	}
	
	//same Lambda function
	//(name)->name.length();

}
