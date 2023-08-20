package com.iteratorvslistiterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
	
	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1,"A",10));
		empList.add(new Employee(2,"B",20));
		empList.add(new Employee(3,"C",30));
		
		ListIterator<Employee> itr = empList.listIterator();
		while(itr.hasNext()) {
			Employee emp = itr.next();
			System.out.println(emp);
		}
		
		while(itr.hasPrevious()) {
			Employee emp = itr.previous();
			System.out.println(emp);
		}
		
		while(itr.hasPrevious()) {
			Employee emp = itr.previous();
			System.out.println(emp);
			if(emp.getEmpId()==1) {
				itr.remove();
				itr.add(new Employee(5, "E", 50));
			}
		}
		
	}

}
