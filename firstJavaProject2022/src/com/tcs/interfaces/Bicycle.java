package com.tcs.interfaces;

public interface Bicycle {
	
	//we can also declare a properties variable
	final int a =45;
	
	 void speedUp();
	 void applyBreak();
	 
	 default void withbody() {
		 System.out.println("java 1.8 new default method for backward compatibilty");
		 withbody2();
	 }
	
	 static void withbody2() {
		 System.out.println("static method given for utilty functionalities");
	 }
	 
    //interface er method gulo by default public and abstract hoy.
}

//an abstract class can have both abstract method and concrete method
//an interface can have only abstract method

//a child class can extends only 1 abstract class
//a child class can implements more than 1 interfaces

//Java Tutorial: Abstract Classes Vs Interfaces
//Abstract class	Interface
//1. It can contain abstract and non-abstract method	It can only contain abstract methods. We do not need to use the "abstract" keyword in interface methods because the interface is implicitly abstract.
//2. abstract keyword is used to declare an abstract class.	interface keyword is used to declare an interface.
//3.  A sub-class extends the abstract class by using the "extends" keyword.	The "implements" keyword is used to implement an interface.
//4. A abstract class in Java can have class members like private, protected, etc. 	Members of a Java interface are public by default. 
//5. Abstract class doesn't support multiple inheritance.	Multiple inheritance is achieved in Java by using the interface.
