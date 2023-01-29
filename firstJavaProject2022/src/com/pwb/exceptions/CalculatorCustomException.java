package com.pwb.exceptions;

public class CalculatorCustomException extends Exception{

	CalculatorCustomException(String errormsg, User user){
		System.out.println(errormsg + user.getEmpid() + user.getEmpName());
	}
	
}
