package com.pwb.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentsRunner {
	
	public static void main(String[] args) {
		Students s1 = new Students(121, "Arun",24);
		Students s2 = new Students(24, "Kittu",43);
		Students s3 = new Students(1, "Danoj",12);
		
		
		ArrayList<Students> studentsAl = new ArrayList<Students>();
		studentsAl.add(s1);
		studentsAl.add(s2);
		studentsAl.add(s3);
		
 		//Collections.sort(studentsAl);
 		
		System.out.println("------Original List---------\n\n");
		
 		for(Students s : studentsAl) {
 			System.out.println(s.getId() + s.getName() + s.getAge());
 		}
		
 		//with iterator
 		Iterator<Students> it = studentsAl.iterator();
 		while(it.hasNext()) {
 			it.next();//gave next element
 			it.remove();
 		}
 		
		
		System.out.println("------Sorting by id---------\n\n");
		
		studentsAl.sort(new StudentsIdComparator());
		
		for(Students s : studentsAl) {
			System.out.println(s.getId() + s.getName() + s.getAge());
		}
		
		
		System.out.println("------Sorting by age---------\n\n");
		
		studentsAl.sort(new StudentsAgeComparator());
		
		for(Students s : studentsAl) {
			System.out.println(s.getId() + s.getName() + s.getAge());
		}
		
        System.out.println("------Sorting by name---------\n\n");
		
		studentsAl.sort(new StudentsNameComparator());
		
		for(Students s : studentsAl) {
			System.out.println(s.getId() + s.getName() + s.getAge());
		}
		
	}

}
