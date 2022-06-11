package Deque;

import org.junit.Test;

import static org.junit.Assert.*;

public class DequeTest {

    @Test
    public void palindrom() {
        String s = "lol";
        Deque<Character> deque = new Deque<Character>();
        char[] chars = s.toCharArray();
        char[] chars2 = new char[chars.length];
        for (int i = chars.length - 1; i >= 0; i--) {
            deque.addFront(chars[i]);
        }
        int dequeSize = deque.size();
        for (int i = 0; i < dequeSize; i++) {
            chars2[i] = deque.removeTail();
        }

        assertArrayEquals(chars, chars2);

    }
}