package com.pwb.shallow_Copy_Deep_Copy.normalcopy;

public class Runner {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setStudentName("Anil");
		
		Student s2 = s1;
		//ekhne only s1 er reference ta s2 te chole elo..
		//s2 te change korle s1 e impact hbe. karon same Student ke point kore6 heap memory te.
		
		s2.setStudentName("Kittu");
		
		System.out.println(s1.getStudentName());
		System.out.println(s2.getStudentName());
		
		
	}
	
	

}
