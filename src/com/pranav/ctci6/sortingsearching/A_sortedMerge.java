package com.pranav.ctci6.sortingsearching;

public class A_sortedMerge {

	void merge(int[] a, int[] b, int lastA, int lastB) {

		// [1,3,5]
		// [2,4]
		int indexA = lastA - 1; // index of last element in Array A //2
		int indexB = lastB - 1;// index of last element in Array B //1
		int indexMerged = lastA + lastB - 1; // Index of Merged Array //4

		// we are replacing last element of the indexMerged with last bigger
		// element between a and b
		while (indexB >= 0) {

			if (indexA >= 0 && a[indexA] > b[indexB]) {

				a[indexMerged] = a[indexA];
				indexA--;

			}

			else {

				a[indexMerged] = b[indexB];
				indexB--;

			}
			indexMerged--;
		}

	}
	
	public static void main(String[] args) {
		
		
		
	}

}
