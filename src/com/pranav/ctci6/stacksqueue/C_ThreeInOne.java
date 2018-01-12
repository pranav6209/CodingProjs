package com.pranav.ctci6.stacksqueue;

/*
 * https://www.geeksforgeeks.org/implement-two-stacks-in-an-array/
 * 
 * https://www.youtube.com/watch?v=cJgVdvWz4iU
 * 
 * 
 * Here in this Problem we are adding an element in two stacks and implementing those 2 stacks in array simultaneously.
 * 
 * we have to implement push and pop function....
 * 
 * here in main function we are making array of 5 ..pushing 2 element in stack 1 and 3 in stack 2. Once we remove an element from stack 1 we are adding an element 
 * in stack 2. as we have a space limitation.
 * 
 * if we do not pop and element from stack 1 and and push one more element to stack 2 we ll hava a data overflow since we have array of 5
 * 
 * 
 * 
 * 
 * 
 * 
 */

//Java program to implement two stacks in a single array
class C_ThreeInOne
{
	int size;
	int top1, top2;
	int arr[];

	// Constructor
	C_ThreeInOne(int n) {
		arr = new int[n];
		size = n;
		top1 = -1;
		top2 = size;
	}

	// Method to push an element x to stack1
	void push1(int x) {
		// There is at least one empty space for new element
		
		// for the first push top1 =-1 and top2= 5;
		
		// remember this. for solution try inserting elements from main and check this condition. remember array length is 5 in this case.
		if (top1 < top2 - 1) {
			// incrementing top1 as we have to push first element of stack1 at index 0;
			top1++;
			arr[top1] = x;
		} else {
			System.out.println("Stack Overflow");
			System.exit(1);
		}
	}

	// Method to push an element x to stack2
	void push2(int x) {
		// There is at least one empty space for new element
		
		//for the second push top1 =0 top2=5
		if (top1 < top2 - 1) {
			// decreasing top 2 as we have to push first element of stack 2 at index 4
			top2--;
			arr[top2] = x;
		} else {
			System.out.println("Stack Overflow");
			System.exit(1);
		}
	}

	// Method to pop an element from first stack
	int pop1() {
		if (top1 >= 0) {
			int x = arr[top1];
			top1--;
			return x;
		} else {
			System.out.println("Stack Underflow");
			System.exit(1);
		}
		return 0;
	}

	// Method to pop an element from second stack
	int pop2() {
		if (top2 < size) {
			int x = arr[top2];
			top2++;
			return x;
		} else {
			System.out.println("Stack Underflow");
			System.exit(1);

		}
		return 0;
	}

	// Driver program to test twoStack class
	public static void main(String args[]) {
		C_ThreeInOne ts = new C_ThreeInOne(5);
		ts.push1(5);
		ts.push2(10);
		ts.push2(15);
		ts.push1(11);
		ts.push2(7);
		System.out.println("Popped element from" + " stack1 is " + ts.pop1());
		// this push will only happen if we pop element from stack 1 as we have an array of 5..
		ts.push2(40);
		System.out.println("Popped element from" + " stack2 is " + ts.pop2());
	}
}

