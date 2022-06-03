package LinkedList2;

import org.junit.Test;

public class FindTest {
    @Test
    public void findInEmptyListTest() {
        LinkedList2 list = new LinkedList2();
        Node node = list.find(10);
        assert node == null;
    }

    @Test
    public void findInManyElementsListTest() {
        LinkedList2 list = new LinkedList2();
        list.addInTail(new Node(10));
        list.addInTail(new Node(20));
        list.addInTail(new Node(30));
        Node node = list.find(10);
        assert node.value == 10;
    }

    @Test
    public void findInOneElementListTest() {
        LinkedList2 list = new LinkedList2();
        list.addInTail(new Node(10));
        Node node = list.find(10);
        assert node.value == 10;
    }
}
