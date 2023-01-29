package com.tcs.pwb;

import java.util.ArrayList;

public class Students {
	
	//one problem with array is we can't dynamically add/remove elements from an array.
	//thats why we use arraylist in place of an array.
	
	
	private String studentName;
	private int studentMarks;
	ArrayList<Students> students = new ArrayList<Students>();
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}
	public int getStudentMarks() {
		return studentMarks;
	}
	public void setStudentMarks(int studentMarks) {
		this.studentMarks=studentMarks;
	}
	
	
	public void addStudents(Students stu) {
		students.add(stu);
		
	}
	
	public void removeStudentsByName(String name) {
		int index=0;
		for(Students ss1 : students) {
			index++;
			if(ss1.getStudentName().equalsIgnoreCase(name)) {
				students.remove(index-1);
				break;
			}
		}
		
	}
	
	public void iterateStudentsList() {
		if(students.size()>0) {
			for(Students ss : students) {
				System.out.println("Each Students are :: " + ss.getStudentName() + " and marks is : " + ss.getStudentMarks());
			}
		}
		else {
			System.out.println("No Students Available!!!");
		}
		
	}
	
}
