package com.pranav.extra.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Whiteboard {

	private static void findDups(String str) {
		
		char [] ch = str.toCharArray();
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		int count =0;
		
		for (int i = 0; i < ch.length; i++) {

			if (map.containsKey(ch)) {

				map.get(ch);
				map.put(ch[i], map.get(ch) + 1);

			} else {

				map.put(ch[i], 1);

			}

		}
		
		
		Set<Character> set = map.keySet();
		
		for(Character ch1 : set){
			
			System.out.println(set+);
			
			
			
		}
		
		
		
		

	}

	public static void main(String args[]) {
		
		
		String str = "my name is pranav";
		
		findDups(str);

	}

}
