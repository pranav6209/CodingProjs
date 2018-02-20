package com.pranav.extra.string;

/*
 * Question 
 
 input String with W words.If there are w words, words 1 is swapped with word w,

word 2 is swapped with with word w-1 and so on

example

i/p
"Hello World"
o/p
"World Hello"

*
*/

import java.util.Arrays;

public class SwapFirstLastWords {

	private static String[] swapWord(String str) {

		// split the string with spaces to get word
		String[] words = str.split("");

		System.out.println(words.length);

		// only iterate through half as swapping
		for (int i = 0; i <= (words.length / 2) - 1; i++) {
			
			String tmp = words[i];

			words[i] = words[words.length - 1 - i];

			words[words.length - 1 - i] = tmp;

		}

		return words;

	}

	public static void main(String[] args) {

		String s1 = "i am Pranav Patel Ashok";

		String[] words = SwapFirstLastWords.swapWord(s1);
		
		System.out.println(Arrays.toString(words));

		for (int i = 0; i < words.length; i++) {

			System.out.print(words[i] + " ");
		}

	}

}
