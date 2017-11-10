package com.pranav.ctci6.StringArray;

public class IsUnique1 {
	
	private static boolean isUniqueChars(String str){
		
		boolean [] char_set = new boolean[128]; // generates array with initial value false.
		
		for (int i = 0; i < str.length(); i++) { // iterate through String
			
			//	char ch= str.charAt(i); //
		
		int val= str.charAt(i); // returns ascii value.
			
			if(char_set[val]){ // if array value true, char is repeating
				
				return false;
				
			}
			char_set[val]=true; // make array value true if we come across char
		}
	
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println(isUniqueChars("My Name"));
		
	}

}
