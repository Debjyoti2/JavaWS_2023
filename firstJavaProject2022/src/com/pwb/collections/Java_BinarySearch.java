package com.pwb.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Java_BinarySearch {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> newEmpList = new ArrayList<Employee>();
		Employee e1 = new Employee(1, "A");
		Employee e2 = new Employee(4, "B");
		Employee e3 = new Employee(3, "C");
		newEmpList.add(e1);
		newEmpList.add(e2);
		newEmpList.add(e3);
		
		newEmpList.sort(new EmpIdComparator());
		for(Employee e : newEmpList) {
			System.out.println(e.getId() + e.getName());
		}
		
		int index = Collections.binarySearch(newEmpList,e1, new EmpIdComparator());
		System.out.println("index is :::" + index);
		
		//copy one list to other , target least at least source list r size ba tar boro hote hbe.
		System.out.println("//copy one list to other");
		ArrayList<Employee> srcEmpList = new ArrayList<Employee>();
		Employee e21 = new Employee(1, "A");
		Employee e22 = new Employee(4, "B");
		Employee e23 = new Employee(3, "C");
		srcEmpList.add(e21);
		srcEmpList.add(e22);
		srcEmpList.add(e23);
		
		ArrayList<Employee> targetList = new ArrayList<Employee>();
		Employee e31 = new Employee(21, "A");
		Employee e32 = new Employee(24, "B");
		Employee e33 = new Employee(23, "C");
		targetList.add(e31);
		targetList.add(e32);
		targetList.add(e33);
		Collections.copy(targetList, srcEmpList);
		for(Employee e : targetList) {
			System.out.println(e.getId() + e.getName());
		}
	}

}
