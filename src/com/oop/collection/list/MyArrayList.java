package com.oop.collection.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList<E> implements Iterable<E> {

	private static final int DEFAULT_CAPACITY = 10;
	
	private int size;
	private E[] theItems;
	
	public MyArrayList() {
		doclear();
	}
	
	private void doclear() {
		size = 0;
		ensurrCapacity(DEFAULT_CAPACITY);
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return 0 == size();
	}
	
	public void trimToSize() {
		ensurrCapacity(size());
	}
	
	public E get(int index) {
		if(index < 0 || index >= size()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return theItems[index];
	}
	
	public void add(E e) {
		add(size(),e);
	}

	public void add(int index, E e) {
		if(theItems.length == size()) {
			ensurrCapacity(size() * 2 + 1);
		}
		for(int i = size;i > index;i--) {
			theItems[i] = theItems[i-1];
		}
		theItems[index] = e;
		size++;
	}
	
	public E remove(int index) {
		E removeItem = theItems[index];
		for(int i = index;i < size() -1;i++) {
			theItems[i] = theItems[i+1]; 
		}
		size--;
		return removeItem;
	}

	public E set(int index,E newVal) {
		if(index < 0 || index >= size()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		E old = theItems[index];
		theItems[index] = newVal;
		return old;
	}
	
	@SuppressWarnings("unchecked")
	private void ensurrCapacity(int newCapacity) {
		if(newCapacity < size) {
			return ;
		}
		E[] old = theItems;
		theItems = (E[])new Object[newCapacity];
		for (int i = 0; i < size; i++) {
			theItems[i] = old[i];
		}
	}

	private class ArrayListIterator implements Iterator<E>{

		private int current = 0;
		
		public boolean hasNext() {
			return current < size();
		}

		public E next() {
			if(!hasNext()) {
				throw new NoSuchElementException();
			}
			return theItems[current++];
		}

		public void remove() {
			MyArrayList.this.remove(--current);
		}
	} 
	
	public Iterator<E> iterator() {
		return new ArrayListIterator();
	}

}
