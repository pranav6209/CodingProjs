package com.pranav.gfg;

import java.util.ArrayList;
import java.util.List;

public class JumpingCloud extends RepeatedString {
	
@Override
public int add(long a, long b) {
	// TODO Auto-generated method stub
	 int c= (int)super.add(a, b);
	 
	 int [] arra = {1,2,3,4,5};
	 
	 
	 List<Integer> list = new ArrayList<Integer>();å

	 
	 return c;
	 
}

	public  int countJumpingCloud(int[] arr, int n) {

		int count = 0;

		for (int i = 0; i < n - 2; i++) {

			if (arr[i + 2] == 0) {
				count++;
				i++;
				continue;
			} if (arr[i+1]==0) count ++;

		}

		return count;

	}
	
	public  Long countJumpingCloud(int[] arr, int n,int c) {
		
		
		return c;
	}

//	public static void main(String[] args) {
//
//		int[] arr = { 0, 0, 1, 0, 0, 1, 0 };
//		int n = 7;
//		System.out.println(countJumpingCloud(arr, n));
//
//	}

}
