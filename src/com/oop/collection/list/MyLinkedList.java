package com.oop.collection.list;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<E> implements Iterable<E> {

	private int size;		// 链表节点个数
	private int modCount;	// 操作次数
	private Node<E> first;	// 首节点
	private Node<E> last;	// 尾节点
	
	// 初始化
	public MyLinkedList() {
		clear();
	}
	
	// 链表大小
	public int size() {
		return size;
	}
	
	// 是否为空
	public boolean isEmpty() {
		return 0 == size();
	}
	
	// 添加元素
	public boolean add(E e) {
		add(size(),e);
		return true;
	}
	
	public void add(int index,E e) {
		addBefore(getNode(index,0,size()), e);
		return ;
	}
	
	private Node<E> getNode(int index, int lower, int upper) {
		
		Node<E> p;
		
		if(index < lower || index > upper)
			throw new IndexOutOfBoundsException();
		
		if(index < size() / 2){
			p = first.next;
			for (int i = 0; i < index; i++) {
				p = p.next;
			}
		}else{
			p = last;
			for (int i = size(); i > index;i--) {
				p = p.prev;
			}
		}
		return p;
	}

	private void addBefore(Node<E> p,E x) {
		
		Node<E> newNode = new Node<E>(p.prev,x,p);
		
		newNode.prev.next = newNode;
		p.prev = newNode;
		
		size++;
		modCount++;
	}
	
	public void clear() {
		doClear();
		return ;
	}
	
	private void doClear() {
		first = new Node<E>(null,null,null);
		last = new Node<E>(first, null, null);
		size = 0;
		modCount++;
	}
	
	public E get(int index) {
		return getNode(index).item;
	}

	private Node<E> getNode(int index) {
		return getNode(index,0,size()-1);
	}
	
	public E remove(int index) {
		return remove(getNode(index));
	}
	
	public E remove(Node<E> p) {
		p.prev.next = p.next;
		p.next.prev = p.prev;
		
		size--;
		modCount++;
		return p.item;
	}
	
	public E set(int index,E newVal) {
		
		Node<E> node = getNode(index);
		E oldVal = node.item;
		node.item = newVal;
		return oldVal;
	}
	
    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    private class LinkecListIterator implements Iterator<E>{

    	private Node<E> current = first.next;
    	private int expectedModCount = modCount;
    	private boolean okToRemove = false;
    	
		public boolean hasNext() {
			return current != last;
		}
		public E next() {			
			if(modCount != expectedModCount) {
				throw new ConcurrentModificationException();
			}
			if(!hasNext()) {
				throw new NoSuchElementException();
			}
			E nextItem = current.item;
			current = current.next;
			okToRemove = true;
			return nextItem;
		}		
		public void remove() {			
			if(modCount != expectedModCount) {
				throw new ConcurrentModificationException();
			}
			if(!okToRemove) {
				throw new IllegalStateException();
			}
			MyLinkedList.this.remove(current.prev);
			expectedModCount++;
			okToRemove=false;
		}
    	
    }

	public Iterator<E> iterator() {
		return new LinkecListIterator();
	}
	
}