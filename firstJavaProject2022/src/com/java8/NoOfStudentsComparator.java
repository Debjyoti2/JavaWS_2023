package com.java8;

import java.util.Comparator;

public class NoOfStudentsComparator implements Comparator<Course>{

	@Override
	public int compare(Course o1, Course o2) {
		return Integer.compare(o2.getNoOfStudents(),o1.getNoOfStudents());
	}

}
