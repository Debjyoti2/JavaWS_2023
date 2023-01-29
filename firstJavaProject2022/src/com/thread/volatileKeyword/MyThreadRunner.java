package com.thread.volatileKeyword;

import java.util.Scanner;

public class MyThreadRunner {
	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
		mt.start();
		
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		mt.stopCounting();
		
		
	}
	
}
