package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test3_Java8 {

	public static void main(String[] args) {

		List<Employee_3> empList = new ArrayList<>();
		empList.add(new Employee_3(101, "Siva", 101, "active",2000));
		empList.add(new Employee_3(102, "reddy", 101, "active",5000));
		empList.add(new Employee_3(103, "raju", 102, "inactive",6000));
		empList.add(new Employee_3(104, "sivam", 102, "inactive",4000));
		empList.add(new Employee_3(105, "bob", 103, "active",3500));
		empList.add(new Employee_3(106, "alice", 103, "inactive",3500));
		empList.add(new Employee_3(107, "srinu", 104, "active",3500));
		
		//group by salary
		Map<Integer,List<Employee_3>> empMap = new HashMap<>();
		empMap=empList.stream().collect(Collectors.groupingBy(Employee_3 :: getSalary,Collectors.toList()));
		
		Map<Integer,Long> mpp = empList.stream().collect(Collectors.groupingBy(e->e.getSalary(),Collectors.counting()));
		
		
		//group by count
		Map<Integer,Long> map_groupby_deptid = new HashMap<>(); 
		map_groupby_deptid=empList.stream().collect(Collectors.groupingBy(Employee_3::getDeptId,Collectors.counting()));
		map_groupby_deptid.entrySet().forEach(e->System.out.println("dept is :: " + e.getKey() + "  count is : " + e.getValue()));
		
		//group by dept
		Map<Integer,List<Employee_3>> newMap = empList.stream().collect(Collectors.groupingBy(Employee_3::getDeptId,Collectors.toList()));
        newMap.entrySet().forEach(e-> System.out.println("Dept is :: " + e.getKey() + " Obj : " + e.getValue()));
		
		//group by status
        Map<String,List<Employee_3>> groupbysts = empList.stream().collect(Collectors.groupingBy(Employee_3 :: getStatus,Collectors.toList()));
		groupbysts.entrySet().forEach(e-> System.out.println("Sts is :: " + e.getKey() + " Obj is :: " + e.getValue()));
		
		//grp by sts and count
		Map<String,Long> newmap2 = empList.stream().collect(Collectors.groupingBy(Employee_3::getStatus,Collectors.counting())); 
		newmap2.entrySet().forEach(e->System.out.println("Sts is :: " + e.getKey()  + "  count is :: " + e.getValue()));
		
		//max salary emp
		Employee_3 maxSalObj = empList.stream().max((e1,e2)-> Integer.compare(e1.getSalary(),e2.getSalary())).get();
		System.out.println("maxSalObj is :: " + maxSalObj);
		
		
		
		//max sal emp from each dept
		Map<Integer,List<Employee_3>> grpbydept = empList.stream().collect(Collectors.groupingBy(Employee_3 :: getDeptId,Collectors.toList()));
		
		
		//max value from list
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		Integer value = myList.stream().max((e1,e2)->e1.compareTo(e2)).get();
		System.out.println("max value is : " + value);

		
		//Intermediate operations?  
		 //Filter(Predicate FI)
		 //map
		 //distinct()
		 //flatMap
		
		
		// Terminal operations?
		  //reduce(Consumer FI)
		  //collect()
		
		
		
	}

}
