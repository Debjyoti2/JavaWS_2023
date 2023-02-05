package com.singleton_class;

public class Employee_Singleton {
	
	private String companyName="TCS";
	private String deptName="ITIS";
	
	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	private Employee_Singleton() {
		
	};
	
	
	private static Employee_Singleton Employee_SingletonObj;
	
	public static Employee_Singleton getInstance() {
		if(Employee_SingletonObj==null) {
			Employee_SingletonObj = new Employee_Singleton();
		}
		return Employee_SingletonObj;
	}
	

}
