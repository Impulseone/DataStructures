package OrderedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrderedListTest {
    @Test
    public void compareTest() {
        OrderedList<Integer> list = new OrderedList<Integer>(true);
        int result = list.compare(1, 2);
        int assertedResult = -1;
        assertEquals(result, assertedResult);
    }

    @Test
    public void deleteTest() {
        OrderedList<Integer> list = new OrderedList<Integer>(false);
        list.add(1);
        list.add(2);
        list.add(3);
        list.delete(3);
        assertEquals(2, (int) list.getAll().get(0).value);
        assertEquals(1, (int) list.getAll().get(1).value);
        assertEquals(2, list.count());
        assertEquals(2, (int) list.head.value);
        assertEquals(1, (int) list.tail.value);
    }

    @Test
    public void findTest() {
        OrderedList<Integer> list = new OrderedList<Integer>(false);
        list.add(1);
        list.add(2);
        list.add(3);
        Node<Integer> founded = list.find(1);
        Node<Integer> notFounded = list.find(8);
        assertEquals(1, (int) founded.value);
        assertNull(notFounded);
    }
}