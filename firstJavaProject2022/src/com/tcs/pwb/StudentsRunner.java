package com.tcs.pwb;

public class StudentsRunner {

	public static void main(String[] args) {

		Students st = new Students();
		
		Students newObj = new Students();
		newObj.setStudentName("Debjyoti");
		newObj.setStudentMarks(90);
		st.addStudents(newObj);
		
		Students newObj2 = new Students();
		newObj2.setStudentName("Sourav");
		newObj2.setStudentMarks(80);
		st.addStudents(newObj2);
		
		st.iterateStudentsList();
		
		
		st.removeStudentsByName("Sourav");
		
		st.iterateStudentsList();
		
	}

}
