/**
 * 
 */
package com.pranav.javat.string;

/**
 * @author pranavpatel
 * 
 * Java program to find the percentage of uppercase, lowercase, digits and special characters in a string
 *
 */
public class PercentageOfUpperCaseLowerCase8 {

	private static void checkPercentage(String str) {

		int upperCase = 0;
		int lowercase = 0;
		int digits = 0;
		int other = 0;
		int strLegnth;
		
		// convert string to character array
		char[] ch = str.toCharArray();

		strLegnth = str.length();

		System.out.println(strLegnth);

		// Iterate through an array and check for uppercase, lowercase, digits and special characters
		for (int i = 0; i < ch.length; i++) {

			// use Character class to use boolean methods
			if (Character.isUpperCase(ch[i])) {

				// increase the count
				upperCase++;

			}

			else if (Character.isLowerCase(ch[i])) {

				lowercase++;

			}

			else if (Character.isDigit(ch[i])) {

				digits++;

			}

			else {

				other++;

			}

		}

		//convert to percentage.Make sure to parse it (double) else it will keep printing int as both variable are int.
		
		// use double. it is always better choice than float.
		System.out.println("Percentage of Uppercase:-" + (double) (upperCase * 100) / strLegnth+"%");

		System.out.println("Percentage of LowerCase:-" + (double) (lowercase * 100) / strLegnth+"%");

		System.out.println("Percentage of Digits:-" + (double) (digits * 100) / strLegnth+"%");

		System.out.println("Percentage of Othe:-" + (double) (other * 100) / strLegnth+"%");

	}

	public static void main(String[] args) {

		checkPercentage("India is my country 100%");

	}

}
