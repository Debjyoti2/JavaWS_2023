package com.pwb.collectionscom.pwb.set;

import java.util.HashSet;

//hashset e duplicate entry store hoy na
//null value store hoy
//kono order wise store hoy na

public class Java_HashSet {
	
	public static void main(String[] args) {
		
		HashSet<String> newHashSet = new HashSet<String>();
		newHashSet.add("A");
		newHashSet.add("A");
		newHashSet.add("A");
		newHashSet.add("B");
		
		for(String s : newHashSet) {
			System.out.println("Elements : " + s);
		}
		
		HashSet<EmployeePojoForSet> hassetemp = new HashSet<EmployeePojoForSet>();
		EmployeePojoForSet e1 =new EmployeePojoForSet(101,"Kittu1");
		EmployeePojoForSet e2 =new EmployeePojoForSet(102,"Kittu1");
		EmployeePojoForSet e3 =new EmployeePojoForSet(103,"Kittu3");
		hassetemp.add(e1);
		hassetemp.add(e2);
		hassetemp.add(e3);
		for(EmployeePojoForSet s : hassetemp) {
			System.out.println("Elements : " + s.getId() + s.getName());
		}
		
		
	}
	

}
