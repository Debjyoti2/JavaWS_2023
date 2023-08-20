package com.pwb.shallow_Copy_Deep_Copy.shallowcopy;

public class Student implements Cloneable {
	
	//normal primitive data type thkle shallow copy kaj kore jbe
	// but class r vitore onno object e reference thkle jhar khabe
	// tokhn deep copy use korte hbe
	
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
		return super.clone();
	}

}
