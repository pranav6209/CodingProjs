package com.pranav.ctci6.big0;

/*checking the divisibility on number less than it,it only need to go up the square root of the no because if it is divisible by no greater than it square root then it is
divisible by something smaller than it.*/


public class PrimeNo {

	private static boolean isPrime(int n) {

		for (int x = 2; x * x <= n; x++) {

			if (n % x == 0) {
				System.out.println("Not Prime");
				return false;
			}

		}
		System.out.println(" Prime");
		return true;

	}
	
	
	public static void main(String[] args) {
		
		isPrime(31);
	}

}
