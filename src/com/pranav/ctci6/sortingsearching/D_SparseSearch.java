package com.pranav.ctci6.sortingsearching;

public class D_SparseSearch {

	int search(String[] strs, String str, int start, int last) {
		if (start > last)
			return -1;

		// Move mid to the middle
		int mid = (last + start) / 2;

		// If mid is empty , find closet non-empty string
		if (strs[mid].isEmpty()) {
			// If mid is empty, search in both sides of mid
			// and find the closest non-empty string, and
			// set mid accordingly.
			int left = mid - 1;
			int right = mid + 1;
			while (true) {
				if (left < start && right > last) {
					return -1;
				} else if (right <= last && !strs[right].isEmpty()) {
					mid = right;
					break;
				} else if (left >= start && !strs[left].isEmpty()) {
					mid = left;
					break;
				}
				right++;
				left--;
			}
		}

		// If str is found at mid
		if (str.equals(strs[mid])) {
			return mid;
		}
		// means str[mid] is less than str so we have to search right....
		//https://www.javatpoint.com/java-string-compareto
		
		else if (strs[mid].compareTo(str) < 0) {
			return search(strs, str, mid + 1, last);
		} else {

			// If str is smaller than mid
			return search(strs, str, start, mid - 1);
		}
	}

	public static void main(String[] args) 	{
	    // Input arr of Strings.
	    String [] strs = {"for", "", "", "", "geeks", "ide", "",
	                     "practice", "" , "", "quiz", "", ""};
	 
	    // input Search String
	    String searchString = "ide";
	    
	   D_SparseSearch ds = new D_SparseSearch();
	   
	   ds.search(strs, searchString, 0, strs.length-1);
	    
	    

	}

}
