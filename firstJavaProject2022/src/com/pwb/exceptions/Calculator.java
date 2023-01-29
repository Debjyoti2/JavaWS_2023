package com.pwb.exceptions;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) throws CalculatorCustomException {
		
		System.out.println("Java Calculator :::");
		final String validInputs ="0123456789";
		final String operations ="+-*/";
		
		User user = new User(1,"kittu");
		
		try {
			int result=0;
			System.out.println("Please enter 1st input ::");
			Scanner sc = new Scanner(System.in);
			int a= sc.nextInt();
			
			System.out.println("Please enter 2nd input ::");
			int b= sc.nextInt();
			
			System.out.println("Now Choose Operation ::\n"
					+ "+ for addition"
					+ "- for substraction"
					+ "* for multliplication"
					+ "/ for division");
			
			String op = sc.next();
			
			if(operations.indexOf(op)==-1) {
				throw new CalculatorCustomException("invalid opetaion exception", user); //invalid opetaion exception
			}
			else if(validInputs.indexOf(String.valueOf(a))==-1 || validInputs.indexOf(String.valueOf(b))==-1) {
				throw new CalculatorCustomException("invalid input exception",user); //invalid input exception
			}
			else if(b<1) {
				throw new CalculatorCustomException("cant devide by 0 exception",user); //cant devide by 0 exception
			}
			else if(a>1000 || b>1000) {
				throw new CalculatorCustomException("no inout cant be more than 1000", user);  //no inout cant be more than 1000
			}
			else {
				if("+".equalsIgnoreCase(op)) {
					result = a+b;
				}
				else if("-".equalsIgnoreCase(op)) {
					result = a-b;
				}
				else if("*".equalsIgnoreCase(op)) {
					result = a*b;
				}
				else if("/".equalsIgnoreCase(op)) {
					result = a/b;
				}
			}
			
			System.out.println("Result is ::" + result);
			
			
		}catch(Exception e) {
			throw new CalculatorCustomException("exception occurred", user);
		}
		
	}

}
