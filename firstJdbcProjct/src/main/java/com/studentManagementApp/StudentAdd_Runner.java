package com.studentManagementApp;

import java.util.Scanner;

public class StudentAdd_Runner {
	
	public static void main(String[] args) {
		
		//add student
		Student stud = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Adding Student.........");
		
		System.out.println("Please enter Student Id :: ");
		stud.setStudentId(sc.nextInt());
		
		System.out.println("Please enter Student Name :: ");
		stud.setStudentName(sc.next());
		
		System.out.println("Please enter Student Age :: ");
		stud.setStudentAge(sc.nextInt());
		
		System.out.println("Please enter Student Roll No :: ");
		stud.setRollNo(sc.nextInt());
		
		System.out.println("Please enter Student Mobile No :: ");
		stud.setMobileNo(sc.nextLong());
		
		
		StudentManagement.manageStudents(stud,OperationType.ADD_STUDENT.getValue());
		
	}

}
