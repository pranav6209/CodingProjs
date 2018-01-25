package com.pranav.ctci6.sortingsearching;

import java.util.Arrays;

/*
 * Similar Program for.......
 * 
 * https://www.geeksforgeeks.org/find-a-peak-in-a-given-array/
	
	https://www.youtube.com/watch?v=U_Jz-v4_Tms	
	
*/


// array 1,8,7,9,0,4
// sort 	  0,1,4,7,8,9
// i at index 1.array[1]=1 swap 0 and 1  //1,0,4,7,8,9
// second iteration i at 3 index 3 array[3] =7 swap 7 and 4  // 1,0,7,4,8,9
// third iteration // 1,0,7,4,9,8
public class K_PeaksAndValleys {

	void sortValleyandPeak(int[] array) {

		Arrays.sort(array);
		// increment it to by two
		for (int i = 1; i < array.length; i += 2) {

			swap(array, i - 1, i);

		}

	}

	private void swap(int[] array, int left, int right) {

		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;

	}

}
