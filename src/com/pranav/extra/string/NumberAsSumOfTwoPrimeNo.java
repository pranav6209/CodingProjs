package com.pranav.extra.string;

/*
https://www.geeksforgeeks.org/check-number-can-written-sum-k-prime-numbers/

prime no-2, 3, 5, 7, 11, 13, 17

n even yes 
n odd n-2 is prime --> odd+odd = even yes 
n odd n-2 is notprime --> even + odd == no

*/

public class NumberAsSumOfTwoPrimeNo {
	
	
	private static boolean checkPrime(int n) {

		for (int i = 2; i * i <= n; i++) {

			if (n % i == 0)
				return false;
		}

		return true;
	}
	
	private static boolean sumOfPrime(int n, int k) {

		// if n is even no, it can be always divided in to two prime no.
		if (n % 2 == 0)

			return true;

		// if n is odd and n-2 is prime, can be divided return true 

		else {

			if (checkPrime(n - 2))
				return true;

			// else false
			return false;

		}

	}
	
	public static void main(String[] args) {
		int n = 14, k = 2;
		System.out.println(sumOfPrime(n, k));
	}

}
