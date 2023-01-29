package com.pwb.thread;

public class Problem1_Runner {

	public static void main(String[] args) {

		Thread th = new Thread(new Problem1());
		th.start();
	}

}
