package com.pranav.ctci6.big0;

// fibonacai series 0,1,1,2,3,5,8

/*to understand recursive call...min 5:00
https://www.youtube.com/watch?v=ozmE8G6YKww
*/

public class D_ComputeNthFibonaciNo {

	public static int computeNo(int n) {

		if (n <= 0)
			return 0;
		else if (n == 1)
			// if n is 1 total will be 1
			return 1;
		else
			return computeNo(n - 1) + computeNo(n - 2);
		

	}

	public static void main(String[] args) {

		int sum = computeNo(6);
		System.out.println(sum);

	}

}
