package com.pranav.ctci6.big0;

public class Nfactorial {

	private static int factorial(int n) {

		if (n < 0) {
			return -1;
		} else if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	public static void main(String[] args) {

		int res = factorial(5);
		System.out.println(res);

	}

}
