package LinkedList2;

import org.junit.Test;

public class ClearTest {
    @Test
    public void clearTest() {
        LinkedList2 list = new LinkedList2();
        list.addInTail(new Node(10));
        list.addInTail(new Node(20));
        list.addInTail(new Node(30));
        list.clear();
        assert list.count() == 0;
        assert list.head == null;
        assert list.tail == null;
    }
}
