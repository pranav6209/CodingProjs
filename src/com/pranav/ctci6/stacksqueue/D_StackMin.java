package com.pranav.ctci6.stacksqueue;

/*
 * 
 * watch the video from geektogeek..
 * 
 * https://www.geeksforgeeks.org/design-and-implement-special-stack-data-structure/
 
 * 
 */

//Java implementation of SpecialStack
//Note : here we use Stack class for Stack implementation

import java.util.Stack;

/* A class that supports all the stack operations and one additional
operation getMin() that returns the minimum element from stack at
any time. This class inherits from the stack class and uses an
auxiliarry stack that holds minimum elements */

public class D_StackMin extends Stack<Integer>
{

	Stack<Integer> min = new Stack<>(); // creating min stack(auxiliary stack)

	/*
	 * SpecialStack's member method to insert an element to it. This method
	 * makes sure that the min stack is also updated with appropriate minimum
	 * values
	 */
	 void push(int x)
	    {
		   //if both the stack are empty.we are pushing element to both the stack...
	        if(isEmpty() == true)
	        {
	        	
	            super.push(x); // super means main stack..
	            min.push(x);
	        }
	        else
	        {
	        	//in any case we are pushing it to main stack...
	            super.push(x);

	            // get the top of auxiliary stack for compare...
	            int y = min.peek();
	            //  int y = min.pop();
	           //  min.push(y);
	            if(x < y)
	                min.push(x);
	            else
	                min.push(y);
	        }
	    }

	   /* SpecialStack's member method to insert an element to it. This method
	    makes sure that the min stack is also updated with appropriate minimum
	    values */
	 
	 	// pop the element from both the stack.
	    public Integer pop()
	    {
	        int x = super.pop();
	        min.pop();
	        return x;
	    }

	/* SpecialStack's member method to get minimum element from it. */
	int getMin() {
		int x = min.peek();
	//	int x = min.pop();
    //  min.push(x);
		return x;
	}

	/* Driver program to test SpecialStack methods */
	public static void main(String[] args) {
		D_StackMin s = new D_StackMin();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.getMin());
		s.push(5);
		System.out.println(s.getMin());
	}
}
