package LinkedList2;

import LinkedList.LinkedList;
import org.junit.Test;

import java.util.ArrayList;

public class FindAllTest {
    @Test
    public void findAllInEmptyListTest() {
        LinkedList2 list = new LinkedList2();
        ArrayList<Node> nodes = list.findAll(20);
        assert nodes.size() == 0;
    }

    @Test
    public void findAllInManyElementsListTest() {
        LinkedList2 list = new LinkedList2();
        list.addInTail(new Node(10));
        list.addInTail(new Node(20));
        list.addInTail(new Node(20));
        list.addInTail(new Node(40));
        ArrayList<Node> nodes = list.findAll(20);
        assert nodes.size() == 2;
    }

    @Test
    public void findAllInOneElementListTest() {
        LinkedList2 list = new LinkedList2();
        list.addInTail(new Node(10));
        ArrayList<Node> nodes = list.findAll(10);
        assert nodes.size() == 1;
    }

    @Test
    public void findAllInOneElementListWithoutElementTest() {
        LinkedList2 list = new LinkedList2();
        list.addInTail(new Node(10));
        ArrayList<Node> nodes = list.findAll(30);
        assert nodes.size() == 0;
    }
}
