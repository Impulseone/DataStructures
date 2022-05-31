public class LinkedList {
    public Node head;
    public Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void addInTail(Node item) {
        if (this.head == null)
            this.head = item;
        else
            this.tail.next = item;
        this.tail = item;
    }

    public Node find(int value) {
        Node node = this.head;
        while (node != null) {
            if (node.value == value)
                return node;
            node = node.next;
        }
        return null;
    }

    public ArrayList<Node> findAll(int _value) {
        ArrayList<Node> nodes = new ArrayList<Node>();
        Node node = this.head;
        while (node != null) {
            if (node.value == _value) nodes.add(node);
            node = node.next;
        }
        return nodes;
    }

    public boolean remove(int _value) {
        Node node = this.head;
        while (node != null) {
            if (count() == 1 && this.head.value == _value) {
                head = null;
                tail = null;
                return true;
            }
            if (this.head.value == _value) {
                this.head = node.next;
            }
            if (node.next != null && node.next.value == _value) {
                node.next = node.next.next;
                if (node.next == null) this.tail = node;
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public void removeAll(int _value) {
        Node node = this.head;
        while (node != null) {
            remove(_value);
            node = node.next;
        }
    }

    public void clear() {
        this.head = null;
        this.tail = null;
    }

    public int count() {
        int result = 0;
        Node node = this.head;
        while (node != null) {
            result += 1;
            node = node.next;
        }
        return result;
    }

    public void insertAfter(Node _nodeAfter, Node _nodeToInsert) {
        if (_nodeAfter == null && count() == 0) {
            this.head = _nodeToInsert;
            this.tail = _nodeToInsert;
            return;
        }
        if (_nodeAfter == null && count() != 0) {
            Node nextNode = this.head.next;
            this.head = _nodeToInsert;
            this.head.next = nextNode;
            return;
        }
        Node node = this.head;
        while (node != null) {
            if (node.value == _nodeAfter.value) {
                Node nextNode = node.next;
                node.next = _nodeToInsert;
                _nodeToInsert.next = nextNode;
            }
            node = node.next;
        }
    }

}

class Node {
    public int value;
    public Node next;

    public Node(int _value) {
        value = _value;
        next = null;
    }
}
