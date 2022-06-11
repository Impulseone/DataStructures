package Queue;

import java.util.ArrayList;

public class Queue<T> {

    private final ArrayList<T> elements;

    public Queue() {
        elements = new ArrayList<>();
    }

    public void enqueue(T item) {
        elements.add(0, item);
    }

    public T dequeue() {
        if (size() == 0) return null;
        T element = elements.get(elements.size() - 1);
        elements.remove(element);
        return element;
    }

    public int size() {
        return elements.size();
    }

}
