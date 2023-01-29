package com.tcs.pwb;

//static keyword is used for memory management
public class StaticMethod_Employee {
	
	private String empName;
	private static String company="TCS";
	
	StaticMethod_Employee(String empName){
		this.empName=empName;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	
	public void showEmpName() {
		System.out.println("name is : " + getEmpName());
	}
	
	public static void printHi() {
		System.out.println("say Hi");
		//static method binds to class, not any object.. so any specific functionality which does not uses any object param value
		//for those we can use static method
	}
	
	
	

}
