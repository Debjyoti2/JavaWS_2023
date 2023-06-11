package com.pwb.How_To_Make_a_Immutable_class;

import java.util.ArrayList;
import java.util.List;

/*

1. class should be final so no one can extend it.
2. member variable must be private , cant be accessed directly from outside.
3. member variable should be final.
4. should not be any setter , 1st time set through constructor.
4. just like String class 


*/ 

public final class Student {
	
	private final int id;
	private final String name;
	private  List<String> hobbies;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public List<String> getHobbies() {
		
		List<String> newhobbies = new ArrayList<String>();
		for(String hobby : hobbies) {
			newhobbies.add(hobby);
		}
		return newhobbies;
	}
	
	
	public Student(int id, String name, List<String> hobbies) {
		super();
		this.id = id;
		this.name = name;
		this.hobbies = new ArrayList<>();
		for(String hobby : hobbies) {
			this.hobbies.add(hobby);
		}
	}
	

}



