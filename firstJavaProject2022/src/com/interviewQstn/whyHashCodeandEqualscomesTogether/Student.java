package com.interviewQstn.whyHashCodeandEqualscomesTogether;

public class Student {
	
	private int id;
	private String name;
	
	public Student(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	@Override
	public boolean equals(Object o) {
		Student o1 =(Student) o;
		if(this.id==o1.id) {
			return true;
		}
		return false;
			
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}

	/*
	 * @Override public String toString() { return "Student [id=" + id + ", name=" +
	 * name + "]"; }
	 */
	
	

}
