package com.Linkedlist;

import java.util.Scanner;

public class DeletionNode {

	public static LinkedListNode<Integer> takeInput() {
		LinkedListNode<Integer> head = null, tail = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();

		while (data != -1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
//				Node<Integer> temp = head;
//				while(temp.next != null){
//					temp = temp.next;
//				}
//				temp.next = newNode;
				tail.next = newNode;
				tail = newNode; // tail = tail.next
			}
			data = s.nextInt();
		}
		return head;
	}

	public static void print(LinkedListNode<Integer> head) {

		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();

	}

	public static LinkedListNode<Integer> delete(LinkedListNode<Integer> head, int pos) {
		// If linked list is empty
        if (head == null)
            return head;
 
        // Store head node
        LinkedListNode temp = head;
 
        // If head needs to be removed
        if (pos == 0) {
            head = temp.next; // Change head
            return head;
        }
 
        // Find previous node of the node to be deleted
        for (int i = 0; temp != null && i < pos - 1;
             i++)
            temp = temp.next;
 
        // If position is more than number of nodes
        if (temp == null || temp.next == null)
            return head;
 
        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        LinkedListNode next = temp.next.next;
 
        temp.next
            = next; // Unlink the deleted node from list
		return head;
	}

	public static void main(String[] args) {

		LinkedListNode<Integer> head = takeInput();
		head = delete(head, 0);
		print(head);

//		Node<Integer> node1 = new Node<Integer>(10);
//		Node<Integer> node2 = new Node<Integer>(20);
//		Node<Integer> node3 = new Node<Integer>(30);
//		node1.next = node2;
//		node2.next = node3;
//		Node<Integer> head = node1;
//		print(head);
//		print(head);

	}

}
