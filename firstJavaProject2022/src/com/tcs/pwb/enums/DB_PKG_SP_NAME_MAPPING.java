package com.tcs.pwb.enums;

public enum DB_PKG_SP_NAME_MAPPING {
	
	//to provide an extra abstraction
	
	PKG_UPP_SMART_PROJECT("pkg_upp_smart_project"),
	SP_GET_PROJECT_DETAILS("sp_get_project_details");
	
	private String value;
	
	private DB_PKG_SP_NAME_MAPPING(String value) {
		this.value =value;
	}

	public String getValue() {
		return value.toUpperCase();
	}
	
}
