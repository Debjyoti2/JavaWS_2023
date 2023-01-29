package com.pwb.polymorphism;

public class CompileTimePolymorphism {

	public void printText() {
		System.out.println("default text");
	}
	
	
	public void printText(String text) {
		System.out.println("text is : " + text);
	}
	
	
	//so same name method will behave differently and its decided during compile time only... that which method body will get executed.
	
	public static void main(String[] args) {
		CompileTimePolymorphism m = new CompileTimePolymorphism();
		m.printText();
		m.printText("BC");
	}
	
	
}
