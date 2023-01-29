package com.pwb.collectionexcercise;

public class Person {
	
	private String name;
	private int phone;
	private String  email;
	
	public Person(String name,int phone) {
		this.name=name;
		this.phone=phone;
	}
	
	public String getName() {
		return name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void hiFromClass() {
		System.out.println("Hi from Person");
	}

	
	
	
	

}
