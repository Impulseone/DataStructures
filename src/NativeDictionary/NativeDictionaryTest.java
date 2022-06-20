package NativeDictionary;

import org.junit.Test;

import static org.junit.Assert.*;

public class NativeDictionaryTest {

    @Test
    public void isKey() {
        NativeDictionary<Integer> dictionary = new NativeDictionary<Integer>(10, Integer.class);
        dictionary.put("first", 1);
        dictionary.put("second", 2);
        assertTrue(dictionary.isKey("first"));
        assertTrue(dictionary.isKey("second"));
        assertFalse(dictionary.isKey("sdfdsg"));
    }

    @Test
    public void putTest() {
        NativeDictionary<Integer> dictionary = new NativeDictionary<Integer>(10, Integer.class);
        dictionary.put("first", 1);
        dictionary.put("second", 2);
        assertEquals(1, (int) dictionary.get("first"));
        assertEquals(2, (int) dictionary.get("second"));
    }

    @Test
    public void doublePutTest() {
        NativeDictionary<Integer> dictionary = new NativeDictionary<Integer>(10, Integer.class);
        dictionary.put("first", 1);
        dictionary.put("second", 2);
        dictionary.put("second", 1);
        assertEquals(1, (int) dictionary.get("first"));
        assertEquals(1, (int) dictionary.get("second"));
    }
}