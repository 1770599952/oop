package com.oop.collection.list;

import java.util.Iterator;

public class LinkedListTest {

	public static void main(String[] args) {
		
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			Integer item = iterator.next();
			iterator.remove();
			System.out.print(item+" ");
		}
		
//		System.out.println("index = 1 的节点为:"+list.get(0));
	}
}
