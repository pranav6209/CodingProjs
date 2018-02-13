package com.pranav.javat.string;

import java.util.Arrays;

/*
 * 
 * http://javaconceptoftheday.com/how-to-reverse-the-string-with-preserving-the-position-of-spaces/
 * 
 * 
 * 
 * Logic 
 * 		1. create result array of same size as i/p string array.
 * 		2. if i/p array has a space at specific index, insert spaces in result array at the same index.
 * 		3.	iterate i/p array in reverse,
 * 					 if there is no space in i/p array and a if space in result array, decrease the index of result array as we have to preserve spaces.
 * 					 if there is no space in i/p array and a if  no space in result array, put the i/p array char in to result array.
 * 
 * 
 */


public class N_ReverseStringPreservingPositionOfSpaces
{    
	
	private static char [] reverseString(String inputString) {

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
					// if resulat array has a space and i/p array doesn't
					// decrease j and then swap the char.
					j--;
				}
				// in any case this will execute.
				resultArray[j] = inputArray[i];
				j--;

			}

		}

		
		return resultArray;

	}
   
     
    public static void main(String[] args)
	{
		System.out.println(reverseString("I Am Not String"));
		
		System.out.println(reverseString("JAVA JSP ANDROID"));

		System.out.println(reverseString("1 22 333 4444 55555"));
	}
}