package LinkedList;

import LinkedList.LinkedList;
import org.junit.Test;

public class AddInTailTest {
    @Test
    public void addInTailInEmptyListTest() {
        LinkedList list = new LinkedList();
        list.addInTail(new Node(10));
        assert list.head.value == 10;
        assert list.tail.value == 10;
    }

    @Test
    public void addInTailInManyElementsListTest() {
        LinkedList list = new LinkedList();
        list.addInTail(new Node(10));
        list.addInTail(new Node(20));
        list.addInTail(new Node(30));
        assert list.head.value == 10;
        assert list.tail.value == 30;
    }

    @Test
    public void addInTailInOneElementListTest() {
        LinkedList list = new LinkedList();
        list.addInTail(new Node(10));
        list.addInTail(new Node(20));
        assert list.head.value == 10;
        assert list.tail.value == 20;
    }
}
