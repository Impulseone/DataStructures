package PowerSet;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerSetTest {

    @Test
    public void sizeTest() {
        PowerSet powerSet = new PowerSet();
        for (int i = 0; i < 19500; i++) {
            powerSet.put("" + i);
        }
        assertEquals(19500, powerSet.size());
    }

    @Test
    public void sizeTest2() {
        PowerSet powerSet = new PowerSet();
        for (int i = 0; i < 15500; i++) {
            powerSet.put("aaa");
        }
        assertEquals(1, powerSet.size());
    }

    @Test
    public void putTest() {
        PowerSet powerSet = new PowerSet();
        for (int i = 0; i < 15550; i++) {
            powerSet.put("aaa");
        }
        for (int i = 0; i < 15500; i++) {
            powerSet.put("bbb");
        }
        assertEquals(2, powerSet.size());
    }

    @Test
    public void removeTest() {
        PowerSet powerSet = new PowerSet();
        for (int i = 0; i < 19500; i++) {
            powerSet.put("" + i);
        }
        for (int i = 0; i < 19400; i++) {
            powerSet.remove("" + i);
        }
        assertEquals(100, powerSet.size());
    }

    @Test
    public void intersectionTest() {
        PowerSet powerSet = new PowerSet();
        for (int i = 0; i < 19500; i++) {
            powerSet.put("" + i);
        }
        PowerSet powerSet2 = new PowerSet();
        for (int i = 0; i < 19400; i++) {
            powerSet2.put("" + i);
        }
        PowerSet powerSet3 = powerSet.intersection(powerSet2);
        assertEquals(19400, powerSet3.size());
    }

    @Test
    public void intersectionTest2() {
        PowerSet powerSet = new PowerSet();
        for (int i = 0; i < 20000; i++) {
            powerSet.put("" + i);
        }
        PowerSet powerSet2 = new PowerSet();
        PowerSet powerSet3 = powerSet.intersection(powerSet2);
        assertEquals(0, powerSet3.size());
    }

    @Test
    public void unionTest() {
        PowerSet powerSet = new PowerSet();
        for (int i = 10000; i < 12000; i++) {
            powerSet.put("" + i);
        }
        PowerSet powerSet2 = new PowerSet();
        for (int i = 5000; i < 10000; i++) {
            powerSet2.put("" + i);
        }
        PowerSet powerSet3 = powerSet.union(powerSet2);
        assertEquals(7000, powerSet3.size());
    }

    @Test
    public void unionTest2() {
        PowerSet powerSet = new PowerSet();
        for (int i = 0; i < 5; i++) {
            powerSet.put("" + i);
        }
        PowerSet powerSet2 = new PowerSet();
        PowerSet powerSet3 = powerSet.union(powerSet2);
        assertEquals(5, powerSet3.size());
    }

    @Test
    public void differenceTest() {
        PowerSet powerSet = new PowerSet();
        for (int i = 0; i < 17000; i++) {
            powerSet.put("" + i);
        }
        PowerSet powerSet2 = new PowerSet();
        for (int i = 15000; i < 19000; i++) {
            powerSet2.put("" + i);
        }
        PowerSet powerSet3 = powerSet.difference(powerSet2);
        assertEquals(15000, powerSet3.size());
    }

    @Test
    public void differenceTest2() {
        PowerSet powerSet = new PowerSet();
        for (int i = 0; i < 7; i++) {
            powerSet.put("" + i);
        }
        PowerSet powerSet2 = new PowerSet();
        for (int i = 0; i < 7; i++) {
            powerSet2.put("" + i);
        }
        PowerSet powerSet3 = powerSet.difference(powerSet2);
        assertEquals(0, powerSet3.size());
    }

    @Test
    public void isSubsetTest() {
        PowerSet powerSet = new PowerSet();
        for (int i = 0; i < 17000; i++) {
            powerSet.put("" + i);
        }
        PowerSet powerSet2 = new PowerSet();
        for (int i = 0; i < 17000; i++) {
            powerSet2.put("" + i);
        }
        assertTrue(powerSet.isSubset(powerSet2));
    }

    @Test
    public void isSubsetTest2() {
        PowerSet powerSet = new PowerSet();
        for (int i = 0; i < 7; i++) {
            powerSet.put("" + i);
        }
        PowerSet powerSet2 = new PowerSet();
        for (int i = 5; i < 887; i++) {
            powerSet2.put("" + i);
        }
        assertFalse(powerSet.isSubset(powerSet2));
    }

    @Test
    public void isSubsetTest3() {
        PowerSet powerSet = new PowerSet();
        for (int i = 4; i < 6; i++) {
            powerSet.put("" + i);
        }
        PowerSet powerSet2 = new PowerSet();
        for (int i = 0; i < 7; i++) {
            powerSet2.put("" + i);
        }
        assertTrue(powerSet2.isSubset(powerSet));
    }
}