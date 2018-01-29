package com.pranav.javat.string;

/*
 * My name is Pranav
 * mY nAME iS pRANAV 
 * 
 *Steps To Remember
 *
 *		1. Reverse a String 
 *		2. Toggle a String..
 * 
 */

public class F_ReverseToggleEachWordInString {
	
	// Reverse the word in the String..
	public static String reverseWord(String str) {

		StringBuffer sb = new StringBuffer();
		// split the string with whitespace
		String[] words = str.split("\\s");

		for (int i = 0; i < words.length; i++) {	
			
		StringBuffer sb1 = new StringBuffer();
			
			char[] ch = words[i].toCharArray();
			// reverse iteration
			for (int j = ch.length - 1; j >= 0; j--) {
				// Append last char 
				sb1.append(ch[j]);

			}

			sb.append(sb1.toString()).append(" ");

		}
		// reversed String
		return sb.toString();

	}

	// Input Reverse word String and Toggle it.
	public static String toggleWord(String str) {

		StringBuffer sb = new StringBuffer();
		// get the words from the reversed String
		String[] words = reverseWord(str).split("\\s");

		for (int i = 0; i <words.length; i++) {	
			// get the first char
			String first = words[i].substring(0, 1);
			// get rest of the str
			String afterFirst = words[i].substring(1);
			// convert first char to lower case and rest of the str to upper case
			sb.append(first.toLowerCase()).append(afterFirst.toString().toUpperCase()).append(" ");

		}

		return sb.toString();
	}

	public static void main(String[] args) {

		System.out.println(toggleWord("My name is Pranav"));

	}

}
