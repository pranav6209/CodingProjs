package com.pranav.ctci6.StringArray;

public class A_IsUnique {

	private static boolean isUniqueChars(String str) {

		/*
		 * 
		 * https://stackoverflow.com/questions/19212306/whats-the-difference-
		 * between-ascii-and-unicode 
		 * 
		 * If length is greater than 128, some
		 * characters must have been repeated. because ASCII is max 128(2^7) if
		 * it is extended ASCII 256 2^8. Clarify with interviewer
		 *
		 */

		if (str.length() > 128) {

			return false;
		}

		boolean[] char_set = new boolean[128]; //  generates array with initial value false.

		for (int i = 0; i < str.length(); i++) { // iterate through String

			// char ch= str.charAt(i); // returns char at specific index

			int val = str.charAt(i); // returns ASCII value.

			/*
			 * If the value is already true, string has duplicate characters,
			 * return false
			 */
			if (char_set[val]) {

				return false;

			}

			else {
				char_set[val] = true; // make array value true for char in
										// string
			}
		}

		return true;
	}

	public static void main(String[] args) {

		System.out.println(isUniqueChars("My name"));

	}

}
