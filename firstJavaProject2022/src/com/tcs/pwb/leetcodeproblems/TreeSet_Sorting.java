package com.tcs.pwb.leetcodeproblems;

import java.util.TreeSet;

public class TreeSet_Sorting {
	
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Arun");
		Employee e2 = new Employee(2, "Kunal");
		Employee e3 = new Employee(3, "Rahul");
		Employee e4 = new Employee(4, "Pritam");
		
		
		TreeSet<Employee> employees = new TreeSet<Employee>(new Employee_Comparator());
		employees.add(e3);
		employees.add(e1);
		employees.add(e2);
		employees.add(e4);
		//employees.add(null);
		
		//Treeset can insert null values, but HashSet can have null values , but 1 time only.
		
		for(Employee e : employees) {
			System.out.println("Employee :: " + e.getId() + "  " + e.getName());
		}
	}
	
	

}
