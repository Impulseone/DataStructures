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
        OrderedList<Integer> list = new OrderedList<Integer>(false);
        list.add(5);
        list.add(6);
        assertEquals(6, (int) list.head.value);
        assertEquals(5, (int) list.head.next.value);
        assertEquals(2, list.count());
        assertEquals(5, (int) list.tail.value);
    }

    @Test
    public void checkAscendingTest2() {
        OrderedList<Integer> list = new OrderedList<Integer>(true);
        list.add(0);
        list.add(-7);
        list.add(0);
        assertEquals(-7, (int) list.head.value);
        assertEquals(0, (int) list.head.next.value);
        assertEquals(0, (int) list.head.next.next.value);
        assertEquals(3, list.count());
        assertEquals(0, (int) list.tail.value);
    }

    @Test
    public void checkAscendingStringsTest() {
        OrderedList<String> list = new OrderedList<String>(true);
        list.add("b");
        list.add("A");
        assertEquals("A", list.head.value);
        assertEquals("b", list.head.next.value);
        assertEquals(2, list.count());
        assertEquals("b", list.tail.value);
    }

    @Test
    public void checkInvertedAscendingStringsTest() {
        OrderedList<String> list = new OrderedList<String>(true);
        list.add(" zz");
        list.add("ui");
        list.add(" aa");
        assertEquals(" zz", list.getAll().get(2).value);
        assertEquals("ui", list.getAll().get(1).value);
        assertEquals(" aa", list.getAll().get(0).value);
        assertEquals(3, list.count());
        assertEquals(" zz", list.tail.value);
        assertEquals(" aa", list.head.value);
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
