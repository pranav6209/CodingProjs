package com.pranav.javat.string;

import java.util.Arrays;

public class AnagramString7 {

	/*
	 * Two strings are called anagrams if they contain same set of characters
	 * but in different order. "keep ? peek", "Mother In Law - Hitler Woman".
	 * 
	 * Assuming that comparison is not case sensitive and white space is not significant.
	 * 
	 *  Converting to lower case and removing white spaces.
	 */

	private static void checkAnagram(String s1, String s2) {

		// replace all the white spaces

		String str1 = s1.replaceAll("\\s", "");
		String str2 = s2.replaceAll("\\s", "");

		// if length is not same
		if (str1.length() != str2.length()) {

			System.out.println("Legnth Not Same.Entered Strings Are Not Anagram");

		}

		else {

			// convert string to lover case and store it to character array
			char[] array1 = str1.toLowerCase().toCharArray();
			char[] array2 = str2.toLowerCase().toCharArray();

			// sort the array

			Arrays.sort(array1);

			Arrays.sort(array2);

			// compare array

			if ((Arrays.equals(array1, array2))) {

				System.out.println("Entered Strings Are Anagram");

			}

			else {

				System.out.println("Entered Strings Are Not Anagram");
			}
		}

	}

	public static void main(String[] args) {

		checkAnagram("Keep", "peek");
		checkAnagram("Keep", "peeks");
		checkAnagram("Mother In Law", "Hitler Woman");

	}

}
