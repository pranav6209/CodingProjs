package com.pranav.ctci6.big0;

//fibonacai series 0,1,1,2,3,5,8

/*to understand recursive call...min 5:00
https://www.youtube.com/watch?v=ozmE8G6YKww
*/

public class E_PrintFib {

	public static int fit(int n) {
		
		// get the first no 0
		if (n <= 0)
			return 0;
		// get the second no 1
		else if (n == 1)
			return 1;

		else
			return fit(n - 1) + fit(n - 2);

	}

	public static void allfib(int n)

	{
		for (int i = 0; i < n; i++) {

			System.out.print(fit(i));
		}
	}
	public static void main(String[] args) {

		allfib(8);

	}

}
