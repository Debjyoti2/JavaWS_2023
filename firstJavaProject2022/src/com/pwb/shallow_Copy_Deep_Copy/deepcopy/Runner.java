package com.pwb.shallow_Copy_Deep_Copy.deepcopy;

public class Runner {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
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
