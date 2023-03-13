package com.tcs.pwb;

import java.util.ArrayList;

public class WrapperClasses {

	public static void main(String[] args) {

    //why to use wrapper classes
	//String is not a wrapper class. String is a class provided by java
	//all the wrapper classes just like String is immutable.
	int a; Integer a1;
	boolean b; Boolean b1;
	char c; Character c1;
	float d; Float d1;
	//1st all r primitive data types and 2nd are their wrapper classes
	
	//We use wrapper class bcs
	//1.java provide lots of operation in wrapper class like Integer.valueOf("any string") like this.
	//2. in collection we need to use Object , so there we need to use wrapper classes
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	
	//auto boxing
	Integer i1= new Integer(5);
	Integer int1=5; //this is called auto boxing. no need to write long code. java handles
	
	
		
	}

}
