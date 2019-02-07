package com.oop.collection.stack;

public class MyStackTest {

	public static void main(String[] args) {
		MyStack<Integer> stack = new MyStack<Integer>();
		stack.push(1);
		stack.peek();
		System.out.println("栈顶元素:"+stack.pop());
	}
}
