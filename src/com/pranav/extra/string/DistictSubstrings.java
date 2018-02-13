package com.pranav.extra.string;

import java.util.HashSet;
import java.util.Set;

public class DistictSubstrings {

	private static void uniquesubString(String string) {

		int length=string.length();

		Set<String> hs = new HashSet<String>();
		// add elements to the hash set
		for (int i = 0; i <length; i++) {
			// consider when i=2 j will be 3 to support this we are using j<=length.
			// Also substring (0,2 ) will print "pa"
			for (int j = i+1; j <=length; j++) {
			//	hs.add(string.substring(i,j));
				System.out.println(string.substring(i,j));
			}
		}
		System.out.println("Total SubString" + hs.size());

		
		// this possible because its jut a string set //optional
		for (String substring : hs) {

			System.out.println(substring);

		}
	}

	public static void main(String args[]) {

		uniquesubString("pat");

	}
}
