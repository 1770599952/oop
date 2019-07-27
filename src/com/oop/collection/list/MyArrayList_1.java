package com.oop.collection.list;

import java.util.Collection;
import java.util.Iterator;

public class MyArrayList_1 implements Collection {

    private final int DEFAULT_CAPACITY = 10;
    private Object[] items;
    private int size;

    public MyArrayList_1() {
        items = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public MyArrayList_1(int capacity) {
        if (capacity <= 10) {
            items = new Object[DEFAULT_CAPACITY];
        }
        size = 0;
        items = new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        Object obj = getItem(o);
        return obj != null ? true : false;
    }

    private Object getItem(Object o) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(o)) {
                return items[i];
            }
        }
        return null;
    }

    @Override
    public Iterator iterator() {
        return new MyArrayListIterator();
    }

    private class MyArrayListIterator implements Iterator {

        private int current = 0;

        @Override
        public boolean hasNext() {
            return current < size();
        }

        @Override
        public Object next() {
            return items[current++];
        }
    }

    @Override
    public Object[] toArray() {
        return items;
    }

    @Override
    public boolean add(Object o) {
        ensureCapacity();
        items[size++] = o;
        return false;
    }

    private void ensureCapacity() {
        if (size >= items.length) {
            Object[] newItems = new Object[items.length * 2];
            Object[] old = items;
            for (int i = 0; i < size; i++) {
                newItems[i] = old[i];
            }
            items = newItems;
        }
    }

    @Override
    public boolean remove(Object o) {
        int removeIndex = 0;
        boolean success = false;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(o)) {
                removeIndex = i;
                success = true;
                break;
            }
        }

        for (int i = removeIndex; i < size; i++) {
            items[i] = items[i + 1];
        }
        return success;
    }

    @Override
    public boolean addAll(Collection c) {
        Object[] addItems = c.toArray();
        for (int i = 0; i < addItems.length; i++) {
            this.add(addItems[i]);
        }
        return true;
    }

    @Override
    public void clear() {
        size = 0;
        items = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        Object[] addItems = c.toArray();
        for (int i = 0; i < addItems.length; i++) {
            this.remove(addItems[i]);
        }
        return true;
    }

    @Override
    public boolean containsAll(Collection c) {
        Object[] addItems = c.toArray();
        boolean result = true;
        for (int i = 0; i < addItems.length; i++) {
            Object obj = this.getItem(addItems[i]);
            if (obj == null) {
                result = false;
                return result;
            }
        }
        return result;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
