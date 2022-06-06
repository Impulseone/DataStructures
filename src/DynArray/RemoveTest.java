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
        assert dynArray.getItem(0) == 1;
        assert dynArray.getItem(1) == 3;
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void removeInEmptyListExceptionCaseTest(){
        DynArray<Integer> dynArray = new DynArray<Integer>(Integer.class);
        dynArray.remove(17);
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
