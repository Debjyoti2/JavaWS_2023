package com.pwb.exceptions;

public class MyCustomException extends Exception{
	

	@Override
	public String getMessage() {
		return "Loop exceeds 5 times !!!!!!!!";
	}
	
}
