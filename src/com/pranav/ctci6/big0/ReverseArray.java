package com.pranav.ctci6.big0;

/*
http://javarevisited.blogspot.com/2015/03/how-to-reverse-array-in-place-in-java.html
*/
public class ReverseArray {
	
	public static void main(String[] args) {
	      int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	      System.out.println("Array before reverse:");
	      
	      for (int i = 0; i < numbers.length; i++) {
	         System.out.print(numbers[i] + " ");
	      } 
	      for (int i = 0; i < numbers.length / 2; i++) { // only go through middle
	         int temp = numbers[i]; // assigning first element to temp.
	         numbers[i] = numbers[numbers.length - 1 - i]; // swaping first and last element.
	         numbers[numbers.length - 1 - i] = temp;// assigning temp to last element 
	      } 
	      System.out.println("\nArray after reverse:");
	      for (int i = 0; i < numbers.length; i++) {
	         System.out.print(numbers[i] + " ");
	      } 
	   }

}
