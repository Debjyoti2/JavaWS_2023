package com.java8.functional_interface_and_anonymus_class_and_lambda;

public class MainClass {
	
	public static void main(String[] args) {
		
		//its called creating anonymus class
		//when we directly write method body inside main class
		Interface_1 in = new Interface_1() {
			
			@Override
			public void sayHi() {
				System.out.println("Hello from anonymus class");
				
			}
		};
		
		in.sayHi();
		
		
		//same doing by lambda expression
		Interface_1 i2 = ()->System.out.println("First time using lambda expression");
		i2.sayHi();
		
	}

}
