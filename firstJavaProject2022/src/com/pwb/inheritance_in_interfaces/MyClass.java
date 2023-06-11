package com.pwb.inheritance_in_interfaces;

public class MyClass implements ChildInterface{
	
	@Override
	public void sayHiFromChild() {
		System.out.println("Hi Child");
	}
	
	@Override
	public void sayHiFromParent() {
		System.out.println("Hi Parent");
	}
	
	public static void main(String[] args) {
		MyClass m = new MyClass();
		m.sayHiFromChild();
		m.sayHiFromParent();
		
	}

}
