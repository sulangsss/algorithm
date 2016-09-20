package main.week2;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by sulang on 16-9-11.
 */
public class Stack<T> implements IStack<T> {
    private Object[] mArrays;
    private int mPos;
    private static final int DEFAULT_CAPACITY = 16;

    public Stack(int size) {
        if (size > 0) {
            this.mArrays = new Object[size];
        } else if (size == 0) {

        } else {
            throw new IllegalArgumentException("size must be >= 0");
        }
    }

    public Stack() {
        this.mArrays = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public void ensureCapacity(int mini) {
        int capacity = Math.max(mini, mArrays.length * 2);
        fixCapacity(capacity * 2);
    }

    @Override
    public void ensureCapacity() {
        int capacity = Math.max(mArrays.length, DEFAULT_CAPACITY);
        fixCapacity(capacity * 2);
    }

    private void fixCapacity(int newSize) {
        mArrays = Arrays.copyOf(mArrays, newSize);
    }

    @Override
    public boolean push(T t) {
        if (t == null) {
            throw new IllegalArgumentException();
        }

        if (mPos >= mArrays.length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        mArrays[mPos++] = t;

        return true;
    }

    @Override
    public T pop() {
        return getData(--mPos);
    }

    @SuppressWarnings("unchecked")
    private T getData(int position) {
        if (mPos < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }

        return (T) mArrays[position];
    }

    @Override
    public boolean isEmpty() {
        return mPos == 0;
    }

    @Override
    public int size() {
        return mPos;
    }

    @Override
    public Iterator<T> iterator() {
        return new StackIterator<>();
    }

    public class StackIterator<E> implements Iterator<E> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < mPos;
        }

        @Override
        @SuppressWarnings("unchecked")
        public E next() {
            return (E) mArrays[index++];
        }
    }
}
