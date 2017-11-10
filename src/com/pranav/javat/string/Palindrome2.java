package com.pranav.javat.string;

public class Palindrome2 {

	public static boolean checkForPelindrome(String str) {

		StringBuffer sb = new StringBuffer();
		// convert String to char array
		char[] ch = str.toCharArray();

		// Iterate in reverse end to beginning
		for (int i = ch.length - 1; i >= 0; i--) {

			// appending last character with each iteration.
			sb.append(ch[i]);

		}
		
		// sb is object so we have to convert it to String.
		
		//The toString() method returns the string representation of the object.
		if (str.equals(sb.toString())) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		// Input is case sensitive.
		System.out.println(checkForPelindrome("abA"));

	}

}
