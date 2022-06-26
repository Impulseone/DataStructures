package NativeCache;

import org.junit.Test;

import static org.junit.Assert.*;

public class NativeCacheTest {

    @Test
    public void put() {
        NativeCache<Integer> cache = new NativeCache<Integer>(3, Integer.class);
        cache.put("first", 1);
        cache.put("second", 2);
        cache.get("first");
        cache.get("second");
        cache.get("second");
        cache.put("third", 3);
        cache.put("last", 4);
        assertEquals(1, (int) cache.get("first"));
        assertEquals(4, (int) cache.get("last"));
        assertEquals(2, (int) cache.get("second"));
        assertNull(cache.get("third"));
    }
}