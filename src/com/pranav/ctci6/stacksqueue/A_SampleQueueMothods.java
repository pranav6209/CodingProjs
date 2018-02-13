package com.pranav.ctci6.stacksqueue;

public class A_SampleQueueMothods {

	private static class Node {

		private int data; // pointer or variable that represent data
		private Node next; // pointer to next node

		// constructor
		private Node(int data) {
			this.data = data;
		}

	}

	// both are pointer..
	private Node head; // remove from the head ...
	private Node tail; // add to tail...

	// if head is null return true..
	public boolean isEmpty() {

		return head == null;

	}

	// return head data
	public int peek() {

		return head.data;

	}

	// add at tail...
	public void add(int data) {

		Node node = new Node(data); // create a new Node.

		// if tail is not null, put tail next point to this new node...
		if (tail != null) {

			tail.next = node;

		}

		tail = node;// update the tail..

		// if queue is empty new node will be head..
		if (head == null) {

			head = node;

		}

	}

	// remove from head..
	public int remove() {

		int data = head.data; // get head data

		head = head.next; // move the head that will also remove head from  Queue.

		if (head == null) {

			tail = null;
		}

		return data;
	}
}
