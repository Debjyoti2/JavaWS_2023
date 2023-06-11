package com.pwb.collections;

public class Teacher implements Comparable<Teacher>{
	
	private int teacherId;
	private String teacherName;
	
	public Teacher(int teacherId, String teacherName) {
		this.teacherId =teacherId;
		this.teacherName = teacherName;
	}
	
	@Override
	public int compareTo(Teacher that) {
		return Integer.compare(this.teacherId, that.teacherId);
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + "]";
	}

	
	

}
