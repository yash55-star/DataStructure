package com.priorityQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test1 {
	
	public static void main(String[] args) {
		
		
		
		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(4);
		priorityQueue.add(1);
		priorityQueue.add(15);
		
		System.out.println(priorityQueue.peek());
		priorityQueue.poll();
		
		priorityQueue.offer(2);
		
		System.out.println(priorityQueue);
		
		
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(4);
		queue.add(1);
		queue.add(15);
		queue.offer(2);
		System.out.println(queue);
		
	}

}
