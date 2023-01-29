package com.pwb.exceptions;

public class MyException extends Exception{

	@Override
	public String getMessage() {
		return super.getMessage() + "Do not put negative number..";
	}
	
	
}
