package com.generics.practice2;

public class Class_Level_Generics_Runner {

	public static void main(String[] args) {
		
		Class_Level_Generics<Integer> i1 = new Class_Level_Generics<>();
		i1.setObj(1);
		System.out.println(i1.getObj());
		
		Class_Level_Generics<String> i2 = new Class_Level_Generics<>();
		i2.setObj("A");
		System.out.println(i2.getObj());
		
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Kittu");
		
		Class_Level_Generics<Employee> ee = new Class_Level_Generics<>();
		ee.setObj(employee);
		System.out.println(ee.getObj().toString());
		

	}

}
