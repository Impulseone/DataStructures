package Stack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    Stack<Integer> stack;

    @Before
    public void initializeStack() {
        stack = new Stack<Integer>();
    }

    @Test
    public void size() {
        stack.push(2);
        stack.push(3);
        assertEquals(2, stack.size());
    }

    @Test
    public void pop() {
        stack.push(2);
        stack.push(3);
        int popElement = stack.pop();
        assertEquals(3, popElement);
        assertEquals(1, stack.size());
    }

    @Test
    public void push() {
        stack.push(2);
        stack.push(3);
        int popElement1 = stack.pop();
        int popElement2 = stack.pop();
        Integer popElement3 = stack.pop();
        assertEquals(3, popElement1);
        assertEquals(2, popElement2);
        assertNull(popElement3);
    }

    @Test
    public void peek() {
        stack.push(2);
        stack.push(3);
        int element = stack.peek();
        assertEquals(3, element);
        assertEquals(2, stack.size());
    }
}