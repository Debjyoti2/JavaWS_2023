package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestJava8 {

	public static void main(String[] args) {

		List<Employee_3> empList = new ArrayList<>();
		empList.add(new Employee_3(101, "Siva", 101, "active",2000));
		empList.add(new Employee_3(102, "reddy", 101, "active",5000));
		empList.add(new Employee_3(103, "raju", 102, "inactive",6000));
		empList.add(new Employee_3(104, "sivae", 102, "inactive",4000));
		empList.add(new Employee_3(105, "bob", 103, "active",3500));
		empList.add(new Employee_3(106, "alice", 103, "inactive",3500));
		empList.add(new Employee_3(107, "srine", 104, "active",3500));
		
		
		//sorting emp based on salary
		List<Employee_3> empListsorted1 = empList.stream().sorted(Comparator.comparing(Employee_3::getSalary)).collect(Collectors.toList());
		System.out.println("empListsorted1 :: " +empListsorted1);
		
		empList.stream().sorted(Comparator.comparing(Employee_3 :: getSalary)).collect(Collectors.toList());
		
		empList.stream().sorted(Comparator.comparing(Employee_3 :: getSalary)).collect(Collectors.toList());
		
		
		empList.stream().sorted(Comparator.comparing(Employee_3 :: getSalary)).collect(Collectors.toList());
		
		//2nd highest
		empList.stream().sorted(Comparator.comparingInt(Employee_3 :: getSalary)).skip(1).findFirst();
		
		//group by salary
		Map<Integer,List<Employee_3>> empMap = new HashMap<>();
		empMap=empList.stream().collect(Collectors.groupingBy(Employee_3 :: getSalary,Collectors.toList()));
		
		Map<Integer,Long> mpp = empList.stream().collect(Collectors.groupingBy(e->e.getSalary(),Collectors.counting()));
		
		empList.stream().collect(Collectors.groupingBy(e->e.getSalary(),Collectors.toList()));
		empList.stream().collect(Collectors.groupingBy(e->e.getStatus(),Collectors.counting()));
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
		Map<String,Long> newmap2 = empList.stream().collect(Collectors.groupingBy(e->e.getStatus(),Collectors.counting()));
		newmap2.entrySet().forEach(e->System.out.println("Sts is :: " + e.getKey()  + "  count is :: " + e.getValue()));
		
		//max salary emp
		Employee_3 maxSalObj = empList.stream().max((e1,e2)-> Integer.compare(e1.getSalary(),e2.getSalary())).get();
		System.out.println("maxSalObj is :: " + maxSalObj);
		
		Integer maxsal  = empList.stream().max((e1,e2)->Integer.compare(e1.getSalary(),e2.getSalary())).map(e->e.getSalary()).get();
		
		Integer maxsal3 = empList.stream().max((e1,e2)->Integer.compare(e1.getSalary(),e2.getSalary())).map(e->e.getSalary()).get();
		
		
		empList.stream().max((e1,e2)->Integer.compare(e1.getSalary(),e2.getSalary())).map(e->e.getSalary());
		empList.stream().max((e1,e2)->Integer.compare(e1.getSalary(),e2.getSalary())).get();
		
		empList.stream().sorted(Comparator.comparing(Employee_3 :: getSalary)).collect(Collectors.toList());
		
		//max sal emp from each dept
		Map<Integer,List<Employee_3>> grpbydept = empList.stream().collect(Collectors.groupingBy(Employee_3 :: getDeptId,Collectors.toList()));
		
		
		//max value from list
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		Integer value = myList.stream().max((e1,e2)->e1.compareTo(e2)).get();
		System.out.println("max value is : " + value);
		
		myList.stream().max((e1,e2)->Integer.compare(e1,e2)).get();

		
		//Intermediate operations?  
			 //Filter (Predicate FI)
			 //map (Function FI)
			 //distinct()
			 //flatMap
			 //sorted()
		
		
		// Terminal operations?
			  //reduce
			  //collect()
			  //max
			  //forEach(Consumer FI`)
		
		Map<String,Long> map = empList.stream().collect(Collectors.groupingBy(e->e.getEmpName(),Collectors.counting()));
		long totalcount=0;
		for(Map.Entry<String,Long> m : map.entrySet()) { 
			if(m.getKey().endsWith("e")) {
				totalcount = totalcount+ m.getValue();
			}
		}
		System.out.println("totalcount : " + totalcount);
		
		Map<Object, List<Employee_3>> map2 = empList.stream().collect(Collectors.groupingBy(e->e.getEmpName()));
		
		
		//sort emp based on salary
		List<Employee_3> sortedempList= empList.stream().sorted(Comparator.comparing(Employee_3 :: getSalary).reversed()).collect(Collectors.toList());
		System.out.println("sortedempList :: " + sortedempList);
		
		//short circuit operation
		List<Employee_3> st3sortedempList= sortedempList.stream().limit(3).collect(Collectors.toList());
		System.out.println("st3sortedempList :: " + st3sortedempList);
		
		List<Employee_3> skippedsortedempList= sortedempList.stream().skip(3).collect(Collectors.toList());
		System.out.println("skippedsortedempList :: " + skippedsortedempList);
		
		Integer[] intarray = {2,3,4,5,7};
		List<Integer> intList2 = List.of(intarray);
		Integer sum = intList2.stream().reduce(0,(e1,e2)->(e1+e2));
		System.out.println("sum :: " + sum);
		
		intList2.stream().reduce(0,(e1,e2)->(e1+e2));
		
		empList.stream().map(e->e.getSalary()).reduce(0,(e1,e2)->(e1+e2));
		
		
		//find duplicate by java 8
		Integer[] intarray2 = {1,2,3,4,1,2};
		List<Integer> intList = List.of(intarray2);
		
		Set<Integer> set = new HashSet<Integer>();
		
		Set<Integer> duplicate = intList.stream().filter(e->!set.add(e)).collect(Collectors.toSet());
		System.out.println("duplicate :: " + duplicate);
		
		
		
		//7. Given a String, find the first non-repeated character in it using Stream functions?
		String input = "Java articles are Awesome";
		
		String firstnonchar = Stream.of(input.split("")).filter(e->!" ".equals(e)).map(e->e.toLowerCase()).
				              collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
				              .entrySet().stream().filter(e->e.getValue()<2).findFirst().map(e->e.getKey()).get();
		System.out.println(firstnonchar);
		
		
		//8. Given a String, find the first repeated character in it using Stream functions?
		
		String input2 = "Java Articles are Awesome";
		String firstrepchar = Stream.of(input2.split("")).filter(e->!" ".equals(e)).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new ,Collectors.counting()))
				.entrySet().stream().filter(e->e.getValue()>1).findFirst().map(e->e.getKey()).get();
		System.out.println(firstrepchar);
		
		
		
		//11. Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
		
		Integer[]nums = {1,2,3,4};
		Long count = Stream.of(nums).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().filter(e->e.getValue()>1).count();
		if(count>0) {
			System.out.println("Atleast 1 duplicate");
		}else {
			System.out.println("All distinct ");
		}
		
		
		//remove white space from string by java 8
		String str1 = "My Name is Debjyoti";
		String[] strarray1 = str1.split("");
		List<String> strList1 = List.of(strarray1);
		System.out.println(strList1);
		StringBuilder sb = new StringBuilder();
		strList1.stream().filter(e->!" ".equals(e)).forEach(e-> sb.append(e));
		System.out.println("String is ::   " + sb.toString());
		
		
		
		List<String> strList4 =  List.of("Apple","Banana","Mango");
		Map<Object,Object> mppp = strList4.stream().collect(Collectors.toMap(e->String.valueOf(e), e->strList4.indexOf(e)));
		System.out.println(mppp);


		//remove white space from string by java 8
		String str5 = "My Name is Debjyoti";
		String str6= Stream.of(str5.split("")).filter(e->!" ".equals(e)).collect(Collectors.joining());
		System.out.println("str6 :: " + str6);

		//find 1st repeated char
		String str7 = "My Name is Debjyoti";
		String c = Stream.of(str7.split("")).filter(e->!" ".equals(e))
				.map(e->e.toLowerCase())
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(e->e.getValue()>1)
				.map(e->e.getKey())
				.findFirst()
				.get();

		System.out.println("1st repeated char of :: " + str7 + " is " + c);

		//find duplicate by java 8
		Integer[] intarray4 = {1,2,3,4,1,2};
		Set<Integer> duplicates = new HashSet<>();
		Stream.of(intarray4).filter(e->!duplicates.add(e)).collect(Collectors.toList()).forEach(e-> System.out.println(e));
		
	}

}
