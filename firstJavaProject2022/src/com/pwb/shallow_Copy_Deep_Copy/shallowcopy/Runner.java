package com.pwb.shallow_Copy_Deep_Copy.shallowcopy;

public class Runner {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student s1 = new Student();
		s1.setStudentName("Kiran");
		
		Student s2 = (Student) s1.clone();
		s2.setStudentName("Lili");
		
		System.out.println(s1.getStudentName());
		System.out.println(s2.getStudentName());
		
		//shallow copy kora ache by clone interface and clone method tai primitive data type jhar khelo na
		// but ebr Address class lagale jhar khabe .. karon Shallow copy te Address er only reference copy hbe.
		// object copy hbe na
		
		
		Student s3 = new Student();
		s3.setStudentName("Bindu");
		Address a = new Address();
		a.setAddressName("Delhi");
		s3.setAddress(a);
		
		
		Student s4 = (Student) s3.clone();
		s4.setStudentName("Bala");
		s4.getAddress().setAddressName("Burdwan");
		
		System.out.println(s3.getStudentName());
		System.out.println(s3.getAddress().getAddressName());
		
		
		System.out.println(s4.getStudentName());
		System.out.println(s4.getAddress().getAddressName());
		
		
	}

}
