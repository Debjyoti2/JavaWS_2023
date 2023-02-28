package com.utility;

public class ValidationUtility {

	public static boolean isNotNull(String value) {
		if(value==null || "".equalsIgnoreCase(value)) {
			return false;
		}
		return true;
	}
	
}
