package main.week2;

/**
 * Created by sulang on 16-9-11.
 */
public interface IStack<T> extends Iterable<T> {
    boolean push(T t);

    T pop();

    boolean isEmpty();

    int size();

    void ensureCapacity(int mini);

    void ensureCapacity();
}
