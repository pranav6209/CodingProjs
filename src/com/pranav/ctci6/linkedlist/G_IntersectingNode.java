package com.pranav.ctci6.linkedlist;

//Java program to get intersection point of two linked list

/*
 * 
 * https://www.youtube.com/watch?v=_7byKXAhxyM
 * 
 * http://www.geeksforgeeks.org/write-a-function-to-get-the-intersection-point-of-two-linked-lists/
 * 
 * 
 * 1) Get count of the nodes in first list, let count be c1.
	2) Get count of the nodes in second list, let count be c2.
	3) Get the absolute difference of counts d = abs(c1 – c2)
	4) Now traverse the bigger list from the first node till d nodes so that from here onwards both the lists have equal no of nodes.
	5) Then we can traverse both the lists in parallel till we come across a common node. 
		(Note that getting a common node is done by comparing the address of the nodes)
 * 
 * 
 */

class G_IntersectingNode {

	static Node head1, head2;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	/*
	 * function to get the node count for both the singly linked list
	 */
	int getNode() {
		int c1 = getCount(head1);
		int c2 = getCount(head2);
		int d;

		if (c1 > c2) {
			d = c1 - c2;
			return getIntesectionNode(d, head1, head2);
		} else {
			d = c2 - c1;
			return getIntesectionNode(d, head2, head1);
		}
	}

	/*
	 * function to get the intersection point of two linked lists head1 and
	 * head2 where head1 has d more nodes than head2
	 */
	int getIntesectionNode(int d, Node head1, Node head2) {
		int i;
		Node p = head1;
		Node q = head2;
		
		for (i = 0; i < d; i++) {
			if (p == null) {
				return -1;
			}
			p = p.next;
		}
		while (p != null && q != null) {
			if (p.data == q.data) {
				return p.data;
			}
			p = p.next;
			q = q.next;
		}

		return -1;
	}

	/*
	 * Takes head pointer of the linked list and returns the count of nodes in
	 * the list
	 */
	int getCount(Node node) {
		Node current = node;
		int count = 0;

		while (current != null) {
			count++;
			current = current.next;
		}

		return count;
	}

	public static void main(String[] args) {
		G_IntersectingNode list = new G_IntersectingNode();

		// creating first linked list
		list.head1 = new Node(3);
		list.head1.next = new Node(6);
		list.head1.next.next = new Node(15);
		list.head1.next.next.next = new Node(15);
		list.head1.next.next.next.next = new Node(30);

		// creating second linked list
		list.head2 = new Node(10);
		list.head2.next = new Node(15);
		list.head2.next.next = new Node(30);

		System.out.println("The node of intersection is " + list.getNode());

	}
}
