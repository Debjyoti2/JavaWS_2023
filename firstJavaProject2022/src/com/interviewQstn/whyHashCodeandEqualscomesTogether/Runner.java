package com.interviewQstn.whyHashCodeandEqualscomesTogether;

import java.util.HashSet;
import java.util.Set;

public class Runner {

	public static void main(String[] args) {

		Student s1 = new Student(1,"Kittu");
		Student s2 = new Student(1,"Kittu");
		
		System.out.println(s1.equals(s2));
		
		
		
		Set<Student> stuset = new HashSet<>();
		stuset.add(s1);
		stuset.add(s2);
		System.out.println(stuset);

	}

}
