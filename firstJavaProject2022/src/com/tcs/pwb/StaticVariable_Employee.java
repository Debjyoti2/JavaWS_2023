package com.tcs.pwb;


//static keyword is used for memory management
//static variable we declare when we want a variable is directly bound with class and same for all object.

public class StaticVariable_Employee {
	
	private int EmpId;
	private String empName;
	static private String companyName="TCS";
	
	
	StaticVariable_Employee(int EmpId,String empName){
		this.EmpId=EmpId;
		this.empName=empName;
	}
	
	public int getEmpId(){
		return EmpId;
	}
	public String getEmpName() {
		return empName;
	}
	
	public void printDetails(StaticVariable_Employee ee){
		System.out.println(ee.getEmpId() + ee.getEmpName() + StaticVariable_Employee.companyName);
	}
	
	public static void main(String[] args) {
		StaticVariable_Employee e1 = new StaticVariable_Employee(101,"Amit");
		e1.printDetails(e1);
		StaticVariable_Employee e2 = new StaticVariable_Employee(102,"Kittu");
		e2.printDetails(e2);
		
	}
	

}
