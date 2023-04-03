package com.practice;

import java.util.HashSet;
import java.util.Set;

public class StudentRunner {
	
	
	public static void main(String[] args) {
		
		Student st1 = new Student();
		st1.setStudentId(1);
		st1.setStudentName("Anil");
		
		Student st2 = new Student();
		st2.setStudentId(1);
		st2.setStudentName("Anil");
		
		System.out.println(st1);
		System.out.println(st2);
		
		System.out.println(st1.equals(st2));
		
		
		Set<Student> studentSet =  new HashSet<Student>();
		studentSet.add(st1);
		studentSet.add(st2);
		System.out.println(studentSet.size());
		
		
		
	}

}
