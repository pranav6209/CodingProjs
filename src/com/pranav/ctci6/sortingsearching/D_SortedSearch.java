package com.pranav.ctci6.sortingsearching;

import java.util.List;

public class D_SortedSearch {
	
	
	int sortedSearch(List list, int searchElement) {
		
		int index=1;

		while(list.elementAt(index)!=-1&& searchElement<list.elementAt(index)){
			
			index=index*2;
			
		}
		return binarySearch(list, searchElement,index/2,index);

	}
	
	
	// Returns index of x if it is present in arr[] else return -1
		int binarySearch(List list, int searchElement,int start,int end) {
			
			
			while (start <= end) {
				
				int midIndex = (start + end) / 2;
				
				int middle = list.elementAt(midIndex);

				// Check if searchElement is present at mid
				if (searchElement==arr[m])
					return m;

				// If searchElement is less than midle, ignore right half and search left.
				// if the middle is -1 element is too big and and search left
				if ( searchElement<arr[m]||middle==-1)
					end = midIndex - 1;

				// If x is smaller, ignore right half
				else
					start = midIndex + 1;
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
			int result = ob.sortedSearch(arr, x);
			if (result == -1)
				System.out.println("Element not present");
			else
				System.out.println("Element found at " + "index " + result);
		}

}
