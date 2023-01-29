package com.studentManagementApp;

public class Student {
	
	private int studentId;
	private String studentName;
	private int studentAge;
	private int rollNo;
	private long mobileNo;
	
	public Student() {
		
	}

	public Student(int studentId, String studentName, int studentAge, int rollNo, long mobileNo) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.rollNo = rollNo;
		this.mobileNo = mobileNo;
	}


	public int getStudentId() {
		return studentId;
	}
	
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", rollNo=" + rollNo + ", mobileNo=" + mobileNo + "]";
	}
	
	
	

}
