package com.java8;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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
		empList.stream().sorted(Comparator.comparingInt(Employee_3::getSalary)).skip(1).findFirst();
		
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
		intList2.stream().mapToInt(Integer::intValue).sum();
		
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
		
		Integer[]nums = {1,2,3,4,1};
		Long count = Stream.of(nums).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().filter(e->e.getValue()>1).count();
		if(count>0) {
			System.out.println("Atleast 1 duplicate");
		}else {
			System.out.println("All distinct ");
		}

		boolean flag= Stream.of(nums).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
				.stream().anyMatch(e->e.getValue()>1);
		System.out.println("flag is :: " + flag);
		
		//remove white space from string by java 8
		String str1 = "My Name is Debjyoti";
		String[] strarray1 = str1.split("");
		List<String> strList1 = List.of(strarray1);
		System.out.println(strList1);
		StringBuilder sb = new StringBuilder();
		strList1.stream().filter(e->!" ".equals(e)).forEach(e-> sb.append(e));
		System.out.println("String is ::   " + sb.toString());

		String str = Stream.of(str1.split("")).filter(e->!" ".equalsIgnoreCase(e)).collect(Collectors.joining(""));
		System.out.println("str is :: " + str);
		
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

		String str8 = "My Name is Debjyoti";
		String s= Stream.of(str8.split(""))
				.filter(e->!" ".equalsIgnoreCase(e))
				.map(e->e.toLowerCase())
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				.entrySet()
				.stream()
				.filter(e->e.getValue()>1)
				.map(e->e.getKey())
				.findFirst()
				.get();

		//convert into map and check if two maps are same

		List<InvoiceComponent> componentList = List.of(
				new InvoiceComponent(1L,new BigDecimal(500)),
				new InvoiceComponent(2L, new BigDecimal(1000))
		);

		List<ExternalDepo> externalDepoList = List.of(
				new ExternalDepo(100L,1L, new BigDecimal(100)),
				new ExternalDepo(200L,1L, new BigDecimal(300)),
				new ExternalDepo(300L,1L, new BigDecimal(200)),

				new ExternalDepo(400L,2L, new BigDecimal(500)),
				new ExternalDepo(500L,2L, new BigDecimal(500))
		);


		Map<Long,BigDecimal> compMap = componentList.stream().collect(Collectors.toMap(e->e.getCompId(),e->e.getAmount()));

		System.out.println("compMap :: " + compMap);

		Map<Long,BigDecimal> extMap = externalDepoList.stream().collect(Collectors.groupingBy(e->e.getCompId(),Collectors.reducing(BigDecimal.ZERO,e3->e3.getAmount(),BigDecimal::add)));

		System.out.println("extMap :: " + extMap);

		boolean isMapSame = compMap.entrySet().stream().allMatch(e->e.getValue().equals(extMap.get(e.getKey())));

		System.out.println("isMapSame :: " + isMapSame);

		//1) Given a list of integers, separate odd and even numbers?

		List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
		Map<Boolean,List<Integer>> partitionMap = listOfIntegers.stream().collect(Collectors.partitioningBy(e->e%2==0));
		System.out.println("partitionMap :: " + partitionMap);
		List<Integer> evenNums= partitionMap.entrySet().stream().filter(e->e.getKey()).map(e->e.getValue()).findFirst().get();
		System.out.println("evenNums :: " + evenNums);

       //9) How do you merge two unsorted arrays into single sorted array using Java 8 streams?

		Integer[] a =  {4, 2, 7, 1};
		Integer[] b =  {8, 3, 9, 5};
		List<Integer> sortedSingleArray = Stream.concat(Stream.of(a),Stream.of(b)).sorted().collect(Collectors.toList());
		System.out.println("sortedSingleArray :: " + sortedSingleArray);

		//11) How do you get three maximum numbers and three minimum numbers from the given list of integers?

		List<Integer> listOfIntegers1 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		List<Integer> min3Nums = listOfIntegers1.stream().sorted(Collections.reverseOrder()).skip(listOfIntegers1.size()-3).collect(Collectors.toList());
		System.out.println("min3Nums :: " + min3Nums);

		List<Integer>max3Nums = listOfIntegers1.stream().sorted(Collections.reverseOrder()).limit(3).collect(Collectors.toList());
		System.out.println("max3Nums :: " + max3Nums);

		//12) Java 8 program to check if two strings are anagrams(contains exact same alphabet) or not?

		String s1 = "RaceCar";
		String s2 = "CarRace";

		String s11=Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		String s22=Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		if(s11.equalsIgnoreCase(s22)){
			System.out.println("Both String are exact same");
		}
		else{
			System.out.println("Both String are not same");
		}

		//18) Reverse each word of a string using Java 8 streams?

		String str3 = "Java Concept Of The Day";
		String str4 = Stream.of(str3.split(" ")).map(e->new StringBuilder(e).reverse()).collect(Collectors.joining(" "));
		System.out.println("str4 :: " + str4);

		//22) How do you find the most repeated element in an array?

		List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
		String most= listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				 .entrySet()
				 .stream().sorted(Comparator.comparing(e->e.getValue()))
				 .skip(listOfStrings.stream().distinct().toList().size()-1)
				 .map(e->e.getKey()).findFirst().get();
		System.out.println("most :: " + most);

		//23) Palindrome program using Java 8 streams

		String str9 = "ROTATOR";
		char[] str9char = str9.toCharArray();
		int count1=0;
		for(int i=0;i<str9char.length;i++){
			if(str9char[i]!=str9.charAt(str9.length()-1-i)){
				count1++;
				System.out.println("Not a Palindrome !!");
				return;
			}
		}
		if(count1==0){
			System.out.println("Is a Palindrome !!");
		}

		//java 8
		boolean iscount= IntStream.range(0,str9.length()/2)
				.anyMatch(e->str9.charAt(e)!=str9.charAt(str9.length()-1-e));
		if(iscount){
			System.out.println(">> Is not a Palindrome !!");
		}else {
			System.out.println(">> Is  a Palindrome !!");
		}

		//19. How to find only duplicate elements with its count from the String ArrayList in Java8?
		List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
		Map<String,Long> mp= names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream()
				.filter(e->e.getValue()>1)
				.collect(Collectors.toMap(e->e.getKey(),e->e.getValue()));
		System.out.println("mp :  " +  mp);





	}

}
