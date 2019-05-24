package com.pranav.javat.string;

public class scratch {
	
	
	
	public static String reverseString(String str){
		
		char [] arr = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		
		for ( int i=arr.length-1;i>=0;i--){
			sb.append(arr[i]);
		}
		
		return sb.toString();
		
	}

	public static void main(String args[]){
		
		System.out.println(reverseString("My Name Is Pranav"));
	}
	
}
