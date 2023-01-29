package com.pwb.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapRunner {

	public static void main(String[] args) {

		StudentVO st1 = new StudentVO(1, "A", 10);
		StudentVO st2 = new StudentVO(1, "B", 20);
		StudentVO st3 = new StudentVO(1, "C", 30);
		StudentVO st4 = new StudentVO(1, "D", 40);
		StudentVO st5 = new StudentVO(1, "E", 50);
		StudentVO st6 = new StudentVO(1, "F", 60);
		ArrayList<StudentVO> _list = new ArrayList<StudentVO>();
		_list.add(st1);
		_list.add(st2);
		_list.add(st3);
		_list.add(st4);
		_list.add(st5);
		_list.add(st6);
		
		ArrayList<StudentVO> _list1 = new ArrayList<StudentVO>();
		ArrayList<StudentVO> _list2 = new ArrayList<StudentVO>();
		
		for(StudentVO st : _list ) {
			if(st.getAge()>30) {
				_list2.add(st);
			}
			else {
				_list1.add(st);
			}
		}
		
		Map<String,ArrayList<StudentVO>> myMap_ageupto30 = new HashMap<String,ArrayList<StudentVO>>();
		Map<String,ArrayList<StudentVO>> myMap_agegreaterthan30 = new HashMap<String,ArrayList<StudentVO>>();
		
		
		myMap_ageupto30.put("AGE_UPTO_30", _list1);
		myMap_agegreaterthan30.put("AGE_MORE_THAN_30", _list2);
		System.out.println(myMap_agegreaterthan30);
		System.out.println(myMap_ageupto30);
		
		ArrayList<StudentVO> _getfromMapList = new ArrayList<StudentVO>();
		_getfromMapList=myMap_ageupto30.get("AGE_UPTO_30");
		
		boolean containsKey = myMap_ageupto30.containsKey("AGE_UPTO_30");
		System.out.println("containsKey ::" + containsKey);
		
		//boolean containValue = myMap_ageupto30.containsValue(_list2);
		
		Set<String> mapKetList = myMap_ageupto30.keySet(); //give whole keyset
		
		ArrayList<ArrayList<StudentVO>> returnMapValueList =  new ArrayList<ArrayList<StudentVO>>();
		returnMapValueList = (ArrayList<ArrayList<StudentVO>>) myMap_ageupto30.values(); //give whole keyset
		

	}

}
