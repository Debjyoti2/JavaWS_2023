package com.pwb.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DifferrentQueues {
	
	//1. priority queues te element gulo aoto sort hoye jay, insert je bhabe ei hok na kno..
	//tai .poll() function calll korle smallest element delete hoye jay.

	//2.LinkedListQueue te element gulo insertion order hisabe sort hoye thake... tai .poll() call korle
	//jeta 1st e add hoyechilo seta delete hoye jay.
	
	
	
	public static void main(String[] args) {
	
		System.out.println("Priority Queue example");
		Queue<Integer> q1 = new PriorityQueue<Integer>();
		q1.offer(1);
		q1.offer(50);
		q1.offer(6);
		q1.offer(2);
		System.out.println("q1 is :::" + q1);
		q1.poll();
		System.out.println("Now q1 is :" + q1);
		
		
		
		System.out.println("LinkListQueue  example");
		Queue<Integer> q2= new LinkedList<Integer>();
		q2.offer(1);
		q2.offer(50);
		q2.offer(6);
		q2.offer(2);
		System.out.println("q2 is :::" + q2);
		q2.poll();
		System.out.println("Now q2 is :" + q2);
		
	}
	
	
}
