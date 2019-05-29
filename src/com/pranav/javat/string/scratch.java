package com.pranav.javat.string;

public class scratch {

	public static String reverseString(String str) {

		String[] strs = str.split("\\s");
		StringBuffer sb = new StringBuffer();

		for (String s : strs) {

			sb.append(s.substring(0, 1).toUpperCase());
			sb.append(s.substring(1).toLowerCase());
			sb.append(" ");

		}

		return sb.toString();
	}

	public static void main(String args[]) {

		System.out.println(reverseString("my nAme is pranav"));
	}

}
