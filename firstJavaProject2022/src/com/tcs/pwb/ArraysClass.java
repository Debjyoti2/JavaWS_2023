package com.tcs.pwb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysClass {

	public static void main(String[] args) {

	int[] studentsMarks=new int[5];
	studentsMarks[0]=10;
	studentsMarks[1]=20;
	studentsMarks[2]=30;
	int sumOfMarks=0;
	for(int i:studentsMarks) {
		sumOfMarks+=i;
	}
	System.out.println("sumOfMarks is :  " + sumOfMarks);
	
	
	int[] studentsMarks2 = {10,20,30,40,50};
	int sumOfMarks2=0;
	for(int i:studentsMarks2) {
		sumOfMarks2+=i;
	}
	System.out.println("sumOfMarks2 is :  " + sumOfMarks2);
	
	
	int [][] studentsIdMarks = {{1,2},{3,4},{5,6}};
	for(int i1=0;i1<studentsIdMarks.length;i1++) {
		for (int j1=0;j1<studentsIdMarks[i1].length;j1++) {
			System.out.println("Array is : " + studentsIdMarks[i1][j1]);
		}
	}
	
	List<String> students = new ArrayList<String>();
	students.add("Rahul");
	students.add("Partha");
	students.add("Amit");
	
	String[] studentsArray = new String[students.size()];
	int i=0;
	for(String i11:students) {
		studentsArray[i]=i11;
		i++;
	}
	for(String jj:studentsArray) {
		System.out.println("Students are :  " + jj);
	}
	
	//length of 8 array
	int [] newArray = {1,2,3,4,5,6,7,8};
	System.out.println("Direct array are : " + Arrays.toString(newArray));
	for(int i3 : newArray) {
		System.out.println("array elements are : " + i3);
	}
	
	
	
	// array of a Object Class
	System.out.println("\n\narray of a Object Class: ");
	PersonClass[] personsArray = new PersonClass[2];
	PersonClass p1 = new PersonClass();
	p1.setId(1);
	p1.setName("A");
	p1.setAge(25);
	personsArray[0]=p1;

	PersonClass p2 = new PersonClass();
	p2.setId(2);
	p2.setName("B");
	p2.setAge(35);
	personsArray[1]=p2;

	for(int ii=0;ii<personsArray.length;ii++) {
		System.out.println("Name is :" + personsArray[ii].getName() + "\nId is  : " + personsArray[ii].getId() + "\nAge is : " + personsArray[ii].getAge());
	}
	
	
	int[] marks= new int[5];
	Arrays.fill(marks, 100);
	System.out.println(Arrays.toString(marks));
	
	}
	
}
