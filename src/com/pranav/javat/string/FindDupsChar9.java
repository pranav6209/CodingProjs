package com.pranav.javat.string;

/*
 * Problem with this is it count its case sensitive
 * 
 */


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDupsChar9 {

	private static void findDups(String str) {

		// Initializing map to store character and its repeating values
		Map<Character, Integer> map = new HashMap<Character, Integer>();
	
		// if we do not want to count spaces, get a new string avoiding all the spaces.if we want to avoid case sensitivity convert string to either upper case or lower case
		String ns = str.replaceAll("\\s","").toLowerCase();
		
		char[] charArray = ns.toCharArray();

		for (char ch : charArray) {

			if (map.containsKey(ch)) {

				// map contains character then store that and its lates value
				map.put(ch, map.get(ch) + 1);

			}

			else

			{
				// else store character and 1
				map.put(ch, 1);

			}

		}

		// get the set of all the character. here we are using set as char will
		// not repeat. as we already counted repeated char.
		Set<Character> keys = map.keySet();

		for (Character ch : keys) {
			// if any char which keys value is greater than 1 print it.
			if (map.get(ch) > 1) {

				System.out.println("Repeated Character:-" + ch + "  " + "Repeating" + map.get(ch) + ":-times");

			}

		}

	}

	public static void main(String[] args) {

		findDups("My name is Pranav patel");

	}

}
