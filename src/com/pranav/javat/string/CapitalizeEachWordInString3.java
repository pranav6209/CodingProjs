package com.pranav.javat.string;

public class CapitalizeEachWordInString3 {

	public static String capitalizeWord(String str) {

		// split the string with whitespace
		String words[] = str.split("\\s");

		StringBuffer sb = new StringBuffer();

		for (String w:words) {
			
			// get the first character 
			String first = w.substring(0,1);
			// get the rest of  character 
			String afterFirst = w.substring(1);
			//add it to final string
			sb.append(first.toUpperCase()).append(afterFirst).append(" ");

		}
		return sb.toString();

	}

	public static void main(String[] args) {

		System.out.println(capitalizeWord("my name is pranav"));

	}

}
