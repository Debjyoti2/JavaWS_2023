package com.tcs.pwb;

public class StaticMethod_Employee_Runner {
	
	public static void main(String[] args) {
		StaticMethod_Employee ee = new StaticMethod_Employee("Soumendra");
		
		ee.showEmpName();//normal method calling by object name
		
		StaticMethod_Employee.printHi();
		//static method call korte gele class r object create korte hoy na, classname diye direct call kora jay
		//jehetu object create korte hoy na tai,, memory kom allocate hoy.... memory management hoye jay
		//so static keyword is basically used for memory management.
		
	}

}
