public class DynArray<T> {
    public T[] array;
    public int count;
    public int capacity;
    Class clazz;

    public DynArray(Class clz) {
        clazz = clz;
        count = 0;
        makeArray(16);
    }

    public void makeArray(int new_capacity) {
        T[] newArray = (T[]) Array.newInstance(this.clazz, new_capacity);
        if (array != null && new_capacity > capacity) {
            System.arraycopy(array, 0, newArray, 0, capacity);
        }
        if (array != null && new_capacity < capacity) {
            System.arraycopy(array, 0, newArray, 0, new_capacity);
        }
        array = newArray;
        capacity = new_capacity;
    }

    public T getItem(int index) {
        if (index >= 0 && index < capacity) {
            return array[index];
        } else throw new IndexOutOfBoundsException();
    }

    public void append(T itm) {
        if (count == capacity) {
            makeArray(capacity * 2);
        }
        for (int i = 0; i < capacity; i++) {
            if (array[i] == null) {
                array[i] = itm;
                count += 1;
                return;
            }
        }
    }

    public void insert(T itm, int index) {
        if (index > capacity || index > count || index < 0) throw new IndexOutOfBoundsException();
        if (count == capacity) makeArray(capacity * 2);
        if (index == count) {
            append(itm);
            return;
        }
        if (index < count) {
            moveArrayToEnd(index);
            array[index] = itm;
            count += 1;
        }

    }

    public void remove(int index) {
        if (index >= capacity || index < 0) throw new IndexOutOfBoundsException();
        if (index == capacity - 1) {
            array[index] = null;
            count -= 1;
            return;
        }
        moveArrayToStart(index);
        count -= 1;

        if (count < capacity / 2 && capacity > 16) {
            makeArray((int) (capacity / 1.5));
        }
    }

    private void moveArrayToStart(int fromIndex) {
        T[] newArray = (T[]) Array.newInstance(this.clazz, array.length);
        for (int i = 0; i < fromIndex; i++) {
            newArray[i] = array[i];
        }
        for (int i = fromIndex; i < count; i++) {
            newArray[i] = array[i + 1];
        }
        array = newArray;
    }

    private void moveArrayToEnd(int fromIndex) {
        T[] newArray = (T[]) Array.newInstance(this.clazz, array.length);
        for (int i = 0; i <= fromIndex; i++) {
            if (i == fromIndex) {
                newArray[i] = null;
                break;
            }
            newArray[i] = array[i];
        }
        for (int i = fromIndex + 1; i <= count; i++) {
            newArray[i] = array[i - 1];
        }
        array = newArray;
    }

}
