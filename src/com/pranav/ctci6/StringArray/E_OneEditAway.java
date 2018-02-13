/**
 * 
 */
package com.pranav.ctci6.StringArray;

/**
 * @author pranavpatel
 *
 */
public class E_OneEditAway {

	private static boolean oneEdit(String first, String second) {

		// same Length... Replace
		if (first.length() == second.length()) {
			return oneEditReplace(first, second);

			// second length is smaller --->Removal
		} else if (first.length() + 1 == second.length()) {

			return oneEditInsert(first, second);

		}

		//  second length is bigger --->Insertion
		// Reversing i/p parameter so second string is always bigger...
		else if (first.length() - 1 == second.length()) {

			return oneEditInsert(second, first);

		}

		return false;
	}

	private static boolean oneEditReplace(String s1, String s2) {

		boolean foundDifference = false;

		for (int i = 0; i < s1.length(); i++) {

			if (s1.charAt(i) != s2.charAt(i)) {

				// foundDifference is flagged to false initially.
				//on the first diff, foundDifference will be flagged to true, 
				//if char is not matched after that there is more than one edit so return false;
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

	
	//as we are reverting i/p string in Parameter, Longest String will be always s2.....
	private static boolean oneEditInsert(String s1, String s2) {


		int index1 = 0;
		int index2 = 0;
		
		// while loop because we want to handle increment by our self.

		while (index2 < s2.length() && index1 < s1.length()) {

			if (s1.charAt(index1) != s2.charAt(index2)) { 
																	
				// index must be same for a char difference else return false.
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
		System.out.println(oneEdit("abde", "abcd"));

	}

}
