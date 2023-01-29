package com.tcs.pwb;

public class SwitchCaseStatement {

	
	public static boolean isWeekDay(int noFromStartDay) {
		boolean result;
		
		switch(noFromStartDay) {
		
		case 0 : result=true; break;
		case 1: result=false; break;
		case 2: result=false; break;
		case 3: result=false; break;
		case 4: result=false; break;
		case 5: result=false; break;
		case 6: result=true; break;
		default : result=false; break;
		}
		return result;
	}
	
	public static String nameOftheMonth(int monthNumber) {
		String monthName;

		switch(monthNumber) {
		case 1 : 
			monthName="Jan";
			break;
		case 2 :
			monthName="Feb";
			break;
		case 3 : 
			monthName="Mar";
			break;
		default : 
			monthName="NULL";
			break;

		}
		return monthName;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Result Is : " + isWeekDay(4));
		System.out.println("Result Is : " + nameOftheMonth(2));
		
		//ternary operator
		int x = 0,y = 0,c;
		c=x>y?1:10;

		int k=10;
		boolean iseven;
		iseven =k%2==0?true:false;
		System.out.println("Result Is : " +iseven);
		

	}
	
	
}
