package com.studentManagementApp;

import java.util.Scanner;

public class FetchStudent_Runner {

	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
		Student stud = new Student();
		
		System.out.println("Fetching student...........");
		System.out.println("Please enter student id to fetch details"); 
		
		stud.setStudentId(sc.nextInt());
		
		StudentManagement.manageStudents(stud, OperationType.FETCH_STUDENT.getValue());
		
		

	}

}
