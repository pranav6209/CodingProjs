package com.pranav.ctci6.big0;


public class E_PrintFib {

	public static int fit(int n) {

		if (n <= 0)
			return 0;

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
