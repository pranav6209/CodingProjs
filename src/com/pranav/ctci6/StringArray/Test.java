package com.pranav.ctci6.StringArray;


public class Test {
	
	public static void main (String [] args){
		
		
		
		System.out.println(Test.oneEditAway("abc", "adc"));
	
		
	}
	
	private static boolean oneEditAway(String s1, String s2) {

		int length1 = s1.length();
		
		boolean differanceFound = false;

		if (length1 == length2) {

			for (int i = 0; i < length1; i++) {

				if (str1[i] != str2[i]) {

					differanceFound = true;

					if (differanceFound) {

						return false;
					}

				}
			}
		}
		return true;

	}
	
	
}
