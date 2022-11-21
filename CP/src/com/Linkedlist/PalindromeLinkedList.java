package com.Linkedlist;

public class PalindromeLinkedList {
	
	
	static LinkedListNode<Integer> i ; 
	
	
	public static boolean palindrome(LinkedListNode<Integer> head)
	{
		i = head;
		return isPalindrome(head);
	}
	
	
	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		
		
		if(head == null) return true;
		
		if(isPalindrome(head.next) == false) return false;
		
		if(head.data != i.data) return false;
		
		i = i.next;
		
		return true;
		
	}
	
	
	

}
