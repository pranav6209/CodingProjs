package com.pranav.ctci6.sortingsearching;


class BinarySearch
{
	// Returns index of x if it is present in arr[] else return -1
	int binarySearch(int arr[], int searchElement) {
		int start = 0, end = arr.length - 1;
		while (start <= end) {
			int middleIndex = (start + end) / 2;

			// Check if x is present at mid
			if (searchElement==arr[middleIndex] )
				return middleIndex;

			// If searchElement is less than middle , ignore right half and search left.
			if ( searchElement<arr[middleIndex])
				end = middleIndex - 1;

			// else  ignore right half
			else
				start = middleIndex + 1;
		}
		// if we reach here, then element was
		// not present
		return -1;
	}

	// Driver method to test above
	public static void main(String args[]) {
		BinarySearch ob = new BinarySearch();
		int []arr  = { 2, 3, 4, 10, 40,50,60,120,290,500,700 };
		int x = 500;
		int result = ob.binarySearch(arr, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at " + "index " + result);
	}
}