package com.pranav.ctci6.big0;

/*checking the divisibility on number less than it,it only need to go up the square root of the no 
 * because if it is divisible by no greater than it square root then it is divisible by something smaller than it.*/


public class B_PrimeNo {

	 	static boolean isPrime(int n) {

		/*
		 * 
		 * 1. only iterate through square root of no (easy to do i*i = n)
		 * 2.	start a loop at 2 as it is a smallest prime no.
		 * 
		 * */
		
		for (int i = 2; i*i <= n; i++) {

			if (n % i == 0) {
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
