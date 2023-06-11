package com.internal.working;

public class Collision_in_HashMap {
	
	/*
	
	Collisions may occur due to a bad hash code algorithm and often slow down the performance of the Map.

	Prior to Java 8, HashMap in Java handles collision by using LinkedList to store map entries. 
	If a key ends up in the same bucket where another entry already exists, 
	it's added at the head of the LinkedList. In the worst case, this will increase complexity to O(n).


	To avoid this issue, Java 8 and later versions use a balanced tree (also called a red-black tree) 
	instead of a LinkedList to store collided entries. This improves the worst-case performance 
	of HashMap from O(n) to O(log n).

	HashMap initially uses the LinkedList. Then when the number of entries crosses a certain threshold,
	it will replace a LinkedList with a balanced binary tree. The TREEIFY_THRESHOLD constant decides
	this threshold value. Currently, this value is 8, which means if there are more than 8 elements
	in the same bucket, Map will use a tree to hold them.


    */
}
