package com.pwb.collectionscom.pwb.set;

import java.util.HashSet;
import java.util.Set;

public class Set_on_user_defined_class {
	
	public static void main(String[] args) {
		
		Set<EmployeePojoForSet> empSet = new HashSet<EmployeePojoForSet>();
		empSet.add(new EmployeePojoForSet(1,"Kiran1"));
		empSet.add(new EmployeePojoForSet(2,"Kiran2"));
		empSet.add(new EmployeePojoForSet(4,"Kiran3"));
		empSet.add(new EmployeePojoForSet(4,"Kiran4"));
		
		System.out.println(empSet);
		
		
	}

}
