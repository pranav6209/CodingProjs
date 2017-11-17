package com.pranav.ctci6.linkedlist;

//Java program to remove duplicates
//from unsorted linkedlist

import java.util.HashSet;

public class removeDuplicates1 
{
	static class node {
		int val;
		node next;

		public node(int val) {
			this.val = val;
		}
	}

	/*
	 * Function to remove duplicates from a unsorted linked list
	 */
	private static void removeDuplicate(node n) {
		// Hash to store seen values
		HashSet<Integer> hs = new HashSet<>();

		/* Pick elements one by one */

		node prev = null;
		while (n != null) {
			// If current value is seen before
			if (hs.contains(n.val)) {
				// update the pointer
				prev.next = n.next;
			} else {
				hs.add(n.val);

				prev = n;
			}
			// moving to next
			n = n.next;
		}

	}

	/* Function to print nodes in a given linked list */
	private static void printList(node head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		/*
		 * The constructed linked list is: 10->12->11->11->12->11->10
		 */
		node start = new node(10);
		start.next = new node(12);
		start.next.next = new node(11);
		start.next.next.next = new node(11);
		start.next.next.next.next = new node(12);
		start.next.next.next.next.next = new node(11);
		start.next.next.next.next.next.next = new node(10);

		System.out.println("Linked list before removing duplicates :");
		printList(start);

		removeDuplicate(start);

		System.out.println("\nLinked list after removing duplicates :");
		printList(start);
	}
}