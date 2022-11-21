package com.Linkedlist;

public class reverseLinkedListProg {

	static void printList(LinkedListNode node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
	public static void printReverse(LinkedListNode<Integer> root) {
		
		LinkedListNode<Integer> head1 = reverse(null, root);
		printList(head1);
	}
	
	public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> previous ,LinkedListNode<Integer> current)
	{
		if(current ==null)
		{
			return previous;
		}
		LinkedListNode<Integer> next = current.next;
		current.next = previous;
		return reverse(current, next);
		
	}
	
	public static void main(String[] args) {
		LinkedListNode head = new LinkedListNode(10);
		head.next = new LinkedListNode(12);
		head.next.next = new LinkedListNode(11);
		
		printReverse(head);
		
	}
}
