package com.pranav.javat.string;

public class ReverseString {

	public static String reverseString(String str) {

		StringBuffer sb = new StringBuffer();

		char[] ch = str.toCharArray();

		// Iterate in reverse end to beginning
		for (int i = ch.length - 1; i >= 0; i--) {

			// appending last character with each iteration.
			sb.append(ch[i]);
		}

		
		// sb is object so we have to convert it to String.
		
		//The toString() method returns the string representation of the object.
		return sb.toString();

	}

	public static void main(String[] args) {

		System.out.println(ReverseString.reverseString("my name is khan"));

	}

}