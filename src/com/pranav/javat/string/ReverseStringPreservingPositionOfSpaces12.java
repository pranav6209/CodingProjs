package com.pranav.javat.string;

/*
 * 
 * http://javaconceptoftheday.com/how-to-reverse-the-string-with-preserving-the-position-of-spaces/
 * 
 */

public class ReverseStringPreservingPositionOfSpaces12
{    
	
	private static void reverseString(String inputString) {

		// covert i/p string to Array
		char[] inputArray = inputString.toCharArray();

		// create result array which is same size of i/p array
		char[] resultArray = new char[inputArray.length];

		// assign spaces at the same index in the result array as input array.
		for (int i = 0; i < inputArray.length; i++) {

			if (inputArray[i] == ' ') {

				resultArray[i] = ' ';

			}

		}
		
		// initialize j in reverse of i
		int j = inputArray.length - 1;
 
		// iterate through input array avoiding white space and assign first value of input array i to last value of result array j.
		// if in result array there is an empty space avoid it and move to next index.
		for (int i = 0; i < inputArray.length; i++) {

			if (inputArray[i] != ' ') {

				if (resultArray[j] == ' ') {

					j--;
				}

				resultArray[j] = inputArray[i];
				j--;

			}

		}

		System.out.println(inputString + " ---> " + String.valueOf(resultArray));

	}
   
     
    public static void main(String[] args)
	{
		reverseString("I Am Not String");

		reverseString("JAVA JSP ANDROID");

		reverseString("1 22 333 4444 55555");
	}
}