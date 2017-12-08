package com.pranav.ctci6.linkedlist;

/*
 *	Explanation of Logic... 
 *  https://www.youtube.com/watch?time_continue=25&v=Cay6RsoIG78
 *  
 *  Copied code 
 *  
 *  http://algorithms.tutorialhorizon.com/delete-a-node-in-the-middle-of-a-linked-list-given-only-access-to-that-node/
 *  */
public class C_DeleteMiddleNode {

	public void deleteMiddle(Node mid) {
		if (mid.next == null) {
			return;

			// we can't delete the node if it is the last node in the linked
			// list
		}

		// Store mid.next in to temp variable.
		Node temp = mid.next;

		// copy temp data to middle node data
		mid.data = temp.data;

		// update the middle node pointer.

		// here we don't have to delete temp node. Updating the pointer will
		// take care of it.
		mid.next = temp.next;

	}

	public void display(Node head) {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " , ");
			n = n.next;
		}
	}

	public static void main(String args[]) {
		Node n = new Node(1);
		n.next = new Node(2);
		n.next.next = new Node(8);
		n.next.next.next = new Node(3);
		Node mid = new Node(7);
		n.next.next.next.next = mid;
		n.next.next.next.next.next = new Node(0);
		n.next.next.next.next.next.next = new Node(4);
		System.out.print("Original List : ");
		C_DeleteMiddleNode rm = new C_DeleteMiddleNode();
		rm.display(n);
		System.out.print("\n Aftter Deleting the mid node : ");
		rm.deleteMiddle(mid);
		rm.display(n);
	}
}
class Node{
	int data;
	Node next;
	public Node(int data){
		this.data = data;
		next = null;
	}
}
