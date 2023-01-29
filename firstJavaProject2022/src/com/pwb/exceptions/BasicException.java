package com.pwb.exceptions;

public class BasicException {
	
	public static void main(String[] args) {
      
		
		try {
			BasicException e = new BasicException();
			int result =e.devideTwoInteger(5,0);
			System.out.println("result ::: " + result);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		//null pointer exception
		try {
			String a=null;
			Character b = a.charAt(2);
			System.out.println("b is  : " + b);
					
		}catch(NullPointerException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("generic exception");
		}
		
		
		///throw exception
		BasicException e1 = new BasicException();
		e1.eligibleForVoting(2);
		
		
	}
	
	public int devideTwoInteger(int a,int b) {
		return a/b;
	}
	
	public void eligibleForVoting(int age) {
		if(age>18) {
			System.out.println("Ok proceed");
		}else {
			throw new IllegalArgumentException("Not eligible vor voing");
		}
	}

}
