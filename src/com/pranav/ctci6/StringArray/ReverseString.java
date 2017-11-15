package com.pranav.ctci6.StringArray;

public class ReverseString {

	public static boolean isRotation(String s1, String s2) {

		if (s1.length() == s2.length() && s1.length() > 0) {

			String s1s1 = s1 + s1;

			return isSubstring(s1s1, s2);

		}

		return false;

	}

	public static boolean isSubstring(String s1, String s2) {

		/*
		 * s1=waterbottlewaterbottle; s2=erbottlewat
		 */

		// check if s1.length() is not less than s2
		if (s1.length() < s2.length())
			return false;

		// if s1.length() == s2.length() after concatenation, both string
		// content might be equal.
		if (s1.length() == s2.length())
			return s1.equals(s2);

		for (int i = 0; i <= s1.length() - s2.length(); i++) {

			// check for s1 char and s2 char are same.
			if (s1.charAt(i) == s2.charAt(0)) {

				// initializing mathcLegnth to 1.
				int matchLength = 1;

				// now iterate both the string with j
				for (int j = 1; j < s2.length(); j++) {

					// check same char
					if (s1.charAt(i + j) != s2.charAt(j)) {

						break;
					}
					matchLength++;
				}
				if (matchLength == s2.length())
					return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		System.out.println(isRotation("waterbottle", "erbottlewat"));

		System.out.println(isRotation("waterbottle", "erbottlewattttt"));

	}

}