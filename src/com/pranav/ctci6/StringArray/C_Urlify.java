package com.pranav.ctci6.StringArray;

/*Logic.
1. Calculate the no of spaces in the string
2. new length of the string will be current length + 2*spaces
3. Create a new array of a size of new length
4. iterate original array in reverse, if there is a space replace with first 0 and then 2 and %
5. if there is no space, just put original char to new array.
*/
public class C_Urlify {

	private static char[] replaceSpaceInString(char[] str, int truelength) {

		int spaceCounter = 0;

		// First lets calculate number of spaces

		for (int i = 0; i < truelength; i++) {
			if (str[i] == ' ')
				spaceCounter++;
		}

		// calculate new size

		// True Length + space Count*2(because each space is replace by 3 char.
		// Space calculated in true length so we need addition 2 char per space)

		int newLength = truelength + 2 * spaceCounter;

		char[] newArray = new char[newLength];

		// iterating from end  to beginning and replace space with 02% that will result in %20
		for (int i = truelength - 1; i >= 0; i--) {

			if (str[i] == ' ') {

				newArray[newLength - 1] = '0';
				newArray[newLength - 2] = '2';
				newArray[newLength - 3] = '%';
				newLength = newLength - 3;
			} else {
				newArray[newLength - 1] = str[i];
				newLength--;
			}
		}
		return newArray;
	}

	public static void main(String[] args) {
		String str = "Mr John Smith";

		char[] array = str.toCharArray();
		// only passing true length given in a problem
		System.out.println(replaceSpaceInString(array, 13));
	}
}
