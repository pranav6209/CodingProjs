package com.pranav.javat.string;

public class D_ReverseEachWordInString {
	
	/*		
	 * Steps To Remember
	 * 
	 * 		1.  Split the String with whitespace and get the word array
			2.	 Covert word to char array.
			3.  Reverse the word by iterating in reverse and append to sb1
			4.  Append to separate  sb2 with whitespace at the end.
	*/
	
	public static String reverseWord(String str) {

		StringBuffer sb = new StringBuffer();
		// split the string with whitespace
		String[] word = str.split("\\s");

		for (int i = 0; i <word.length; i++) {	
			
		StringBuffer sb1 = new StringBuffer();
		// convert String to char array
			char[] ch = word[i].toCharArray();
			// Iterate in reverse end to beginning
			for (int j = ch.length - 1; j >= 0; j--) {
				
				// appending last character with each iteration.
				sb1.append(ch[j]);

			}

			sb.append(sb1.toString()).append(" ");

		}

		return sb.toString();

	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(reverseWord("my name is pranav"));
		
	}

}
