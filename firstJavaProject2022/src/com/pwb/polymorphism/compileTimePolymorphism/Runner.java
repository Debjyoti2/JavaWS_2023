package com.pwb.polymorphism.compileTimePolymorphism;

public class Runner {

	public static void main(String[] args) {
		
	 Animal a = new Animal();
	 a.bark(); //Dot Know
	 
	 Animal b = new Dog();
	 //b.method_animal(); --getting from Animal class bcs we are crating instance of Animal class.
	 //but as bark is overide in Dog class and we are creating Obj of Dog class , so Dog clas bark is called
	 
	 b.bark(); //Bhow Bhow...its using bark method from Animal Class , but implementing method from Dog class 
		
	}
}
