package com.pwb.map;

public class Notes {
	
	
  //1. /* HashMap */
	
	//unsorted , unordered , not thread safe
	
	//for any multi-threaded application, its not recommended to use HashMap 
	//as its not synchronized , its better to use ConcurrentHashMap in java
	//multithreaded application where we need Map facility.
	
	//for multithread env Hashtable already present why to use ConcurrentHashMap??
	// >>> bcs HashTable lock whole hashtable during one thread execution
	//but ConcurrentHashMap only locks one particular segment where that node is present..
	//so its better to use ConcurrentHashMap  than HashTable in multithreaded env.
	
	
	
  //2 . /* HashTable */
	
	//unsorted , unordered
	// synchronized , thread safe
	//HashMap allows null value in key but only once , no duplicate. values can be null multiple times.
	//HashTable don't allow null key and value both.
	
	//why ???
	
	
	//	
	//	Hashtable and HashMap both uses the given key to compute the bucket index, index=hash(key);
	//if the given key is null how will the bucket index be calculated. 
	//Also, key can be object and equality of which is determined by calling hashcode and equals on that object, 
	//so if the key is null that contract is not fulfilled.
	//	So to summarize, Hashtable doesn't allow null key to compute the bucket index. 
	//	HashMap is newer where it has corrected the issues in Hashtable and allows one null key and value. 
	//	HashMap handles the null key as a special case and it has reserved the index "0" for the null key-value.
	
	
	
  //3. /* LinkedHashMap */
	//insertion order is maintained
	
	
	
  //4. /* TreeMap */
	
	//data always present in sorted order, here as per key values sorted ascending.
	//if  tree present in collection like below example,
	
	//  Set(TreeSet)
    //Set<String> set1 = new TreeSet<String>();
	
	//Map(TreeMap)
	//Map<Object,String> newMap = new TreeMap<Object,String>();

}
