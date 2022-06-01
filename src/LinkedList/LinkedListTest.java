package LinkedList;

import org.junit.Test;


// InEmptyListTest
// InManyElementsListTest
// InOneElementListTest


public class LinkedListTest {

    @Test
    public void fun() {
        LinkedList list1 = new LinkedList();
        list1.addInTail(new Node(10));
        list1.addInTail(new Node(20));

        LinkedList list2 = new LinkedList();
        list2.addInTail(new Node(30));
        list2.addInTail(new Node(40));

        LinkedList list3 = new LinkedList();
        if (list1.count() == list2.count()) {
            Node node1 = list1.head;
            Node node2 = list2.head;
            for (int i = 0; i < list1.count(); i++) {
                if (node1 != null) {
                    int sum = node1.value + node2.value;
                    list3.addInTail(new Node(sum));
                    node1 = node1.next;
                    node2 = node2.next;
                }
            }
        }

        assert list3.count() == 2;
        assert list3.head.value == 40;
        assert list3.tail.value == 60;

    }
}