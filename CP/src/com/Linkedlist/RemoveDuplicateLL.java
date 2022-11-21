package com.Linkedlist;

import java.util.LinkedList;

public class RemoveDuplicateLL {


	/*
	 * Function to remove duplicates from an unsorted linked list
	 */
	static LinkedListNode remove_duplicates(LinkedListNode<Integer> head) {

		LinkedListNode nextNode;
		LinkedListNode CurrentNode = head;

		while (CurrentNode.next != null) {

			nextNode = CurrentNode.next;
			if (CurrentNode.data == nextNode.data) {
				CurrentNode.next = nextNode.next;
			} else {
				CurrentNode = CurrentNode.next;
			}
		}

		return head;

	}

	static void printList(LinkedListNode node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
		printList(remove_duplicates(head));
		return head;
	}

	public static void main(String[] args) {
		LinkedListNode head = new LinkedListNode(10);
		head.next = new LinkedListNode(12);
		head.next.next = new LinkedListNode(11);
		head.next.next.next = new LinkedListNode(11);
		head.next.next.next.next = new LinkedListNode(12);
		head.next.next.next.next.next = new LinkedListNode(11);
		head.next.next.next.next.next.next = new LinkedListNode(10);
		removeDuplicates(head);
	}

}