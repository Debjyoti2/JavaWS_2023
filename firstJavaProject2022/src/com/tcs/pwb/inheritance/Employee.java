package com.tcs.pwb.inheritance;


//multiple inheritance is not allowed in java

public class Employee extends Person{
	
	private String title;
	private String employerName;
	private String grade;
	private int salary;
	
  	public Employee(String employerName) {
  		super("Parent");
  		this.employerName=employerName;
  	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmployerName() {
		return employerName;
	}
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public void printAllDetails() {
		System.out.println(super.getName() +"#" + super.getPhone() + "#" + super.getEmail() + "###" + getTitle() + "#" + getEmployerName() + "#" + 
	getGrade() + "#" +getSalary());
	}

	
	@Override
	public void hiFromClass() {
		System.out.println("Hi from Employee"); 
	}
}
