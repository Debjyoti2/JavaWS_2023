package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// filter  (Predicate<? super T> predicate);
// map  (Function<? super T, ? extends R> mapper);
// reduce (Consumer FI)

//System.gc()
//System.exit()


public class Java8_1 {
	
	public static void main(String[] args) {
		List<String> _list1 = List.of("ABC","CDE","FDG","JGHJH");
		_list1.stream().forEach(e->System.out.println(e));
		
		
		List<String> list2 = _list1.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
		System.out.println(list2);
		
		Optional<String> list4 = _list1.stream().filter(e->e.startsWith("A")).findAny();
		
		
		List<Integer> nums =  List.of(1,2,3,4,5,6,7,8,9,9,9,8);
		
		//sqr of num
		nums.stream().filter(e->e>4).map(e->e*e).forEach(e->System.out.println(e));
		
		List<String> courses =  List.of("Spring","Springboot","Java","Jsf");
		courses.stream().forEach(e->System.out.println(e));
		
		//number of char in each course
		courses.stream().map(e->e.length()).forEach(e->System.out.println(e));
		List<Integer> listsize= courses.stream().map(e->e.length()).collect(Collectors.toList());
		courses.stream().forEach(String :: length);
		
		//sum of numbers by reduce method
		Integer sum = nums.stream().reduce(0,(e1,e2)->e1+e2);
		System.out.println(sum);
		nums.stream().reduce(0,(e1,e2)->e1+e2);
		
		
		nums.stream().reduce(0,(e1,e2)->(e1+e2));
		nums.stream().reduce(0,(e1,e2)->e1+e2);
		nums.stream().max((e1,e2)->Integer.compare(e1,e2)).get();
		
		//max number
		Integer maxmum=nums.stream().max((e1,e2)->Integer.compare(e1,e2)).get();
		nums.stream().max((e1,e2)->Integer.compare(e1,e2)).get();
		System.out.println(maxmum);
		
		nums.stream().max((e1,e2)->Integer.compare(e1, e2)).get();
		nums.stream().max((e1,e2)->Integer.compare(e1, e2)).get();

		
		
		//sqr every num and then find sum
		Integer sum2 = nums.stream().map(e1->e1*e1).reduce(0,(e1,e2)->e1+e2);
		System.out.println(sum2);

		Integer sum6 = nums.stream().map(e1->e1*e1).reduce(0,Integer::sum);
		System.out.println("sum6 :::   " + sum6);
		
		//sum of the odd num of a list
		Integer sum3 = nums.stream().filter(e1->e1%2>0).reduce(0,(e1,e2)->e1+e2);
		System.out.println(sum3);
		
		//distinct num
		List<Integer> num5 = nums.stream().distinct().collect(Collectors.toList());
		
		//sorted in reverse order
		nums.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
		//sorted in str length  order
		_list1.stream().sorted(Comparator.comparing(e->e.length())).collect(Collectors.toList());
		
		
		List<Course> courseList = new ArrayList<>();
		courseList.add(new Course("Spring","Framework",2,1000));
		courseList.add(new Course("ASpring","Framework",4,3210));
		courseList.add(new Course("Spring BOOT","Framework",5,4000));
		
		boolean flag = courseList.stream().allMatch(e->e.getReviewScore()>2);
		System.out.println(flag);
		boolean flag2 = courseList.stream().allMatch(e->e.getReviewScore()>2);
		boolean flag3 = courseList.stream().anyMatch(e->e.getReviewScore()>3);
		
		courseList.stream().sorted(new NoOfStudentsComparator()).collect(Collectors.toList());


		//max noOfStudents course
		Course Obj = courseList.stream().max((e1,e2)->Integer.compare(e1.getNoOfStudents(),e2.getNoOfStudents())).get();
		courseList.stream().max((e1,e2)->Integer.compare( e1.getNoOfStudents(),e2.getNoOfStudents())).get();

		Course obj= courseList.stream().max((e1,e2)->Integer.compare(e1.getNoOfStudents(),e2.getNoOfStudents())).get();
		
		courseList.stream().max((e1,e2)->Integer.compare(e1.getNoOfStudents(),e2.getNoOfStudents())).get();
		Integer noofstud = courseList.stream().max((e1,e2)->Integer.compare(e1.getNoOfStudents(), e2.getNoOfStudents())).map(e->e.getNoOfStudents()).get();
		
		courseList.stream().max((e1,e2)->(Integer.compare(e1.getNoOfStudents(),e2.getNoOfStudents()))).get();
		courseList.stream().max((e1,e2)->Integer.compare(e1.getNoOfStudents(),e2.getNoOfStudents())).map(e->e.getNoOfStudents()).get();
		
		courseList.stream().max((e1,e2)->Integer.compare(e1.getNoOfStudents(),e2.getNoOfStudents())).map(e->e.getNoOfStudents()).get();
		//max no of students
		Integer maxnoofStud = courseList.stream().max((e1,e2)->Integer.compare(e1.getNoOfStudents(),e2.getNoOfStudents())).map(e1->e1.getNoOfStudents()).get();
		
		
		//sum of stud having rating >3
		Integer sumofstud= courseList.stream().filter(e->e.getReviewScore()>3).map(e->e.getNoOfStudents()).reduce(0,(e1,e2)->e1+e2);
		System.out.println(sumofstud);
		
		courseList.stream().filter(e->e.getReviewScore()>3).map(e->e.getNoOfStudents()).reduce(0,(e1,e2)->e1+e2);
		
		courseList.stream().filter(e->e.getReviewScore()>3).map(e->e.getReviewScore()).reduce(0,(e1,e2)->e1+e2);
		
		courseList.stream().map(e->e.getNoOfStudents()).forEach(Java8_1::printeachnum);
		
		List<String> strList = List.of("AB","CD");
		
		courseList.stream().filter(e->e.getReviewScore()>3).map(e->e.getNoOfStudents()).reduce(0,(e1,e2)->e1+e2);
		
		
		
		
		
		List<Employee_3> empList = new ArrayList<>();
		empList.add(new Employee_3(101, "Siva", 101, "active",2000));
		empList.add(new Employee_3(102, "reddy", 101, "active",5000));
		empList.add(new Employee_3(103, "raju", 102, "inactive",6000));
		empList.add(new Employee_3(104, "sivam", 102, "inactive",4000));
		empList.add(new Employee_3(105, "bob", 103, "active",3500));
		empList.add(new Employee_3(106, "alice", 103, "inactive",3500));
		empList.add(new Employee_3(107, "srinu", 104, "active",3500));
		
		System.out.println("-----------------------------------"); 
		//group by salary and store in list
		Map<Integer,List<Employee_3>> empg  = empList.stream().collect(Collectors.groupingBy(e->e.getSalary(),Collectors.toList()));
		for(Map.Entry<Integer,List<Employee_3>> mp : empg.entrySet()) {
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		empList.stream().collect(Collectors.groupingBy(e->e.getSalary(), Collectors.toList()));
		
		empList.stream().collect(Collectors.groupingBy(e->e.getSalary(),Collectors.toList()));
		
		
		Map<Integer,List<Employee_3>> map1 = empList.stream().collect(Collectors.groupingBy(e->e.getSalary(),Collectors.toList()));
		
		empList.stream().collect(Collectors.groupingBy(e->e.getSalary(),Collectors.counting()));
		
		empList.stream().collect(Collectors.groupingBy(e->e.getSalary(),Collectors.toList()));
		
		empList.stream().collect(Collectors.groupingBy(e->e.getSalary(),Collectors.counting()));
		
		
		
		//group by salary and store the count
		System.out.println("-----------------------------------"); 
		Map<Integer,Long> mp = empList.stream().collect(Collectors.groupingBy(e->e.getSalary(),Collectors.counting()));
		for(Map.Entry<Integer,Long> ms : mp.entrySet()) {
			System.out.println(ms.getKey());
			System.out.println(ms.getValue());
		}
		
		
		empList.stream().collect(Collectors.groupingBy(e->e.getSalary(),Collectors.counting()));
		
		////group by dept
		Map<Integer,List<Employee_3>>mpss=  empList.stream().collect(Collectors.groupingBy(e->e.getDeptId(),Collectors.toList()));
		
		
		//grp by sts and count
		Map<String,Long> dsfsdf= empList.stream().collect(Collectors.groupingBy(e->e.getStatus(),Collectors.counting()));
		
		System.out.println("-----------------------------------"); 
		//max salary emp
		Employee_3 obj2 = empList.stream().max((e1,e2)->Integer.compare(e1.getSalary(),e2.getSalary())).get();
		System.out.println(obj2);
		
		//max salary
		Integer maxsal = empList.stream().max((e1,e2)->Integer.compare(e1.getSalary(),e2.getSalary())).map(e->e.getSalary()).get();
		System.out.println(maxsal);
		
		empList.stream().max((e1,e2)->Integer.compare(e1.getSalary(),e2.getSalary())).map(e->e.getSalary()).get();
		
		//max sal emp from each dept
		Map<Integer,Employee_3> groupBydeptEmpMaxSal = empList.stream().collect(Collectors.groupingBy(e->e.getDeptId(),Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(e->e.getSalary())), Optional::get)));
		System.out.println("groupBydeptEmpMaxSal  " + groupBydeptEmpMaxSal);

