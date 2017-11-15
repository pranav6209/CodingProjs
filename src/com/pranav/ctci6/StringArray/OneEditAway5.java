/**
 * 
 */
package com.pranav.ctci6.StringArray;

/**
 * @author pranavpatel
 *
 */
public class OneEditAway5 {

	private static boolean oneEdit(String first, String second) {

		// same Length... Edit
		if (first.length() == second.length()) {
			return oneEditReplace(first, second);

			// Length+1... Insertion
		} else if (first.length() + 1 == second.length()) {

			return oneEditInsert(first, second);

		}

		// Length-1... Removal -- Parameter second first.
		else if (first.length() - 1 == second.length()) {

			return oneEditInsert(second, first);

		}

		return false;
	}

	private static boolean oneEditReplace(String s1, String s2) {

		// abcd --> accd

		boolean foundDifference = false;

		for (int i = 0; i < s1.length(); i++) {

			if (s1.charAt(i) != s2.charAt(i)) {

				// foundDifference is flagged to false initially.
				//on the first diff, foundDifference will be flagged to true, if char is not matched after that there is more than one edit so return false;
				if (foundDifference)

				{
					return false;
				}

				foundDifference = true;

			}

		}
		// in all other scenario it returns true and its only one edit away
		return true;
	}

	
	//as we are reverting i/p string in Parameter, Longest String will be always s1.....
	private static boolean oneEditInsert(String s1, String s2) {

		// abcd --> acd
		// abcd --> abccd

		int index1 = 0;
		int index2 = 0;

		while (index2 < s2.length() && index1 < s1.length()) {

			if (s1.charAt(index1) != s2.charAt(index2)) {  //index1= 0, index2 =0 first iteration no diff
																					// index1=1, index2=1 second iteration char diff and index is same..increment index 2 by 1
																					// index1=1,index2=2 
																	
				
				// If character is different and index is not same return false.
				if (index1 != index2) {

					return false;
				}
				
				index2++;

			}

			else {

				index1++;
				index2++;
			}

		}

		return true;
	}

	public static void main(String[] args) {
		
		System.out.println(oneEdit("abcd", "accd"));
		System.out.println(oneEdit("abcd", "acd"));
		System.out.println(oneEdit("abd", "abcd"));

	}

}
