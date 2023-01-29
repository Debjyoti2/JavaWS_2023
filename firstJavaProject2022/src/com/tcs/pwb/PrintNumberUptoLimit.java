package com.tcs.pwb;

public class PrintNumberUptoLimit {

	int limit;
	
	PrintNumberUptoLimit(int limit){
		this.limit=limit;
	}
	
	public void printSqrUptoLimitWithFor() {
		for(int i=1;i<=limit;i++) {
			System.out.println("Sqr are : " + i*i);
		}
	}
	
	public void printSqrUptoLimitWithWhile() {
		int j=1;
		while(j<=limit) {
			System.out.println("Sqr are : " + j*j);
			j++;
		}
	}

}
