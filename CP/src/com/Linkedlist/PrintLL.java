package com.Linkedlist;

public class PrintLL {

	public static void main(String[] args) {

		Node<Integer> node1 = new Node<Integer>(10);
		Node<Integer> node2 = new Node<Integer>(20); // node 1 next
		Node<Integer> node3 = new Node<Integer>(30); // node 2 next

		node1.next = node2;
		node2.next = node3;

		Node<Integer> head = node1;

		while (head != null) {
			
			System.out.println(head.data + " ");
			head = head.next;
		}

	}

}
