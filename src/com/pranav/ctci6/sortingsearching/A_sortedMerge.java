package com.pranav.ctci6.sortingsearching;

public class A_sortedMerge {

	void merge(int[] a, int[] b, int lastA, int lastB) {

		int indexA = lastA - 1; // index of last element in Array A.
		int indexB = lastB - 1;// index of last element in Array B
		int indexMerged = lastA + lastB - 1; // Index of Merged Array

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

}
