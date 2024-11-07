package com.java8.coding_problems;

import com.java8.Employee_3;

import java.util.*;
import java.util.stream.Collectors;


public class Highest_paid_employee_from_each_dept {

	public static void main(String[] args) {


		List<Employee_3> empList = new ArrayList<>();
		empList.add(new Employee_3(101, "Siva", 101, "active",2000));
		empList.add(new Employee_3(102, "reddy", 101, "active",5000));
		empList.add(new Employee_3(103, "raju", 102, "inactive",6000));
		empList.add(new Employee_3(104, "sivam", 102, "inactive",4000));
		empList.add(new Employee_3(105, "bob", 103, "active",3900));
		empList.add(new Employee_3(106, "alice", 103, "inactive",3500));
		empList.add(new Employee_3(107, "srinu", 104, "active",3500));
		
		//emp have max salary
		Employee_3 emp = empList.stream().max((e1,e2)->Integer.compare(e1.getSalary(),e2.getSalary())).get();
		System.out.println("emp is :: " + emp);
		
		//group by dept id , emp having max salary
		Map<Integer,Employee_3> groupBydeptEmpMaxSal = empList.stream().collect(Collectors.groupingBy(e->e.getDeptId(), Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(e->e.getSalary())), Optional::get)));
		System.out.println("groupBydeptEmpMaxSal  " + groupBydeptEmpMaxSal);
		
		Map<Integer,Employee_3> groupBydeptEmpMaxSal_Practice1=  empList.stream().collect(Collectors.groupingBy(e->e.getDeptId(), Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(e->e.getSalary())), Optional :: get)));
		
		
	
	}
	
	
	
	

}
