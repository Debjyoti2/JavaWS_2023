package com.pwb.collections;

import java.util.Comparator;

public class StudentsIdComparator implements Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
		return Integer.compare(o2.getId(),o1.getId());
	}
	
	

}
