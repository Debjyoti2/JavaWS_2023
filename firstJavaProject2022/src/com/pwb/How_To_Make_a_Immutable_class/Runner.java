package com.pwb.How_To_Make_a_Immutable_class;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		
		List<String> hobbies = new ArrayList<>();
		hobbies.add("Cricket");
		Student s = new Student(1, "Kittu", hobbies);
		
		
		//hobbies.add("Football"); // no effect due to modified constructor
		s.getHobbies().add("Football"); // no effect due to modified getter method
		
		System.out.println(s.getId() + "  " + s.getName() + " "  + s.getHobbies() );
		
		

	}

}
