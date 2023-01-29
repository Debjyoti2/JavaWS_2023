package com.pwb.collections;

public class Students implements Comparable<Students>{
	
	private int id;
	private String name;
	private int age;
	
	Students(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Students o) {
		return Integer.compare(this.id, o.id);
	}


	
	
	

}
