package com.java8.in28Min.Course;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Practice2 {

	public static void main(String[] args) {

		List<Integer> nums =  List.of(1,2,3,4,5,6,7,8,9,9,9,8);

		//sum of numbers by reduce method
		BinaryOperator<Integer> sumAccumulator = (e1,e2)->e1+e2;
		
		BinaryOperator<Integer> sumAccumulator2 =  new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer e1, Integer e2) {
				return e1+e2;
			}
		};
		
		Integer sum = nums.stream().reduce(0,sumAccumulator2);
		System.out.println("Sum is :: " + sum);
		
		
		
		
		List<Course> courseList =  List.of(new Course("Spring","Framework",2,1000),
				new Course("ASpring","Framework",4,3210),
				new Course("Spring BOOT","Framework",5,4000),
				new Course("API","Framework",1,1000),
				new Course("Microservices","Framework",2,2000)
				);
		
		boolean value1 = courseList.stream().allMatch(e->e.getReviewScore()>5);
		System.out.println("Value1 : " + value1);
		
		boolean value2 = courseList.stream().anyMatch(e->e.getReviewScore()>1);
		System.out.println("value2 :: " + value2);
		
		boolean value3 =  courseList.stream().noneMatch(e->e.getReviewScore()>5);
		System.out.println("value3 : " + value3);
		
		
		//sorting on custom class
		List<Course> sortedcourseList = courseList.stream().sorted(new NoOfStudentsComparator()).collect(Collectors.toList());
		System.out.println("sortedcourseList :: " + sortedcourseList);
		
		//max noOfStudents course
		Course obj = courseList.stream().max((e1,e2)->Integer.compare(e1.getNoOfStudents(),e2.getNoOfStudents())).get();
		System.out.println("max stud obj is :: " + obj);
		
		//max no of students
		Integer maxNumOfstud = courseList.stream().max((e1,e2) -> Integer.compare(e1.getNoOfStudents(),e2.getNoOfStudents())).map(e->e.getNoOfStudents()).get();
		System.out.println("max no of stud  is :: " + maxNumOfstud);
		
		//sum of stud having rating >3
		Integer sumOfStud= courseList.stream().filter(e->e.getReviewScore()>3).map(e->e.getNoOfStudents()).reduce(0,(e1,e2)->e1+e2);
		System.out.println("sum Of Stud is :: " + sumOfStud);
		

	}

}
