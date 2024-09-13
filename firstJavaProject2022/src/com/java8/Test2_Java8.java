package src.com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2_Java8 {

	public static void main(String[] args) {

		//create a list and print even number from that
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
		list1.stream().filter(e->e%2==0).forEach(e->System.out.println(e));
		//filter takes Predicate interface values --predicate gives boolean value if true , then gives back the exam..
		
		List<Integer> list2 =  List.of(1,2,3,4,5,6);
		list2.stream().map(e->e*e).forEach(e->System.out.println(e));
		
		List<String> lines = Arrays.asList("spring", "node", "mkyong");
		lines.stream().filter(e->!"mkyong".equalsIgnoreCase(e)).forEach(e->System.out.println(e));
		
		
		//3
		Employee e1= new Employee(1,"Amit",20);
		Employee e2= new Employee(12,"Fata",50);
		Employee e3= new Employee(31,"Kittu",93);
		List<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		Employee filteremp = employees.stream().filter(e->"Amit".equals(e.getEmpName())  && e.getEmpAge()<30).findAny().orElse(null);
		System.out.println("filteremp :: " + filteremp.toString());
		
		//from emp list get 1 particualr emp name in string 
		// from emp list get all emp names in List<String>
		
		
		String empName= employees.stream().filter(e->"Fata".equalsIgnoreCase(e.getEmpName())).map(e->e.getEmpName()).findAny().orElse("Not Found");
		System.out.println("empName is :: " + empName); 
		
		List<String>  newnames =  employees.stream().map(e->e.getEmpName()).collect(Collectors.toList());
		System.out.println("newnames is ::" + newnames); 
		
		//a list of string to uppercase
		
		List<String> names = List.of("hgad","jha","kjsakjjhjh");
		List<String> mod_names = names.stream().map(e->e.toUpperCase()).collect(Collectors.toList());
		System.out.println("mod_names :: " + mod_names);
		
		
		
		
		
		
		
		
		
		
	}

}
