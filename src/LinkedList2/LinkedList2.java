public class LinkedList2 {
    public Node head;
    public Node tail;

    public LinkedList2() {
        head = null;
        tail = null;
    }

    public void addInTail(Node _item) {
        if (head == null) {
            this.head = _item;
            this.head.next = null;
            this.head.prev = null;
        } else {
            this.tail.next = _item;
            _item.prev = tail;
        }
        this.tail = _item;
    }

    public Node find(int _value) {
        Node node = this.head;
        while (node != null) {
            if (node.value == _value)
                return node;
            node = node.next;
        }
        return null;
    }

    public ArrayList<Node> findAll(int _value) {
        ArrayList<Node> nodes = new ArrayList<>();
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
            if (count() == 1 && node.value == _value) {
                head = null;
                tail = null;
                return true;
            }
            if (this.head.value == _value) {
                this.head = node.next;
                return true;
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
        Node node = this.head;

        if (node == null && _nodeAfter == null) {
            this.head = _nodeToInsert;
            this.tail = _nodeToInsert;
            return;
        }
        while (node != null) {
            if (_nodeAfter == null && node.next == null) {
                Node headBefore = this.head;
                this.head = _nodeToInsert;
                this.head.next = headBefore;
                this.tail = headBefore;
                return;
            }
            if (_nodeAfter == null) {
                Node headBefore = this.head;
                this.head = _nodeToInsert;
                this.head.next = headBefore;
                return;
            }
            if (node.value == _nodeAfter.value && node.next == null) {
                node.next = _nodeToInsert;
                _nodeToInsert.next = null;
                this.tail = _nodeToInsert;
                return;
            }
            if (node.value == _nodeAfter.value) {
                Node nextNode = node.next;
                node.next = _nodeToInsert;
                _nodeToInsert.next = nextNode;
                return;
            }
            node = node.next;
        }
    }
}

class Node {
    public int value;
    public Node next;
    public Node prev;

    public Node(int _value) {
        value = _value;
        next = null;
        prev = null;
    }
}
