package com.pranav.ctci6.big0;

import java.lang.reflect.Array;

/*
http://javarevisited.blogspot.com/2015/03/how-to-reverse-array-in-place-in-java.html


https://www.youtube.com/watch?v=W-090WziKAs

*/
public class A_ReverseArray {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("Array before reverse:");

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

		
		/*
		 * Steps to Remember 
		 * 
		 * 	1.		for loop iterate through only half of the length of the Array
		 *  2.		swapping number last element is array.length-1-i
		 * 
		 * */
		
		// Logic to reverse an array.
		for (int i = 0; i < numbers.length / 2; i++) { // only go through middle
			int temp = numbers[i]; // assigning first element to temp
			numbers[i] = numbers[numbers.length - 1 - i]; // swap first and  last element.
			numbers[numbers.length - 1 - i] = temp;// assigning temp to last element
		}

		System.out.println("\nArray after reverse:");

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

}
