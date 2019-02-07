package com.oop.collection.queue;

import java.util.Arrays;

public class MyQueue {

	// Define capacity constant: CAPACITY
	private static final int CAPACITY = 5;
	// Define capacity of queue
	private static int capacity;
	// Front of queue
	private static int front;
	// Tail of queue
	private static int tail;
	// Array for queue
	private static Object[] array;

	// Constructor of Queue class
	public MyQueue() {
		this.capacity = CAPACITY;
		array = new Object[capacity];
		front = tail = 0;
	}

	// Get size of queue
	public static int getSize() {
		if (isEmpty()) {
			return 0;
		}
		return (capacity + tail - front) % capacity;
	}

	// Whether is empty
	private static boolean isEmpty() {
		return (front == tail);
	}

	// put element into the end of queue
	public static void enqueue(Object element) throws RuntimeException {
		if (getSize() == capacity - 1)
			throw new RuntimeException("Queue is full");
		array[tail] = element;
		tail = (tail + 1) % capacity;
	}

	// get element from queue
	public static Object dequeue() throws RuntimeException {
		Object element;
		if (isEmpty())
			throw new RuntimeException("Queue is empty");
		element = array[front];
		front = (front + 1) % capacity;
		return element;
	}

	// Get the first element for queue
	public static Object frontElement() throws RuntimeException {
		if (isEmpty())
			throw new RuntimeException("Queue is empty");
		return array[front];
	}

	// Travel all elements of queue
	public static void getAllElements() {
		Object[] arrayList = new Object[getSize()];

		for (int i = front, j = 0; j < getSize(); i++, j++) {
			arrayList[j] = array[i];
		}
		System.out.println("All elements of queue: " + Arrays.toString(arrayList));
	}

}
