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
        if (index >= capacity || index > count || index < 0) throw new IndexOutOfBoundsException();
        count -= 1;
        array[index] = null;
        if (count < capacity / 2 && capacity > 16) {
            moveArrayToStart(index);
            makeArray((int) (capacity / 1.5));
        }
    }

    private void moveArrayToStart(int fromIndex) {
        T[] newArray = (T[]) Array.newInstance(this.clazz, array.length);
        if (fromIndex >= 0) System.arraycopy(array, 0, newArray, 0, fromIndex);
        if (count - fromIndex >= 0) System.arraycopy(array, fromIndex + 1, newArray, fromIndex, count - fromIndex);
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
        if (count + 1 - (fromIndex + 1) >= 0)
            System.arraycopy(array, fromIndex + 1 - 1, newArray, fromIndex + 1, count + 1 - (fromIndex + 1));
        array = newArray;
    }

}
