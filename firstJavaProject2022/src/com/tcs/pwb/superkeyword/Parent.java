package com.tcs.pwb.superkeyword;

public class Parent {
	
	private String parentName;
	
	Parent(String pName){
		this.parentName=pName;
	}
	
	public void printParentName() {
		System.out.println("Parent name is ::  " + this.parentName);
	}

}
