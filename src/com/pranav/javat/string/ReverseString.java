package com.pranav.javat.string;

public class ReverseString {

	public static String reverseString(String str) {

		// Convert String to Char array
		char[] ch = str.toCharArray();

		String rev = "";
		// Iterate in reverse end to begining 
		for (int i = ch.length - 1; i >= 0; i--) {

			rev = rev + ch[i];

		}

		return rev;

	}

	public static void main(String[] args) {

		System.out.println(ReverseString.reverseString("my name is khan"));

	}

}
