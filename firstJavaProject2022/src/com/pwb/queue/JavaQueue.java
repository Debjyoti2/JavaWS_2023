package com.pwb.queue;

import java.util.PriorityQueue;

public class JavaQueue {
	
	
	public static void main(String[] args) {
		

		PriorityQueue<String> pQueue = new PriorityQueue<String>(new PQueueComparator());
		pQueue.offer("1");
		pQueue.offer("12");
		pQueue.offer("123");
		pQueue.offer("1234");
		for(String s : pQueue) {
			System.out.println("elements : " + s);
		}
		
		pQueue.poll();//process each elements
		pQueue.poll();//process each elements
		
		for(String s : pQueue) {
			System.out.println("elements : " + s);
		}
		
	}

}
