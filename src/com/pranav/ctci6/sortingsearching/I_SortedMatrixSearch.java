package com.pranav.ctci6.sortingsearching;

public class I_SortedMatrixSearch {
	/*
	 * https://www.youtube.com/watch?v=dsPdwhRR_84
	 
	
	
		15		20		40		85
		20		35		80		95
		30		55		95		105
		40		80		100		120
		
		searching 55
		
		*/

	boolean findElement(int[][] matrix, int searchElement) {

		int row = 0, col = matrix[0].length - 1;  //for  4*4 row =0, col=4

		while (row < matrix.length && col > 0) {  // increment row till it is less than length 
																			// decrementing till col is greater than 0

			if (matrix[row][col] == searchElement) {  // first iteration 85 will be picked 
				return true;
			} else if (searchElement < matrix[row][col]) { // since search element is less decreasing col...
				col--;
			} else {

				row++;
			}

		}

		return false;

	}

}
