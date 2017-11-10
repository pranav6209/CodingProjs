package com.pranav.javat.string;

public class ReverseEachWordInString4 {
	
	public static String reverseWord(String str) {

		StringBuffer sb = new StringBuffer();
		// split the string with whitespace
		String[] word = str.split("\\s");

		for (String w : word) {
			
		StringBuffer sb1 = new StringBuffer();
		// convert String to char array
			char[] ch = w.toCharArray();
			// Iterate in reverse end to beginning
			for (int i = ch.length - 1; i >= 0; i--) {
				
				// appending last character with each iteration.
				sb1.append(ch[i]);

			}

			sb.append(sb1.toString()).append(" ");

		}

		return sb.toString();

	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(reverseWord("my name is pranav"));
		
	}

}
