package com.pranav.gfg;


public class RepeatedString  extends prac{
	

	
	public long add(long a,long b){
		
		return (a+b);
		
	}

	public static long repeatedString(String s, long n) {
		

		long count = 0;
		if (n > s.length()) {
			for (int i = 0; i < s.length(); i++) {

				if (s.charAt(i) == 'a')
					count++;

			}

			long noOfEvenRepeat = n / s.length();

			count = count * noOfEvenRepeat;

			for (int i = 0; i < n % noOfEvenRepeat; i++) {

				if (s.charAt(i) == 'a')
					count++;

			}
		}
		
		else {
			for (int i = 0; i <= s.length()-n; i++) {

				if (s.charAt(i) == 'a')
					count++;

			}
		}
		
		return count;

	}

	public static void main(String[] args) {
		
		Prac prac = new Prac();
		
		prac.setA(10);
		
	
		
		repeatedString("ababa",3);

	}

}
