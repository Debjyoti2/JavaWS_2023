package com.tcs.pwb;

public class Person {
	
	public String name,address,aadhar,pan,gender,education,city,state,country;
	public int age,mobile,income;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	
	
	public void printNameNAge(String name, String age) {
		System.out.println("Name is : " + name + " Age is : " + age);
		
	}
	
	

}