		empList.stream().collect(Collectors.groupingBy(e->e.getSalary(),Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(e->e.getSalary())),Optional::get)));
		
		System.out.println("-----------------------------------"); 
		
		//group by count distinct words
		String str = "welcome to code decode and code decode welcome you";
		String[] strarray = str.split(" ");
		List<String> newlist = List.of(strarray); 
		Map<String,Long> map = newlist.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		for(Map.Entry<String, Long> mp1:map.entrySet()) {
			System.out.println(mp1.getKey());
			System.out.println(mp1.getValue());   
		}
		
		Integer[] numbers = {1,2,31,23,4,2,3,2,3};
		List<Integer> numbers2 = List.of(numbers);
		
		
		System.out.println("-----------------------------------"); 
		
		String str1 = "welcome to code decode and code decode welcome you";
		String[] strArray = str1.split(" ");
		List<String> list1= List.of(strArray);
		Map<String,Long> map2 = list1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		for(Map.Entry<String, Long> mp1 : map2.entrySet()) {
			System.out.println(mp1.getKey());
			System.out.println(mp1.getValue());
		}
		
		System.out.println("-----------------------------------"); 
		
		String str2 = "Programming";
		String[] strarray2 = str2.split("");
		List<String> strList2 = List.of(strarray2);
		Map<String,Long> strMap2 = strList2.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		for(Map.Entry<String,Long> mp2 :strMap2.entrySet()) {
			System.out.println(mp2.getKey() + "  " + mp2.getValue());
		}
		
		
		//by basic java
		Map<String,Integer> stringCountMap =  new HashMap<>();
		for(String s : strList2) {
			if(stringCountMap.containsKey(s)) {
				int value = stringCountMap.get(s);
				stringCountMap.replace(s,value+1);
			}
			else {
				stringCountMap.put(s,1);
			}
		}
		for(Map.Entry<String,Integer> mp2 :stringCountMap.entrySet()) {
			System.out.println("by basic java :::   " + mp2.getKey() + "  " + mp2.getValue());
		}
		
		
		
	}
	
	
	
	
	public int sunm2Num(int x,int y) {
		return x+y;
	}
	//lambda
	//(x,y)->x+y;
	
	
	public static void printeachnum(int num) {
		System.out.println(num);
	}
	
	
	

}
