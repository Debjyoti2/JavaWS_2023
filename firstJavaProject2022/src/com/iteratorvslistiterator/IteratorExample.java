package com.iteratorvslistiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorExample {
	
	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1,"A",10));
		empList.add(new Employee(2,"B",20));
		empList.add(new Employee(3,"C",30));
		
		Iterator<Employee> itr = empList.iterator();
		while (itr.hasNext()) {
			Employee employee = (Employee) itr.next();
			System.out.println(employee);
			if(employee.getEmpId()==1) {
				itr.remove();
			}
		}
		System.out.println(empList);
		
		Iterator<Employee> itr1 = empList.iterator();
		ListIterator<Employee> itr2 = empList.listIterator();
		
	}

}
