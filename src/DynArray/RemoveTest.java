package DynArray;

import org.junit.Test;

public class RemoveTest {
    @Test
    public void test_remove_standard_case(){
        DynArray<Integer> dynArray = new DynArray<Integer>(Integer.class);
        dynArray.append(1);
        dynArray.append(2);
        dynArray.append(3);
        dynArray.remove(1);
        assert dynArray.count == 2;
        assert dynArray.capacity == 16;
        assert dynArray.getItem(0) == 1;
        assert dynArray.getItem(1) == 3;
    }

    @Test
    public void test_remove_first_element(){
        DynArray<Integer> dynArray = new DynArray<Integer>(Integer.class);
        dynArray.append(1);
        dynArray.append(4);
        dynArray.remove(0);
        assert dynArray.count == 1;
        assert dynArray.capacity == 16;
        assert dynArray.getItem(0) == 4;
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void test_remove_in_empty_list_exception_case(){
        DynArray<Integer> dynArray = new DynArray<Integer>(Integer.class);
        dynArray.remove(17);
    }

    @Test
    public void test_remove_with_decreasing(){
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
