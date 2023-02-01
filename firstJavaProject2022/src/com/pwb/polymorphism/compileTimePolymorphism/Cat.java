package com.pwb.polymorphism.compileTimePolymorphism;

public class Cat extends Animal{

	@Override
	public void bark() {
		System.out.println("Meow Meow");
	}

	public void method_cat() {
		System.out.println("method_cat");
	
	}
	
}
