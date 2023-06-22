package com.WAP;

import java.util.Arrays;

public class Rev_String_without_moving_special_char {

	// Input: str = “a,b$c”
	// Output: str = “c,b$a”

	public static void main(String[] args) {

		String str = "a,b$c";
		char[] inarray = str.toCharArray();
		char[] outarray = new char[str.length()];
		for (int i = inarray.length - 1; i >= 0; i--) {
			if (Character.isAlphabetic(inarray[i])) {
				outarray[inarray.length - i - 1] = inarray[i];
			} else {
				outarray[i] = inarray[i];
			}
		}
		System.out.println(Arrays.toString(outarray));

	}

}
