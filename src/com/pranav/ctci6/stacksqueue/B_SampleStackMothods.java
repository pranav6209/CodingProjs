package com.pranav.ctci6.stacksqueue;

public class B_SampleStackMothods {

	private static class Node {

		private int data; // pointer or variable that represent data
		private Node next; // pointer to next node

		// constructor
		private Node(int data) {
			this.data = data;
		}

	}

	//pointer
	private Node top; // add and Remove from the top

	// if top is null return true..
	public boolean isEmpty() {

		return top == null;

	}

	// return top data
	public int peek() {

		return top.data;

	}

	// add at top..
	public void push(int data) {

		Node node = new Node(data); // create a new Node.

		node.next = top; // new node will become top node. next will become old
							// top..

		top = node; // top will be new node.

	}

	// remove from head..
	public int pop() {

		int data = top.data; // get top data

		top = top.next; // move the top that will also remove top from stack.

		return data;
	}
}
