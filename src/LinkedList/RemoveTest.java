package LinkedList;

import org.junit.Test;

public class RemoveTest {
    @Test
    public void removeInEmptyListTest() {
        LinkedList list = new LinkedList();
        list.remove(20);
        assert list.count() == 0;
        assert list.head == null;
        assert list.tail == null;
    }

    @Test
    public void removeInManyElementsListTest() {
        LinkedList list = new LinkedList();
        list.addInTail(new Node(10));
        list.addInTail(new Node(20));
        list.addInTail(new Node(30));
        list.remove(20);
        assert list.count() == 2;
        assert list.head.value == 10;
        assert list.tail.value == 30;
    }

    @Test
    public void removeInManyElementsListLastElementTest() {
        LinkedList list = new LinkedList();
        list.addInTail(new Node(10));
        list.addInTail(new Node(20));
        list.addInTail(new Node(30));
        list.remove(30);
        assert list.count() == 2;
        assert list.head.value == 10;
        assert list.tail.value == 20;
    }

    @Test
    public void removeInManyElementsListFirstElementTest() {
        LinkedList list = new LinkedList();
        list.addInTail(new Node(10));
        list.addInTail(new Node(20));
        list.addInTail(new Node(30));
        list.remove(10);
        assert list.count() == 2;
        assert list.head.value == 20;
        assert list.tail.value == 30;
    }

    @Test
    public void removeInOneElementListTest() {
        LinkedList list = new LinkedList();
        list.addInTail(new Node(10));
        list.remove(10);
        assert list.count() == 0;
        assert list.head == null;
        assert list.tail == null;
    }
}
