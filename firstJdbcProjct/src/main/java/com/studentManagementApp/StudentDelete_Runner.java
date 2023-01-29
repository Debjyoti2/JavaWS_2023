package com.studentManagementApp;

import java.util.Scanner;

public class StudentDelete_Runner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student stud = new Student();
		
		System.out.println("Deleting Student........");
		System.out.println("Please enter Student Id to Delete");
		stud.setStudentId(sc.nextInt());
		
		StudentManagement.manageStudents(stud,OperationType.DELETE_STUDENT.getValue());

	}

}
