package com.interviewQstn.whyHashCodeandEqualscomesTogether;

import java.util.Objects;

public class Student {
	
	private int id;
	private String name;
	
	public Student(int id,String name) {
		this.id=id;
		this.name=name;
	}


	@Override
	public boolean equals(Object obj) {
		
		Student that =(Student) obj;
		if(this.id==that.id) {
			return true;
		}
		return false;
		
	}

	@Override
	public int hashCode() {
		return this.id;
	}
	

	
	
	


	
	

}
