package com.singleton_class;

public class Employee_Singleton_Runner {

	public static void main(String[] args) {

		Employee_Singleton e =Employee_Singleton.getInstance();
		
		System.out.println(e.getCompanyName());
		System.out.println(e.getDeptName());
		

	}

}
