package com.pranav.ctci6.StringArray;

public class StringCompression6 {

	/* 
	 * aabcccccaaa--->a2b1c5a3 
	 */

	private static String compress(String str) {

		StringBuilder compressed = new StringBuilder();

		int countConsecutive = 0;

		for (int i = 0; i < str.length(); i++) {

			// as soon as we enter for loop we increment counter by 1
			countConsecutive++;

			if (i + 1 == str.length() || str.charAt(i) != str.charAt(i + 1)) { // i=0

				compressed.append(str.charAt(i)); // a
				compressed.append(countConsecutive);
				countConsecutive = 0;

			}

		}

		if (compressed.length() < str.length()) {

			return compressed.toString();
		}

		else {

			return str;
		}

	}

	public static void main(String[] args) {
		System.out.println(compress("aabcccccaaa"));
	}
}
