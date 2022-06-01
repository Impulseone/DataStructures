package LinkedList;

import org.junit.Test;

public class CountTest {
    @Test
    public void countInEmptyListTest() {
        LinkedList list = new LinkedList();
        assert list.count() == 0;
    }

    @Test
    public void countInManyElementsListTest() {
        LinkedList list = new LinkedList();
        list.addInTail(new Node(10));
        list.addInTail(new Node(20));
        list.addInTail(new Node(30));
        assert list.count() == 3;
    }

    @Test
    public void countInOneElementListTest() {
        LinkedList list = new LinkedList();
        list.addInTail(new Node(10));
        assert list.count() == 1;
    }
}
