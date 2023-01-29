package com.pwb.exceptions;

public class Example2 {
	
	public int executeTryAlways() throws ArithmeticException {
		
		try {
			for(int i=0;i<5;i++) {
				if(i>2) {
					throw new ArithmeticException();
				}
			}
			return -1;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Closing the connection");
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		Example2 e = new Example2();
		e.executeTryAlways();
	}
	

}
