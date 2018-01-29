package com.pranav.javat.string;

public class C_CapitalizeEachWordInString {
	
	/*		
	 * Steps To Remember
	 * 
	 * 		1.  Split the String with whitespace and get the word array
			2.	 iterate through each word and get a substring of first string and remaining string 
			3. append to sb capitalizing first string to upper case and and remaining string to lower case.
	*/

	public static String capitalizeWord(String str) {

		// split the string with whitespace
		String [] words = str.split("\\s");

		StringBuffer sb = new StringBuffer();

/*		Alternate Method For each...
 * 			for (String w:words) {
			
			// get the first character 
			String first = w.substring(0,1);
			// get the rest of  character 
			String afterFirst = w.substring(1);
			//add it to final string
			sb.append(first.toUpperCase()).append(afterFirst).append(" ");
			
		}*/
			
			for (int i = 0; i < words.length; i++) {	
				// get the first character 
				String first = words[i].substring(0,1);
				// get the rest of  character 
				String afterFirst = words[i].substring(1);
				//add it to final string
				sb.append(first.toUpperCase()).append(afterFirst).append(" ");

			}

		
		return sb.toString();

	}

	public static void main(String[] args) {

		System.out.println(capitalizeWord("my name is pranav"));

	}

}
