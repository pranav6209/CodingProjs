package com.pranav.ctci6.sortingsearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/* 
 * idea here is, 
 * 
 * we are creating a hash map where key is a sorted string(which will be same for anagram) 
 * 
 * and value will be list of string which will have same sorted order....
 * 
 */

public class B_GroupAnagrams {

	static List<List<String>> sort(String[] strs) {

		
		// remember strs[i] is the original string in the array and s is the sorted string.
		
		// creating map of String (key) and value which is list of Strings.
		Map<String, List<String>> m = new HashMap<String, List<String>>(); 

		// iterate through array of string.
		for (int i = 0; i < strs.length; i++) { //0 eat

			char[] c = strs[i].toCharArray(); //[e,a,t]
			
			Arrays.sort(c); //[a,e,t]

			String s = new String(c); //aet

		// if map contains the sorted string (key), two strings has same sorted sting and so they are anagram
		// store the original string with the same key....
			
			if (m.containsKey(s)) { 

				// here when we do get on map, it will return the list of String so to add string here we have to use 
				// add method of list and not a put method.
				m.get(s).add(strs[i]);

			}

			else {
				//intialize new list and 
				List<String> l = new ArrayList<String>();
				l.add(strs[i]);
				// add the sorted String (key) and original Strings in the map
				m.put(s, l);
			}

		}

		return new ArrayList<List<String>>(m.values());

	}

	public static void main(String args[]) {
		String[] str = {"eat", "tea", "tan", "nat", "bat","ate" };

		
		List<List<String>> str1 = sort(str);
		
		for (List<String> list : str1) {
			
			System.out.println(list);
			
		}
 
	}

}
