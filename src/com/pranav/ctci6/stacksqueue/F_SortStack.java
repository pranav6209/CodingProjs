package com.pranav.ctci6.stacksqueue;

import java.util.ListIterator;
import java.util.Stack;

public class F_SortStack {

	/*
	 * https://www.youtube.com/watch?v=nll-b4GeiX4
	 * 
	 */

	public static Stack<Integer> sortStack(Stack<Integer> stack) {

		if (stack == null || stack.isEmpty())

			return stack;

		Stack<Integer> newStack = new Stack<Integer>();

		newStack.push(stack.pop());

		while (!newStack.isEmpty()) {

			int temp = stack.pop();

			while (!newStack.isEmpty() && temp > newStack.peek()) {

				stack.push(newStack.pop());

			}

			newStack.push(temp);

		}

		return newStack;
	}
	
	
	/*
	 * Print Code is not working. Logic is Fine...
	 * 
	 */
	
/*	  static void printStack(Stack<Integer> s)
	    {
	       ListIterator<Integer> lt = s.listIterator();
	        
	       // forwarding
	       while(lt.hasNext())
	           lt.next();
	        
	       // printing from top to bottom
	       while(lt.hasPrevious())
	           System.out.print(lt.previous()+" ");
	    }
	   
	    // Driver method 
	    public static void main(String[] args) 
	    {
	        Stack<Integer> s = new Stack<>();
	        s.push(30);
	        s.push(-5);
	        s.push(18);
	        s.push(14);
	        s.push(-3);
	      
	        System.out.println("Stack elements before sorting: ");
	        printStack(s);
	      
	        Stack<Integer> s1= sortStack(s);
	      
	        System.out.println(" \n\nStack elements after sorting:");
	        printStack(s1);
	      
	    }*/

}
