package LinkedList;

import org.junit.Test;

public class RemoveAllTest {
    @Test
    public void removeAllInEmptyListTest() {
        LinkedList list = new LinkedList();
        list.removeAll(20);
        assert list.count() == 0;
        assert list.head == null;
        assert list.tail == null;
    }

    @Test
    public void removeAllInManyElementsListTest() {
        LinkedList list = new LinkedList();
        list.addInTail(new Node(20));
        list.addInTail(new Node(20));
        list.addInTail(new Node(10));
        list.removeAll(20);
        assert list.count() == 1;
        assert list.head.value == 10;
        assert list.tail.value == 10;
    }

    @Test
    public void removeAllInManyElementsListInMiddleTest() {
        LinkedList list = new LinkedList();
        list.addInTail(new Node(20));
        list.addInTail(new Node(20));
        list.addInTail(new Node(10));
        list.addInTail(new Node(20));
        list.removeAll(20);
        assert list.count() == 1;
        assert list.head.value == 10;
        assert list.tail.value == 10;
        assert list.tail.next == null;
    }

    @Test
    public void removeAllInOneElementListTest() {
        LinkedList list = new LinkedList();
        list.addInTail(new Node(20));
        list.removeAll(20);
        assert list.count() == 0;
        assert list.head == null;
        assert list.tail == null;
    }
}
