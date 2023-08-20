package com.designpattern.singletone_DP;

public class TVSet {
	
	private static volatile TVSet tvset=null;
	
	
	private TVSet() {
		
	}
	
	
	public static TVSet getInstances() {
		if(tvset==null) {
			synchronized (tvset) { //T1, T2 come once T1 create a tvset, T2 try to create again but will get restricted by double lock chk
				if(tvset==null) { //double lock chking
					tvset =new TVSet();
				}
				
			}
		}
		return tvset;
	}

}
