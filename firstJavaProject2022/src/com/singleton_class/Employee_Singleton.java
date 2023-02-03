package com.singleton_class;

public class Employee_Singleton {
	
	
	private Employee_Singleton() {
		
	};
	
	
	private static Employee_Singleton Employee_SingletonObj;
	
	public static Employee_Singleton getInstance() {
		if(Employee_SingletonObj==null) {
			Employee_SingletonObj = new Employee_Singleton();
		}
		return Employee_SingletonObj;
	}
	

}
