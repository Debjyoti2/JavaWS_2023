package com.studentManagementApp;

public enum OperationType {
	
	ADD_STUDENT("ADD_STUDENT"),
	UPDATE_STUDENT("UPDATE_STUDENT"),
	DELETE_STUDENT("DELETE_STUDENT"),
	FETCH_STUDENT("FETCH_STUDENT");
	
	private String value;
	
	OperationType(String value){
		this.value=value;
	}
	
	public String getValue() {
		return value.toUpperCase();
	}

}
