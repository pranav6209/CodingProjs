package com.pranav.javat.string;

/*
 * Problem with this is it count its case sensitive
 * 
 * Logic 
 * 		1. Replace all spaces and remove case sensitivity
 * 		2. initialize Map <Charachter,Integer>
 * 		3.	convert String to char array
 * 		4. Iterate through chararray and if char is repeating increase its value by 1 else just insert char with initial value 1 in map
 * 		5. make the set to iterate through key,
 * 		6. get the char with value more than 1 .
 * 
 * 
 */


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class I_FindDupsChar {

	private static void findDups(String str) {

		// Initializing map to store character and its repeating values
		Map<Character, Integer> map = new HashMap<Character, Integer>();
	
		// if we do not want to count spaces, get a new string avoiding all the spaces.if we want to avoid case sensitivity convert string to either upper case or lower case
		String ns = str.replaceAll("\\s","").toLowerCase();
		
		char[] charArray = ns.toCharArray();

		for (int i=0;i<charArray.length;i++) {

			if (map.containsKey(charArray[i])) {

				// map contains character then store that and its latest value.map.get(key) method return the value of the key
				map.put(charArray[i], map.get(charArray[i]) + 1);

			}

			else

			{
				// else store character and 1
				map.put(charArray[i], 1);

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
