package com.pranav.ctci6.linkedlist;

//Java program to remove duplicates
//from unsorted linkedlist

import java.util.HashSet;

public class A_RemoveDuplicates 
{
	static class node {
		int data;
		node next;

		public node(int val) {
			this.data = val;
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
			if (hs.contains(n.data)) {
				// update the pointer
				prev.next = n.next;
			} else {
				hs.add(n.data);

				prev = n;
			}
			// moving to next
			n = n.next;
		}

	}

	/* Function to print nodes in a given linked list */
	private static void printList(node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		/*
		 * The constructed linked list is: 10->12->11->11->12->11->10
		 */
		node n = new node(10);
		n.next = new node(12);
		n.next.next = new node(11);
		n.next.next.next = new node(11);
		n.next.next.next.next = new node(12);
		n.next.next.next.next.next = new node(11);
		n.next.next.next.next.next.next = new node(10);

		System.out.println("Linked list before removing duplicates :");
		printList(n);

		removeDuplicate(n);

		System.out.println("\nLinked list after removing duplicates :");
		printList(n);
	}
}