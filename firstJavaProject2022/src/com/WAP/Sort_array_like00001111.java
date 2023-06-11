package com.WAP;

import java.util.ArrayList;
import java.util.List;

public class Sort_array_like00001111 {

	public static void main(String[] args) {
		
		List<Integer> mylist= List.of(1,1,0,1,0,0,1,0);
		List<Integer> myfinallist = new ArrayList<>();
		int zerocount=0;
		for(int i=0;i<mylist.size();i++) {
			if(mylist.get(i)==0) {
				zerocount++;
			}
		}
		for(int i=0;i<zerocount;i++) {
			myfinallist.add(0);
		}
		for(int i=0;i<mylist.size()-zerocount;i++) {
			myfinallist.add(1);
		}
		System.out.println(myfinallist);

	}

}
