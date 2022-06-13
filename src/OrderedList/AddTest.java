package OrderedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddTest {
    @Test
    public void addOneElementTest() {
        OrderedList<Integer> list = new OrderedList<Integer>(true);
        list.add(5);
        assertEquals(5, (int) list.getAll().get(0).value);
        assertEquals(1, list.count());
        assertEquals(5, (int) list.head.value);
        assertEquals(5, (int) list.tail.value);
    }

    @Test
    public void checkAscendingTest() {
        OrderedList<Integer> list = new OrderedList<Integer>(true);
        list.add(5);
        list.add(3);
        list.add(7);
        assertEquals(3, (int) list.getAll().get(0).value);
        assertEquals(5, (int) list.getAll().get(1).value);
        assertEquals(7, (int) list.getAll().get(2).value);
        assertEquals(3, list.count());
        assertEquals(3, (int) list.head.value);
        assertEquals(7, (int) list.tail.value);
    }

    @Test
    public void checkInvertedAscendingTest() {
        OrderedList<Integer> list = new OrderedList<Integer>(false);
        list.add(5);
        list.add(3);
        list.add(7);
        assertEquals(7, (int) list.getAll().get(0).value);
        assertEquals(5, (int) list.getAll().get(1).value);
        assertEquals(3, (int) list.getAll().get(2).value);
        assertEquals(3, list.count());
        assertEquals(7, (int) list.head.value);
        assertEquals(3, (int) list.tail.value);
    }
}
