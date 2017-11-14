package com.pranav.ctci6.StringArray;

public class Urlify3 {
	
	private static char[] replaceSpaceInString(char[] str, int length) {
		int spaceCounter = 0;

		// First lets calculate number of spaces

		// Here we iterate till true length of the string so if there is an
		// extra space at the end we can ignore that space in the space count.
		for (int i = 0; i < length; i++) {
			if (str[i] == ' ')
				spaceCounter++;
		}

		// calculate new size

		// True Length + space Count*2(because each space is replace by 3 char.
		// Space calculated in true length so we need addition 2 char per space)
		int newLength = length + 2 * spaceCounter;

		char[] newArray = new char[newLength];

		// newArray[newLength] = '\0';

		int newArrayPosition = 0;

		// iterating from beginning to end and replace space with %20
		for (int i = 0; i < length; i++) {

			if (str[i] == ' ') {

				newArray[newArrayPosition] = '%';
				newArray[newArrayPosition + 1] = '2';
				newArray[newArrayPosition + 2] = '0';
				newArrayPosition = newArrayPosition + 3;
			} else {
				newArray[newArrayPosition] = str[i];
				newArrayPosition++;
			}
		}
		return newArray;
	}

	public static void main(String[] args) {
		String str = "My Name Is Pranav   ";

		char[] array = str.toCharArray();
		// only passing true legnt and not counting last spaces
		System.out.println(replaceSpaceInString(array, 17));
	}
}
