package com.pwb.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teacher_Comparable_Runner {
	
	public static void main(String[] args) {
		
		Teacher t1 = new Teacher(5,"Anil");
		Teacher t2 = new Teacher(3,"Bittu");
		Teacher t3 = new Teacher(1,"Kapil");
		
		List<Teacher> teachers = new ArrayList<>();
		teachers.add(t1);
		teachers.add(t2);
		teachers.add(t3);
		
		Collections.sort(teachers);
        System.out.println(teachers);		
		
		
	}

}
