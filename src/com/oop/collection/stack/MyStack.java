package com.oop.collection.stack;

public class MyStack<E> {

	/*
	 * 栈的最大深度
	 * */
	private int MAX_DEPTH = 10;
	
	/*
	 * 栈的当前深度
	 * */
	private int depth = 0;
	
	/*
	 * 底层空间
	 * */
	private E[] stack = (E[]) new Object[MAX_DEPTH];
	
    /**
     * push，向栈中添加一个元素
     *
     * @param n 待添加的整数
     */
    public void push(E e) {
        if (depth == MAX_DEPTH - 1) {
            throw new RuntimeException("栈已满，无法再添加元素。");
        }
        stack[depth++] = e;
    }
    

    /**
     * pop，返回栈顶元素并从栈中删除
     *
     * @return 栈顶元素
     */
    protected E pop() {
        if (depth == 0) {
            throw new RuntimeException("栈中元素已经被取完，无法再取。");
        }

        // --depth，dept先减去1再赋值给变量dept，这样整个栈的深度就减1了（相当于从栈中删除）。
        return stack[--depth];
    }

    /**
     * peek，返回栈顶元素但不从栈中删除
     *
     * @return
     */
    protected E peek() {
        if (depth == 0) {
            throw new RuntimeException("栈中元素已经被取完，无法再取。");
        }
        return stack[depth - 1];
    }
}
