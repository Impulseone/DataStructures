package Stack;

import java.util.ArrayList;

public class Stack<T> {

    private final ArrayList<T> list;

    public Stack() {
        list = new ArrayList<>();
    }

    public int size() {
        return list.size();
    }

    public T pop() {
        if (size() == 0) return null;
        T element = list.get(list.size() - 1);
        list.remove(element);
        return element;  // если стек пустой
    }

    public void push(T val) {
        list.add(val);
    }

    public T peek() {
        if (size() == 0) return null;
        return list.get(list.size() - 1);
    }
}
