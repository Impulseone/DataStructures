package Lesson1;

import org.junit.Test;

import java.util.ArrayList;

public class LinkedListTest {
    @Test
    public void addInTailTest() {
        LinkedList list = new LinkedList();
        list.addInTail(new Node(10));
        list.addInTail(new Node(20));
        list.addInTail(new Node(30));
        list.addInTail(new Node(40));
        Node resultNode = list.find(10);
        assert resultNode.value == 10;
        assert list.head.value == 10;
        assert list.tail.value == 40;
    }

    @Test
    public void countTest1() {
        LinkedList list = new LinkedList();
        list.addInTail(new Node(10));
        list.addInTail(new Node(20));
        list.addInTail(new Node(30));
        list.addInTail(new Node(40));
        assert list.count() == 4;
    }

    @Test
    public void countTest2() {
        LinkedList list = new LinkedList();
        assert list.count() == 0;
    }

    @Test
    public void countTest3() {
        LinkedList list = new LinkedList();
        list.addInTail(new Node(10));
        assert list.count() == 1;
    }

    @Test
    public void clearTest1() {
        LinkedList list = new LinkedList();
        list.addInTail(new Node(10));
        list.addInTail(new Node(20));
        list.addInTail(new Node(30));
        list.clear();
        assert list.count() == 0;
    }

    @Test
    public void clearTest2() {
        LinkedList list = new LinkedList();
        list.clear();
        assert list.count() == 0;
    }

    @Test
    public void removeTest1() {
        LinkedList list = new LinkedList();
        list.addInTail(new Node(10));
        list.addInTail(new Node(20));
        list.addInTail(new Node(20));
        list.remove(20);
        assert list.count() == 2;
        assert list.head.value == 10;
        assert list.tail.value == 20;
    }

    @Test
    public void removeTest2() {
        LinkedList list = new LinkedList();
        list.addInTail(new Node(10));
        list.addInTail(new Node(20));
        list.addInTail(new Node(30));
        list.remove(50);
        assert list.count() == 3;
    }

    @Test
    public void removeTest3() {
        LinkedList list = new LinkedList();
        list.addInTail(new Node(10));
        list.addInTail(new Node(20));
        list.remove(10);
        assert list.count() == 1;
        assert list.head.value == 20;
        assert list.tail.value == 20;
    }

    @Test
    public void removeAllTest() {
        LinkedList list = new LinkedList();
        list.addInTail(new Node(10));
        list.addInTail(new Node(20));
        list.addInTail(new Node(20));
        list.removeAll(20);
        assert list.count() == 1;
        assert list.head.value == 10;
        assert list.tail.value == 10;
    }

    @Test
    public void removeAllTest2() {
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
    public void findAllTest1() {
        LinkedList list = new LinkedList();
        list.addInTail(new Node(20));
        list.addInTail(new Node(20));
        list.addInTail(new Node(10));
        ArrayList<Node> nodes = list.findAll(20);
        assert nodes.size() == 2;
    }

    @Test
    public void insertTest1() {
        LinkedList list = new LinkedList();
        Node node = new Node(20);
        list.addInTail(node);
        list.addInTail(new Node(50));
        list.insertAfter(node, new Node(40));
        assert list.count() == 3;
        assert list.head.value == 20;
        assert list.tail.value == 50;
    }

    @Test
    public void insertTest2() {
        LinkedList list = new LinkedList();
        list.insertAfter(null, new Node(40));
        assert list.count() == 1;
        assert list.head.value == 40;
        assert list.tail.value == 40;
    }

    @Test
    public void insertTest3() {
        LinkedList list = new LinkedList();
        list.addInTail(new Node(50));
        list.insertAfter(null, new Node(40));
        assert list.count() == 1;
        assert list.head.value == 40;
        assert list.tail.value == 50;
    }

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