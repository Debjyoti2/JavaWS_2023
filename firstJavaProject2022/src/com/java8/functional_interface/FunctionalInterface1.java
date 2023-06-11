package com.java8.functional_interface;

@FunctionalInterface
public interface FunctionalInterface1 {
	
	int multiply2Num(int x,int y);
	
	default int multiply2num(int a , int b) {
		static_method_java8();
		return a*b;
		
	}
	
	static void static_method_java8() {
		System.out.println("Hiii");
	}

	
	//we can add default and static method both in functional interface and normal interface in java 1.8 onwards
	
}
