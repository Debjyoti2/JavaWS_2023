package com.pwb.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class ArrayDequeue {

	
	public static void main(String[] args) {
		ArrayDeque<Integer> deq1 = new ArrayDeque<>();
		deq1.add(1);
		deq1.add(5);
		deq1.add(2);
		deq1.add(34);
		deq1.addFirst(21);
		System.out.println("deq1::" +deq1);
		deq1.addLast(22);
		
		deq1.poll();
	}
	//queue(PriorityQueue or Linklist queue) te element 1st e remove , last e add kora jay
	
	//arrayDeque te element last e add/delete  ba 1st e add/delete kora jay.
	
	
	//total 3 type of quque
	
	//1st - ArrayDeque
	ArrayDeque<Integer> adq = new ArrayDeque<Integer>();
	
	//2. LinklistQueue
	Queue<Integer> lnk = new LinkedList<Integer>();
	
	//3.PriorityQueue
	PriorityQueue<Integer> p = new PriorityQueue<Integer>();
}
