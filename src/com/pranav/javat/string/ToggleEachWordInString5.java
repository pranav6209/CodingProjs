package com.pranav.javat.string;

/*
 * My name is Pranav
 * mY nAME iS pRANAV 
 * 
 */

public class ToggleEachWordInString5 {

	public static String toggleWord(String str) {

		StringBuffer sb = new StringBuffer();

		// split the string with white space
		String[] words = str.split("\\s");

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
