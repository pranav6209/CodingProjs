package com.pranav.javat.string;

public class A_ReverseString {

	public static String reverseString(String str) {
		
		
		
/*		
 * Steps To Remember
 * 
 * 		1.  String to chatArray
		2.	 iterate in reverse  i= array.legnth-1 to >=0
		3. append to string buffer
*/
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
		return sb.toString();

	}

	public static void main(String[] args) {

		System.out.println(A_ReverseString.reverseString("my name is Pranav"));

	}

}
