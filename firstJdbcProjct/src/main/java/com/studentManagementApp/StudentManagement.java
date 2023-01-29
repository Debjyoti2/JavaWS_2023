package com.studentManagementApp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;

public class StudentManagement {




	public static void manageStudents(Student obj,String operationType) {
		Connection con= ConnectionProvider.getConnection();
		String query="";
		PreparedStatement pst;
		int rowDone=0;

		try {

			//register a student
			if(operationType.equalsIgnoreCase(OperationType.ADD_STUDENT.getValue())) {
				query="insert into t_students(studentId,studentName,studentAge,rollNo,mobileNo,registration_date)values(?,?,?,?,?,?)";
				pst = con.prepareStatement(query);
				pst.setInt(1,obj.getStudentId());
				pst.setString(2,obj.getStudentName());
				pst.setInt(3,obj.getStudentAge());
				pst.setInt(4,obj.getRollNo());
				pst.setLong(5,obj.getMobileNo());
				pst.setString(6, LocalDate.now().toString());

				rowDone= pst.executeUpdate();
				if(rowDone>0) {
					System.out.println("Data inserted successfully");
				}
			}
			//update details of a student
			else if(operationType.equalsIgnoreCase(OperationType.UPDATE_STUDENT.getValue())) {
				query="update t_students set studentName=? , studentAge=?, mobileNo=? where studentId=?";
				pst=con.prepareStatement(query);
				pst.setString(1,obj.getStudentName());
				pst.setInt(2,obj.getStudentAge());
				pst.setLong(3, obj.getMobileNo());
				pst.setInt(4,obj.getStudentId());

				rowDone= pst.executeUpdate();
				if(rowDone>0) {
					System.out.println("Data updated successfully");
				}
			}
			
			//delete a student
			else if(operationType.equalsIgnoreCase(OperationType.DELETE_STUDENT.getValue())) {
				query ="delete from t_students st where st.studentId=?";
				pst=con.prepareStatement(query);
				pst.setInt(1,obj.getStudentId());
				rowDone= pst.executeUpdate();
				
				if(rowDone>0) {
					System.out.println("Data deleted  successfully");
				}

			}
			
			//fetch a student
			else if(operationType.equalsIgnoreCase(OperationType.FETCH_STUDENT.getValue())) {
				query="select * from t_students s where s.studentId=?";
				pst= con.prepareStatement(query);
				pst.setInt(1,obj.getStudentId());
				
				ResultSet rs =  pst.executeQuery();
				while (rs.next()) {
					Student stud = new Student();
					stud.setStudentId(rs.getInt("studentId"));
					stud.setStudentName(rs.getString("studentName"));
					stud.setStudentAge(rs.getInt("studentAge"));
					stud.setRollNo(rs.getInt("rollNo"));
					stud.setMobileNo(rs.getInt("mobileNo"));
					
					System.out.println("Student is :: " + stud);
				}
			}
			
			con.close();

		}
		catch(Exception e) {
			e.printStackTrace();
		}


	}

}
