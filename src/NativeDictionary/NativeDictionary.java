import java.lang.reflect.Array;

class NativeDictionary<T> {
    public int size;
    public String[] slots;
    public T[] values;

    public NativeDictionary(int sz, Class clazz) {
        size = sz;
        slots = new String[size];
        values = (T[]) Array.newInstance(clazz, this.size);
    }

    public int hashFun(String key) {
        int sum = 0;
        byte[] bytes = key.getBytes();
        for (byte aByte : bytes) {
            sum += aByte;
        }
        return sum % size;
    }

    public boolean isKey(String key) {
        for (String slot : slots) {
            if (slot != null && slot.equals(key)) return true;
        }
        return false;
    }

    public void put(String key, T value) {
        int index = hashFun(key);
        slots[index] = key;
        values[index] = value;
    }

    public T get(String key) {
        if (!isKey(key))
            return null;
        int index = 0;
        for (int i = 0; i < slots.length; i++) {
            if (slots[i] != null && slots[i].equals(key)) {
                index = i;
                break;
            }
        }
        return values[index];
    }
}
