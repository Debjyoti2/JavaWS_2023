package com.pwb.exceptions;

public class Throw_and_Throws_Keyword {

	public static void main(String[] args) {
		
		
		
		
	}
	
	public int methodThrowsException() throws NullPointerException { //throws keyword gives method level exception
		//like it tells if any method is calling this method then it should implement null pointer exception by using try catch block
		//means from where ever this method get calling it should always be inside try catch block.
		int a=1/0;
		return a;
	}
	
	public int throwExceptioninsidemethod() {
		int b=0;
		Throw_and_Throws_Keyword v =new Throw_and_Throws_Keyword();
		b=v.methodThrowsException();
		try{
			
			b=10;
			return b;
		}catch(IllegalArgumentException e) {
			throw new IllegalArgumentException(); //throw keyword throw specific exception 
		}
	}
	
}
