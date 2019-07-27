package com.oop.collection.list;

import java.util.Collection;
import java.util.Iterator;

public class MyCommonIterator implements Iterator {

    private Collection collection;
    private int currentIndex;

    public MyCommonIterator(Collection collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return collection.size() > currentIndex;
    }

    @Override
    public Object next() {
        return collection.toArray()[currentIndex++];
    }

    @Override
    public void remove() {
        collection.remove(--currentIndex);
    }
}
