package com.pwb.map;

public class WeakHashMap {
	
	/*
	In order to understand the data structure, we'll use it here to roll out a simple cache implementation.
	However, keep in mind that this is meant to understand how the map works, and creating your own cache
	implementation is almost always a bad idea.

	Simply put, the WeakHashMap is a hashtable-based implementation of the Map interface, 
	with keys that are of a WeakReference type.

	An entry in a WeakHashMap will automatically be removed when its key is no longer in ordinary use, 
	meaning that there is no single Reference that point to that key. When the garbage collection (GC) 
	process discards a key, its entry is effectively removed from the map, so this class behaves somewhat 
	differently from other Map implementations.
	
	
	Let's say that we want to build a cache that keeps big image objects as values, 
	and image names as keys. We want to pick a proper map implementation for solving that problem.

	Using a simple HashMap will not be a good choice because the value objects may 
	occupy a lot of memory. What's more, they'll never be reclaimed from the cache by a GC process, even when they are not in use in our application anymore.

	Ideally, we want a Map implementation that allows GC to automatically delete 
	unused objects. When a key of a big image object is not in use in our application in any place,
	that entry will be deleted from memory.

	Fortunately, the WeakHashMap has exactly these characteristics. 
	Let's test our WeakHashMap and see how it behaves:

	WeakHashMap<UniqueImageName, BigImage> map = new WeakHashMap<>();
	BigImage bigImage = new BigImage("image_id");
	UniqueImageName imageName = new UniqueImageName("name_of_big_image");

	map.put(imageName, bigImage);
	
	*/

}
