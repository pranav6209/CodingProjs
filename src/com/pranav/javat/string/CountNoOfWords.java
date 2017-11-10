package com.pranav.javat.string;

public class CountNoOfWords {
	
	
	
	private static int countWords(String str){
		
		int counts=0;
		
		String [] words = str.split("\\s");
		
		counts= words.length;
		
		return counts;
	}
	
	public static void main(String[] args) {
		
		System.out.println(countWords("My Name Is Pranav"));
		
		
		
	}

}
