package DynArray;

import org.junit.Test;

public class InsertTest {
    @Test
    public void insertInEmptyListTest() {
        DynArray<Integer> dynArray = new DynArray<Integer>(Integer.class);
        dynArray.insert(5, 0);
        assert dynArray.array.length == 16;
        assert dynArray.count == 1;
        assert dynArray.capacity == 16;
        assert dynArray.getItem(0) == 5;
    }

    @Test
    public void insertInManyElementsListTest() {
        DynArray<Integer> dynArray = new DynArray<Integer>(Integer.class);
        dynArray.append(2);
        dynArray.append(4);
        dynArray.append(8);
        dynArray.insert(6, 1);
        assert dynArray.array.length == 16;
        assert dynArray.count == 4;
        assert dynArray.capacity == 16;
        assert dynArray.getItem(0) == 2;
        assert dynArray.getItem(1) == 6;
        assert dynArray.getItem(2) == 4;
        assert dynArray.getItem(3) == 8;
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void insertExceptionTest() {
        DynArray<Integer> dynArray = new DynArray<Integer>(Integer.class);
        dynArray.append(2);
        dynArray.append(4);
        dynArray.append(8);
        dynArray.insert(6, 10);
    }

    @Test
    public void insertWithIncreaseElementsTest() {
        DynArray<Integer> dynArray = new DynArray<Integer>(Integer.class);
        dynArray.append(8);
        dynArray.append(8);
        dynArray.append(8);
        dynArray.append(8);
        dynArray.append(8);
        dynArray.append(8);
        dynArray.append(8);
        dynArray.append(8);
        dynArray.append(8);
        dynArray.append(8);
        dynArray.append(8);
        dynArray.append(8);
        dynArray.append(8);
        dynArray.append(8);
        dynArray.append(8);
        dynArray.append(8);
        dynArray.insert(90, 16);
        assert dynArray.array.length == 32;
        assert dynArray.count == 17;
        assert dynArray.capacity == 32;
        assert dynArray.getItem(16) == 90;
    }

    @Test
    public void insertWithIncreaseElementsTest2() {
        DynArray<Integer> dynArray = new DynArray<Integer>(Integer.class);
        dynArray.append(8);
        dynArray.append(8);
        dynArray.append(8);
        dynArray.append(8);
        dynArray.append(8);
        dynArray.append(8);
        dynArray.append(8);
        dynArray.append(8);
        dynArray.append(8);
        dynArray.append(8);
        dynArray.append(8);
        dynArray.append(8);
        dynArray.append(8);
        dynArray.append(8);
        dynArray.append(8);
        dynArray.append(8);
        dynArray.insert(90, 15);
        assert dynArray.array.length == 32;
        assert dynArray.count == 17;
        assert dynArray.capacity == 32;
        assert dynArray.getItem(15) == 90;
        assert dynArray.getItem(16) == 8;
    }
}
