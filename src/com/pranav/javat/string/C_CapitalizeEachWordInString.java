package com.pranav.javat.string;

public class C_CapitalizeEachWordInString {

	/*
	 * Steps To Remember
	 * 
	 * 1. Split the String with whitespace and get the word array 2. iterate
	 * through each word and get a substring of first string and remaining
	 * string 3. append to sb capitalizing first string to upper case and and
	 * remaining string to lower case.
	 */

	public static String capitalizeWord(String str) {

		
		if(str.length()==0) return "not a valid i/p";
		// split the string with whitespace
		String[] words = str.split("\\s");

		StringBuffer sb = new StringBuffer();

		for (String s : words) {

			sb.append(s.substring(0, 1).toUpperCase());
			sb.append(s.substring(1).toLowerCase());
			sb.append(" ");

		}

		return sb.toString();

	}

	public static void main(String[] args) {

		System.out.println(capitalizeWord("my name is pranav"));

	}

}
