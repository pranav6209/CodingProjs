package com.pranav.ctci6.StringArray;

/*
 * 
 * https://www.javatpoint.com/difference-between-arraylist-and-vector
 * 
 * Logic...
 * 
 * 1. Book page 205
 * 
 * 
 */

public class H_ZeroMatrix {

	private static int[][] setZeroa(int[][] matrix) {

		boolean rowHasZero = false;
		boolean columnHasZero = false;
		// Think Like i is a iteration for row and j for column;
		
		// check if first row has zero

		for (int j = 0; j < matrix[0].length; j++) {

			// if first row element is zero, set rowHasZero flag to true.
			if (matrix[0][j] == 0) {

				rowHasZero = true;
				break;

			}

		}

		// check if first column has zero

		for (int i = 0; i < matrix.length; i++) {

			// if first column element is zero, set columnHasZero flag to true.
			if (matrix[i][0] == 0) {

				columnHasZero = true;
				break;

			}

		}

		// check in the rest of matrix if any position contain zero. starting i=1

		for (int i = 1; i < matrix.length; i++) {

			for (int j = 1; j < matrix[0].length; j++) {

				// if any position contains zero, flag that row and column value to zero
				if (matrix[i][j] == 0) {

					/*
					 * let says in over matrix at index [1,3] we have 0 we will
					 * first set matrix[1,0] and [0,3] to 0 see below matrix
					 * 
					 * 1, 		0,		3, 	0 
					 * 0, 		6, 	7, 	0 
					 * 9, 		10, 11, 	12 
					 * 13, 	14, 15, 	16
					 * 
					 */

					matrix[i][0] = 0;
					matrix[0][j] = 0;

				}
			}
		}

		// Nullify rows

		for (int i = 0; i < matrix.length; i++) {

			/*
			 * think of [1,0] from above now we are making that entire row
			 * 0.passing this one as a row no and then increasing column to make
			 * it zero.
			 */

			if (matrix[i][0] == 0) {

				nullifyRow(matrix, i);

			}
		}

		// Nullify columns

		for (int j = 0; j < matrix[0].length; j++) {
			/*
			 * think of [0,1] from above now we are making that entire column
			 * 0.passing this one as a row no and then increasing row to make it
			 * zero.
			 */
			if (matrix[0][j] == 0) {

				nullifyColumn(matrix, j);

			}
		}

		// Nullify first row if rowHasZero flagged true.
		if (rowHasZero) {

			nullifyRow(matrix, 0);
		}

		// Nullify first row if rowHasZero flagged true.

		if (columnHasZero) {

			nullifyColumn(matrix, 0);
		}
		return matrix;
	}

	private static void nullifyColumn(int[][] matrix, int col) {
		for (int i = 0; i < matrix.length; i++) {

			matrix[i][col] = 0;
		}

	}

	private static void nullifyRow(int[][] matrix, int row) {

		for (int j = 0; j < matrix[0].length; j++) {

			matrix[row][j] = 0;
		}
	}

	public static void main(String[] args) {

		int[][] array = { { 1, 0, 3, 4 }, { 5, 6, 7, 0 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		// represent how many rows in the multidimensional array.
		System.out.println(array.length);

		// represent how many columns in the multidimensional array.
		System.out.println(array[0].length);

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(array[i][j] + ",");
			}
			System.out.println();
		}
		System.out.println();
		int[][] romatrix = setZeroa(array);

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(romatrix[i][j] + ",");
			}
			System.out.println();
		}

	}

}
