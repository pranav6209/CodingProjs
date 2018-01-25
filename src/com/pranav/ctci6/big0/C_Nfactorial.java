package com.pranav.ctci6.big0;

/*to understand recursive call...min 5:00
https://www.youtube.com/watch?v=ozmE8G6YKww
*/
public class C_Nfactorial {

	static int factorial(int n) {

	if (n == 0) 
			return 1;
		else 
			return n * factorial(n - 1);	
	}

	public static void main(String[] args) {

		System.out.println(factorial(5));
	}
}

