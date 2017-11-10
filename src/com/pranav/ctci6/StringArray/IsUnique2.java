package com.pranav.ctci6.StringArray;

import java.util.Arrays;

public class IsUnique2 {
	
	private static boolean isUniqueChars(String str) {

		char[] char_set = str.toCharArray();

		for (int i = 0; i < str.length(); i++) { // iterate through String
			
			System.out.println(str.length());
			char ch = str.charAt(i);

			if (Arrays.asList(char_set).contains(ch)) {

				return false;

			}

			else; {

				return true;

			}

		}

		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println(isUniqueChars("My Namem"));
		
	}

}
