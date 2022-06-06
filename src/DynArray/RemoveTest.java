package DynArray;

import org.junit.Test;

public class RemoveTest {
    @Test
    public void removeStandardCaseTest(){
        DynArray<Integer> dynArray = new DynArray<Integer>(Integer.class);
        dynArray.append(1);
        dynArray.append(2);
        dynArray.append(3);
        dynArray.remove(1);
        assert dynArray.count == 2;
        assert dynArray.capacity == 16;
        assert dynArray.getItem(0) == 1;
        assert dynArray.getItem(2) == 3;
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void removeInOneElementArrayTest(){
        DynArray<Integer> dynArray = new DynArray<Integer>(Integer.class);
        dynArray.append(1);
        dynArray.append(4);
        dynArray.remove(0);
        assert dynArray.count == 1;
        assert dynArray.capacity == 16;
        assert dynArray.getItem(0) == null;
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void removeInEmptyListExceptionCaseTest(){
        DynArray<Integer> dynArray = new DynArray<Integer>(Integer.class);
        dynArray.remove(17);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void removeInEmptyListTest(){
        DynArray<Integer> dynArray = new DynArray<Integer>(Integer.class);
        dynArray.remove(2);
    }

    @Test
    public void removeWithDecreasingTest(){
        DynArray<Integer> dynArray = new DynArray<Integer>(Integer.class);
        for (int i = 0; i < 30; i++) {
            dynArray.append(i);
        }
        for (int i = 0; i < 16; i++) {
            dynArray.remove(i);
        }
        assert dynArray.count == 14;
        assert dynArray.capacity == 21;
    }
}
