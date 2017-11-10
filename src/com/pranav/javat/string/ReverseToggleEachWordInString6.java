package com.pranav.javat.string;

/*
 * My name is Pranav
 * mY nAME iS pRANAV 
 * 
 */

public class ReverseToggleEachWordInString6 {
	
	// Reverse the word in the String..
	public static String reverseWord(String str) {

		StringBuffer sb = new StringBuffer();
		// split the string with whitespace
		String[] word = str.split("\\s");

		for (String w : word) {
			
		StringBuffer sb1 = new StringBuffer();
			
			char[] ch = w.toCharArray();
			// reverse iteration
			for (int i = ch.length - 1; i >= 0; i--) {
				// Append last char 
				sb1.append(ch[i]);

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

		for (String w : words) {
			// get the first char
			String first = w.substring(0, 1);
			// get rest of the str
			String afterFirst = w.substring(1);
			// convert first char to lower case and rest of the str to upper case
			sb.append(first.toLowerCase()).append(afterFirst.toString().toUpperCase()).append(" ");

		}

		return sb.toString();
	}

	public static void main(String[] args) {

		System.out.println(toggleWord("My name is Pranav"));

	}

}
