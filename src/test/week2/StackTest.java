package test.week2;

import main.week2.IStack;
import main.week2.Stack;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by sulang on 16-9-11.
 */
public class StackTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void push() throws Exception {
        IStack<String> stack = new Stack<>();

        assertTrue(stack.push("1"));
        assertTrue(stack.push("2"));
        assertTrue(stack.push("3"));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void pushOverflow() throws Exception {
        IStack<String> stack = new Stack<>(1);
        stack.push("1");
        stack.push("2");
    }

    @Test
    public void pop() throws Exception {
        IStack<String> stack = new Stack<>();

        assertTrue(stack.push("1"));
        assertTrue(stack.push("2"));
        assertTrue(stack.push("3"));

        assertEquals("3", stack.pop());
        assertEquals("2", stack.pop());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void popUnderflow() throws Exception {
        IStack<String> stack = new Stack<>();
        stack.pop();
    }

    @Test
    public void isEmpty() throws Exception {
        IStack<String> stack = new Stack<>();
        assertTrue(stack.isEmpty());

        stack.push("1123");
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void size() throws Exception {
        IStack<String> stack = new Stack<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");

        assertEquals(stack.size(), 4);

        stack.pop();
        assertEquals(stack.size(), 3);

        stack.pop();
        stack.pop();
        stack.pop();
        assertEquals(stack.size(), 0);
    }

    @Test
    public void fixSize() throws Exception {
        IStack<String> stack = new Stack<>();
        for (int index = 0; index < 16; index++) {
            stack.push(String.valueOf(index));
        }
        assertTrue(stack.size() == 16);

        stack.ensureCapacity();
        for (int index = 0; index < 16; index++) {
            stack.push(String.valueOf(index));
        }
        assertTrue(stack.size() == 32);
    }

    @Test
    public void fixSolidSize() throws Exception {
        IStack<String> stack = new Stack<>(2);
        stack.ensureCapacity(1);
        for (int index = 0; index < 3; index++) {
            stack.push(String.valueOf(index));
        }
        assertTrue(stack.size() == 3);

        stack = new Stack<>(2);
        stack.ensureCapacity(16);
        for (int index = 0; index < 16; index++) {
            stack.push(String.valueOf(index));
        }
        assertTrue(stack.size() == 16);
    }

    @Test
    public void testIterator() throws Exception {
        IStack<String> stack = new Stack<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");

        Iterator<String> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}