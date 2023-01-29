package com.tcs.pwb.leetcodeproblems;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_Example {
	
	public static void main(String[] args) {
		
		Queue<String> myQueue = new PriorityQueue<String>();	
		myQueue.offer("A");
		myQueue.offer("B");
		myQueue.offer("C");
		
		myQueue.poll();
		myQueue.poll();
		
	}

}
