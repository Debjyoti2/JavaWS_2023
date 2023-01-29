package com.tcs.pwb.leetcodeproblems;

import java.util.ArrayList;
import java.util.Iterator;

class Solution {
	public boolean canConstruct(String ransomNote, String magazine) {
		ArrayList<String> ransomNoteList = new ArrayList<String>();
		ArrayList<String> magazineList = new ArrayList<String>();

		String[] ransomNoteArray = ransomNote.split("");
		String[] magazineArray=magazine.split("");

		for(String r : ransomNoteArray){
			ransomNoteList.add(r); 
		}
		for(String m:magazineArray){
			magazineList.add(m);
		}

		int presentCount=0;
		for(String i: ransomNoteList){
			for(Iterator<String> itr = magazineList.iterator();itr.hasNext();) {
				if(i.toString().equalsIgnoreCase(itr.next().toString())) {
					itr.remove();
					presentCount++;
				}
			}
		}

		if(presentCount==ransomNote.length()){
			return true;
		}

		return false;

	}

	public static void main(String[] args) {
		Solution s = new Solution();
		boolean ss = s.canConstruct("aa", "aab");
		System.out.println("Result is : " + ss);
	}
}