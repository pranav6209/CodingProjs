package com.pranav.ctci6.StringArray;

public class A_IsUnique {
	/*
	Time Complexity is O(N) and as there is no additional space used Space Complexity is O(1)
	
	Logic
	
	1. ASCII Value logic
	2. if the String is longer than 128 char are repeating 
	3. if not create a boolean array (all has false initially)
	4. get the ASCII value by charAt(i) method, for that ASCII value store true in array.
	5. check true and false flag, if  flag is already true at particular position in array, char is repeating.

*/	
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
				char_set[val] = true; // make array value true for char in  string
			}
		}
		// if iteration is finished without returning false from for loop means String is unique and we have to return true
		return true;
	}

	public static void main(String[] args) {

		System.out.println(isUniqueChars("my name"));

	}

}
