public class BloomFilter {
    public int filter_len;
    private int[] array;

    public BloomFilter(int f_len) {
        filter_len = f_len;
        array = new int[filter_len];
    }

    public int hash1(String str1) {
        int result = 0;
        for (int i = 0; i < str1.length(); i++) {
            int code = (int) str1.charAt(i);
            result = (result * 17 + code) % filter_len;
        }
        return result;
    }

    public int hash2(String str1) {
        int result = 0;
        for (int i = 0; i < str1.length(); i++) {
            int code = (int) str1.charAt(i);
            result = (result * 223 + code) % filter_len;
        }
        return result;
    }

    public void add(String str1) {
        int index1 = hash1(str1);
        int index2 = hash2(str1);
        array[index1] = 1;
        array[index2] = 1;
    }

    public boolean isValue(String str1) {
        int index1 = hash1(str1);
        int index2 = hash2(str1);
        return array[index1] == 1 && array[index2] == 1;
    }
}
