package com.tcs.pwb.leetcodeproblems;

import java.math.BigDecimal;

public class Reverse_a_String {

	public String reverseString(String inputStr) {
		BigDecimal s = new BigDecimal(0);

		String [] reverseStrArray = new String[inputStr.length()];
		StringBuilder sb = new StringBuilder();

		for(int i=0;i<inputStr.length();i++) {
			String eachChar = String.valueOf(inputStr.charAt(i));
			reverseStrArray[inputStr.length()-i-1]=eachChar;
		}
		for(String j : reverseStrArray) {
			sb.append(j);
		}
		String reverseString =sb.toString();
		return reverseString;

	}

	public static void main(String[] args) {
		Reverse_a_String Obj = new Reverse_a_String();
//		String returnStr = Obj.reverseString("DealAndDrive");
//		System.out.println("Reversed String Get ::: " + returnStr);
//
//		int[] passArray = new int[5];
//		passArray[0]=1;
//		passArray[1]=2;
//		passArray[2]=3;
//		passArray[3]=4;
//		passArray[4]=5;
//
//
//		String returnStr2 = Obj.average(passArray,5);
//		System.out.println("Avg Get ::: " + returnStr2);
		
		int[] passArray2 = new int[5];
		passArray2[0]=1;
		passArray2[1]=5;
		passArray2[2]=3;
		passArray2[3]=5;
		passArray2[4]=7;
		int fetchCount = Obj.totalPairs(passArray2, 2);
		System.out.println("fetchCount is :: " +fetchCount);

	}

	public String average(int A[], int N)
	{
		BigDecimal sum= new BigDecimal(0);

		for(int i=0;i<N;i++){
			sum=sum.add(new BigDecimal(A[i]));
		}
		BigDecimal avg =sum.divide(new BigDecimal(N));
		return avg.toString();
	}

	public int totalPairs(int[] nums, int k){
		int subsetCount =0 ;
		String resultSetArray="";
		
		for(int i=0;i<nums.length;i++) {
			int[] subset = new int[nums.length-1];
			int kk=0;
			for(int j=0;j<nums.length;j++) {
				if(j!=i) {
					subset[kk]=nums[j];
					kk++;
				}
			}
			for(int p=0;p<subset.length;p++) {
				int diff = nums[i]-subset[p];
				if(diff==k && (nums[i]>subset[p]) ) {
					subsetCount++;
					resultSetArray = resultSetArray + " ( " + nums[i] + "," + subset[p] + " ) ";
				}
			}


		}
     
		System.out.println("resultSetArray is :: " + resultSetArray);
		return subsetCount;

	}

}
