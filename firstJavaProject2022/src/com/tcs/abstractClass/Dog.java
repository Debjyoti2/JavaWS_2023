package com.tcs.abstractClass;

public class Dog extends Animal{

	@Override
	public void bark() {
		System.out.println("Now Bow");
		
	}
	
	//abstract class r object hoy na
	
	//abstract class extends kore je concrete class tar object baniye nao
	
	public static void main(String[] args) {
		//Animal a = new Animal(); not possible
		Dog d = new Dog(); //possible
	}
	
	

}
