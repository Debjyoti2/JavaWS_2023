package com.studentManagementApp;

import java.util.Scanner;

public class StudentUpdate_Runner {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student stud =  new Student();
		
		System.out.println("Updating Student............");
		
		System.out.println("Please enter student Id , you need a update");
		stud.setStudentId(sc.nextInt());
		
		System.out.println("Please enter student new Name");
		stud.setStudentName(sc.next());
		
		System.out.println("Please enter student new age");
		stud.setStudentAge(sc.nextInt());
		
		System.out.println("Please enter student new Mobile No");
		stud.setMobileNo(sc.nextLong());
		
		
		StudentManagement.manageStudents(stud,OperationType.UPDATE_STUDENT.getValue());
		
		
		
	}

}
