package LinkedList2;

import org.junit.Test;

public class AddInTailTest {
    @Test
    public void addInTailInEmptyListTest() {
        LinkedList2 list = new LinkedList2();
        list.addInTail(new Node(10));
        assert list.head.value == 10;
        assert list.tail.value == 10;
    }

    @Test
    public void addInTailInManyElementsListTest() {
        LinkedList2 list = new LinkedList2();
        list.addInTail(new Node(10));
        list.addInTail(new Node(20));
        list.addInTail(new Node(30));
        assert list.head.value == 10;
        assert list.tail.value == 30;
    }

    @Test
    public void addInTailInOneElementListTest() {
        LinkedList2 list = new LinkedList2();
        list.addInTail(new Node(10));
        list.addInTail(new Node(20));
        assert list.head.value == 10;
        assert list.tail.value == 20;
    }

}