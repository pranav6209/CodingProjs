package com.pranav.javat.string;

public class B_Palindrome {
	/*
	 * Steps To Remember
	 * 
	 * 1. String to chatArray 2. iterate in reverse i= array.legnth-1 to >=0 3.
	 * append to string buffer 4. compare the reverse String with original
	 * string using compareTo()...
	 */
	public static boolean checkForPelindrome(String str) {

		
		StringBuffer sb = new StringBuffer();
		char[] ch = str.toCharArray();

		if (str.length() == 0)
			return false;
		// it is palindrome always
		else if (str.length() == 1)
			return true;
		else {

			for (int i = ch.length - 1; i >= 0; i--) {

				sb.append(ch[i]);

			}
			return str.equals(sb.toString());
		}
	}

	public static void main(String[] args) {

		// Input is case sensitive.
		System.out.println(checkForPelindrome("aba"));

	}

}
