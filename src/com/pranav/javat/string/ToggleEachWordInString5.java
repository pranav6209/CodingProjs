package com.pranav.javat.string;

/*
 * My name is Pranav
 * mY nAME iS pRANAV 
 * 
 */

public class ToggleEachWordInString5 {
	
	
	public static String reverseWord(String str) {

		StringBuffer sb = new StringBuffer();
		
		String[] word = str.split("\\s");

		for (String w : word) {
			
		StringBuffer sb1 = new StringBuffer();
			
			char[] ch = w.toCharArray();

			for (int i = ch.length - 1; i >= 0; i--) {
				
				sb1.append(ch[i]);

			}

			sb.append(sb1.toString()).append(" ");

		}

		return sb.toString();

	}

	public static String toggleWord(String str) {

		StringBuffer sb = new StringBuffer();

		String[] words = str.split("\\s");

		for (String w : words) {

			String first = w.substring(0, 1);

			String afterFirst = w.substring(1);

			sb.append(first.toLowerCase()).append(afterFirst.toString().toUpperCase()).append(" ");

		}

		return sb.toString();
	}

	public static void main(String[] args) {

		System.out.println(toggleWord("My name is Pranav"));

	}

}
