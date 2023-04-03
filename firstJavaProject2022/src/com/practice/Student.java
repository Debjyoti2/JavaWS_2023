package com.practice;

public class Student {
 
	private int studentId;
	private String studentName;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	@Override
	public boolean equals(Object Obj) {
		Student that = (Student) Obj;
		return this.studentId==that.studentId;
	}
	
	@Override
	public int hashCode() {
		return this.studentId;
	}
	
	
}
