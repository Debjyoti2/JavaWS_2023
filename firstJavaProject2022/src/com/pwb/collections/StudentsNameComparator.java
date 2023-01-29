package com.pwb.collections;

import java.util.Comparator;

public class StudentsNameComparator implements Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

}
