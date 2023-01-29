package com.pwb.exceptions;

public class Practice1 {

	public static void main(String[] args) {
		
		//syntax error
		//int a=0 
		
		//logical error
		//any logical issue
		
		
		//runtime error
		try {
			for(int i=0;i<3;i++) {
				System.out.println(i/0);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
