package com.pranav.ctci6.StringArray;

/*CallaEdit

You have K arrays (potentially large, for example 100 000).
Arrays contain numbers is less than the number N. 

You need to find approach to find the number of such pairs of numbers (a, b) where none appears in any of K arrays. 

You don’t need to print combinations of numbers, result is count of possible combinations of such numbers. 


 
[
 (1,3,3,2,5,6),
 (5,6),
 (3,3),
 (2,2)
]
N=7, K=4

result: count=4

(4, 4)
(4, 7)
(7, 4)
(7, 7)




*/

public class CodingChallange {

	private static void countNoOfCombination(int input[][], int n, int k) {
		String missingValue = "";
		boolean found = false;

		//loop through values can be passed in the input E.g. 7
		for (int find = 1; find <= n; find++) {
			found = false;
			//loop through first element of the input array
			for (int i = 0; i < input.length; i++) {
				//loop through second element of the input array
				for (int j = 0; j < input[i].length; j++) {
					//compare value if present then consider found and break loop
					if (input[i][j] == find) {
						found = true;
						break;
					}
				}
			}
			//if not found then store in the variable
			if (found == false) {
				missingValue = missingValue + find + ",";
			}

		}

		//convert not found number to array 
		String missingNumbers[] = missingValue.split(",");

		//print output
		System.out.println(missingNumbers.length * missingNumbers.length);

	}

	public static void main(String[] args) {

		int [][] input = { { 1, 3, 3, 2, 5 }, { 5, 6 }, { 3, 3 }, { 2, 2 } };

		int n = 7, k = 4;

		CodingChallange.countNoOfCombination(input, n, k);
	}
}

