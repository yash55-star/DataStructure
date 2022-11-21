package com.Linkedlist;

public class AppendLastNToFirst {

 
    // Function to print the linked list
    static void printList(LinkedListNode node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
 
    // Recursive function to return the
    // count of nodes in the linked list
    static int cntNodes(LinkedListNode node)
    {
    	LinkedListNode<Integer> temp = node;
		int i = 0;
		while (temp!=null && temp.data != -1) {
			temp = temp.next;
			i++;
			
			
		}
		return i;
    }
 
    // Function to update and print
    // the updated list nodes
    static LinkedListNode<Integer> updateList(LinkedListNode head, int m)
    {
 
        // Total nodes in the list
        int cnt = cntNodes(head);
 
        if (cnt != m && m>0 && m < cnt ) {
 
            // Count of nodes to be skipped
            // from the beginning
            int skip = cnt - m;
            LinkedListNode prev = null;
            LinkedListNode curr = head;
 
            // Skip the nodes
            while (skip > 0) {
                prev = curr;
                curr = curr.next;
                skip--;
            }
 
            // Change the pointers
            prev.next = null;
            LinkedListNode tempHead = head;
            head = curr;
 
            // Find the last node
            while (curr.next != null)
                curr = curr.next;
 
            // Connect it to the head
            // of the sub list
            curr.next = tempHead;
        }
 
        // Print the updated list
        printList(head);
        return head;
    }
 
    
    public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
    	return updateList(head, n);
	}
    
    // Driver code
    public static void main(String[] args)
    {
 
        // Create the list
    	LinkedListNode head = new LinkedListNode(4);
        head.next = new LinkedListNode(5);
        head.next.next = new LinkedListNode(6);
        head.next.next.next = new LinkedListNode(1);
        head.next.next.next.next = new LinkedListNode(2);
        head.next.next.next.next.next = new LinkedListNode(3);
        head.next.next.next.next.next.next = head;
        int m = 9;
 
        appendLastNToFirst(head, m);
    }
    
    
    

}
