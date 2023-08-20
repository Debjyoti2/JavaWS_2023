package com.pwb.map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapClass {
	
	// TreeMap  implements NavigableMap
	// NavigableMap extends SortedMap
	
	// NavigableMap provide functionality of submap
	// map.submap(key1,frominclusicve, key2, toinclusive);
	
	// sortedMap provide sorting functionality
	
	public static void main(String[] args) {
		
		Map<String,String> treemap = new TreeMap<>();
		treemap.put("D", "C");
		treemap.put("A", "Q");
		
		System.out.println(treemap);
		
		NavigableMap<String,String> navmap = new TreeMap<>();
		navmap.subMap("A", true, "D", false);
		
		
		
	}

}
