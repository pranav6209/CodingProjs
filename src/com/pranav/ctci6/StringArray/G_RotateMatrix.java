package com.pranav.ctci6.StringArray;

/*
 * step by step graphical representation.
 * 
 * http://www.geeksforgeeks.org/inplace-rotate-square-matrix-by-90-degrees/
 * 
 * 
 */

public class G_RotateMatrix {

	private static int[][] rotate(int[][] matrix) {

		if (matrix.length == 0 || matrix.length != matrix[0].length)
			
			System.out.println("Improper Matrix");

		int matrixLegnth = matrix.length;
		
		// we have to do two rotation. first layer  and second layer

		for (int layer = 0; layer < matrixLegnth / 2; layer++) {

			// we need three pointer first, last and offset to which will use go from last element to next element.
			
			int first = layer; // 0 //1

			int last = matrixLegnth - 1 - layer; // 3 //2  // first iteration do not think of subtracting layer 

			// this loop iterated 3 times  and rotate outer layer	// for the first outer loop.second time once .
			
			for (int i = first; i < last; i++) { 
												

				int offset = i - first; // 0 //1//2//3

				// save top 
				int top = matrix[first][i];   // to access [0,0],[0,1],[0,2] elements

				// left ->top
				matrix[first][i] = matrix[last - offset][first]; //to access [3,0],[2,0],[1,0] elements

				// bottom->left
				matrix[last - offset][first] = matrix[last][last - offset];//to access [3,3],[3,2],[3,1] elements

				// right ->bottom
				matrix[last][last - offset] = matrix[i][last];//to access [0,3] [1,3],[2,3] elements

				// top->right
				matrix[i][last] = top; // right <-saved top

			}

		}

		return matrix;
	}

	public static void main(String[] args) {

		int[][] array = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		
		// represent how many rows in the multy dimension array.
		System.out.println(array.length);
		
		// represent how many columns in the multy dimension array.
		System.out.println(array[0].length);

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(array[i][j] + ",");
			}
			System.out.println();
		}
		System.out.println();
		int[][] romatrix = rotate(array);

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(romatrix[i][j] + ",");
			}
			System.out.println();
		}

	}
}

