package com.pwb.inheritance_in_interfaces;

public class MyClass implements ChildInterface{
	
	
	public void sayHiFromChild() {
		System.out.println("Hi Child");
	}
	
	public void sayHiFromParent() {
		System.out.println("Hi Parent");
	}
	
	public static void main(String[] args) {
		MyClass m = new MyClass();
		m.sayHiFromChild();
		m.sayHiFromParent();
		
	}

}
