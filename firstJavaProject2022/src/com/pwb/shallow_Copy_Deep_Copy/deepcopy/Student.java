package com.pwb.shallow_Copy_Deep_Copy.deepcopy;

public class Student implements Cloneable {
	
	
	private String studentName;
	
	private Address address;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student student = (Student) super.clone();
		student.setAddress((Address) address.clone()); 
		return student;
	}

}
