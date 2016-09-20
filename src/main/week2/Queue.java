package main.week2;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Created by sulang on 16-9-14.
 */
public class Queue implements IQueue<String>,Iterable<String> {

    @Override
    public boolean enQueue(String s) {
        return false;
    }

    @Override
    public String deQueue() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Iterator<String> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super String> action) {

    }
}
