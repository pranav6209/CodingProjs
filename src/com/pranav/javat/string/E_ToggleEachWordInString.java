package com.pranav.javat.string;

/*
 * first char in String is lower and rest uppercase....
 * 
 * My name is Pranav
 * mY nAME iS pRANAV 
 * 
 * 
 * 	/*		
	 * Steps To Remember
	 * 
	 * 		1.  Split the String with whitespace and get the word array
			2.	 iterate through each word and get a substring of first string and remaining string 
			3. append to sb lowering first string to upper case and and remaining string to upper case.
	*/


public class E_ToggleEachWordInString {

	public static String toggleWord(String str) {

		StringBuffer sb = new StringBuffer();

		// split the string with white space
		String[] words = str.split("\\s");

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
