package com.preparedstatement;

public class ProjectVO {

	private int projectid;
	private String projectName;
	
	
	public ProjectVO(int projectid, String projectName) {
		super();
		this.projectid = projectid;
		this.projectName = projectName;
	}
	
	public int getProjectid() {
		return projectid;
	}
	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	
	
}
