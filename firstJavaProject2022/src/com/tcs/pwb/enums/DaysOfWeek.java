package com.tcs.pwb.enums;

public enum DaysOfWeek {
	
	SUNDAY(0), //enum er sobkota element ei sei enum class er object hoy. tai SUNDAY ei element ta holo 
	//DaysOfWeek class er object  are tai object ta declare hote gele constructor call korte hbe () e value pass korte hbe.
	
	MONDAY(1),
	TUESDAY(2),
	WEDNESDAY(3);
	
	int daysValue;
	private DaysOfWeek(int daysValue) {
		this.daysValue = daysValue;
	}
	
	public int getDaysValue() {
		return daysValue;
	}
	
	
	//ENUM USED TO STORE ANY CONSTANT VALUE
	

}
