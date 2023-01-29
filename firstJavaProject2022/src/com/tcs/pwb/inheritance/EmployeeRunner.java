package com.tcs.pwb.inheritance;

public class EmployeeRunner {

	public static void main(String[] args) {

		Employee e = new Employee("TCS");
		e.setPhone(121);
		e.setEmail("email");
		e.setTitle("title");
		e.setGrade("ITA");
		e.setSalary(100000);
		
		e.printAllDetails();
		
		e.hiFromClass();
		

	}

}
