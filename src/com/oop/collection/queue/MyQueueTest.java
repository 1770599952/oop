package com.oop.collection.queue;

public class MyQueueTest {

	public static void main(String[] args) {

		MyQueue queue = new MyQueue();
		int[] array = new int[4];
		for (int i = 0; i < array.length; i++) {
			queue.enqueue(i);
		}
		queue.dequeue();
		queue.enqueue("x");
		queue.getAllElements();
	}

}
