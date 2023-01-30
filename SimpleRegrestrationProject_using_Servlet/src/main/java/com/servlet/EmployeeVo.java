package com.servlet;

public class EmployeeVo {
	
	
	
	private Integer employeeId;
	private String employeeName;
	private String employeeEmail;
	private Integer employeeAge;
	private Long employeeMobile;
	private String employeeDept;
	
	
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public Integer getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(Integer employeeAge) {
		this.employeeAge = employeeAge;
	}
	public Long getEmployeeMobile() {
		return employeeMobile;
	}
	public void setEmployeeMobile(Long employeeMobile) {
		this.employeeMobile = employeeMobile;
	}
	public String getEmployeeDept() {
		return employeeDept;
	}
	public void setEmployeeDept(String employeeDept) {
		this.employeeDept = employeeDept;
	}
	
	@Override
	public String toString() {
		return "EmployeeVo [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeEmail="
				+ employeeEmail + ", employeeAge=" + employeeAge + ", employeeMobile=" + employeeMobile
				+ ", employeeDept=" + employeeDept + "]";
	}

}
