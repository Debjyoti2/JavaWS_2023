package com.tcs.pwb.superkeyword;

public class Child extends Parent{

 private String childName;
 
 Child(){
	 super("Madhurima"); //calling parent class constructor
 }
 
 public void printParent_Child_Name() {
	 super.printParentName();//calling parent class method
	 System.out.println("Child Name is :: Julu");
 }

	
 public static void main(String[] args) {
	Child c = new Child();
	c.printParent_Child_Name();
}
	
}
