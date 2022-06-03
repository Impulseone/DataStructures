package LinkedList2;

import org.junit.Test;

public class InsertAfterTest {
    @Test
    public void insertAfterInEmptyListWithNullFirstTest() {
        LinkedList2 list = new LinkedList2();
        list.insertAfter(null, new Node(10));
        assert list.count() == 1;
        assert list.head.value == 10;
        assert list.tail.value == 10;
    }

    @Test
    public void insertAfterFirstInManyElementsListTest() {
        LinkedList2 list = new LinkedList2();
        Node first = new Node(10);
        list.addInTail(first);
        list.addInTail(new Node(20));
        list.addInTail(new Node(30));
        list.insertAfter(first, new Node(40));
        assert list.count() == 4;
        assert list.head.value == 10;
        assert list.head.next.value == 40;
        assert list.head.next.next.value == 20;
        assert list.head.next.prev.value == 10;
        assert list.tail.value == 30;
    }

    @Test
    public void insertBeforeLastInManyElementsListTest() {
        LinkedList2 list = new LinkedList2();
        list.addInTail(new Node(20));
        Node beforeLast = new Node(30);
        list.addInTail(beforeLast);
        list.addInTail(new Node(40));
        list.insertAfter(beforeLast, new Node(50));
        assert list.count() == 4;
        assert list.head.value == 20;
        assert list.head.next.value == 30;
        assert list.head.next.next.value == 50;
        assert list.head.next.next.prev.value == 30;
        assert list.tail.value == 40;
    }

    @Test
    public void insertInEndInOneElementListTest() {
        LinkedList2 list = new LinkedList2();
        Node first = new Node(10);
        list.addInTail(first);
        list.insertAfter(first, new Node(40));
        assert list.count() == 2;
        assert list.head.value == 10;
        assert list.tail.value == 40;
        assert list.tail.prev.value == 10;
    }

    @Test
    public void insertInStartInOneElementListTest() {
        LinkedList2 list = new LinkedList2();
        Node first = new Node(10);
        list.addInTail(first);
        list.insertAfter(null, new Node(40));
        assert list.count() == 2;
        assert list.head.value == 40;
        assert list.tail.value == 10;
        assert list.tail.prev.value == 40;
    }
}
