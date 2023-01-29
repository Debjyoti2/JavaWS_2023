package com.tcs.pwb;

public class BiNumbers {
	
	private int number1;
	private int number2;
	
	public BiNumbers(int a,int b) {
		this.number1=a;
		this.number2=b;
	}
	
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1=number1;
	}
	
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2=number2;
	}

	public int addNumber() {
		return this.number1+this.number2;
	}
	public int multiply() {
		return this.number1*this.number2;
	}
	public void doubleNumber() {
		this.number1=2*this.number1;
		this.number2=2*this.number2;

	}
}
