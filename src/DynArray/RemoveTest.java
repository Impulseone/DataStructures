package DynArray;

import org.junit.Test;

public class RemoveTest {
    @Test
    public void test_remove_standard_case() {
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
    public void test_remove_standard_case_last_element() {
        DynArray<Integer> dynArray = new DynArray<Integer>(Integer.class);
        dynArray.append(1);
        dynArray.append(2);
        dynArray.append(3);
        dynArray.remove(2);
        assert dynArray.count == 2;
        assert dynArray.capacity == 16;
        assert dynArray.getItem(0) == 1;
        assert dynArray.getItem(1) == 2;
    }

    @Test
    public void test_remove_standard_case_middle_element() {
        DynArray<Integer> dynArray = new DynArray<Integer>(Integer.class);
        dynArray.append(1);
        dynArray.append(2);
        dynArray.append(3);
        dynArray.append(4);
        dynArray.append(5);
        dynArray.remove(1);
        assert dynArray.count == 4;
        assert dynArray.capacity == 16;
        assert dynArray.getItem(0) == 1;
        assert dynArray.getItem(1) == 3;
        assert dynArray.getItem(2) == 4;
        assert dynArray.getItem(3) == 5;
    }

    @Test
    public void test_remove_first_element() {
        DynArray<Integer> dynArray = new DynArray<Integer>(Integer.class);
        dynArray.append(1);
        dynArray.append(4);
        dynArray.remove(0);
        assert dynArray.count == 1;
        assert dynArray.capacity == 16;
        assert dynArray.getItem(0) == 4;
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void test_remove_in_empty_list_exception_case() {
        DynArray<Integer> dynArray = new DynArray<Integer>(Integer.class);
        dynArray.remove(17);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void test_remove_in_empty_list() {
        DynArray<Integer> dynArray = new DynArray<Integer>(Integer.class);
        dynArray.remove(0);
    }

    @Test
    public void test_remove_one_element() {
        DynArray<Integer> dynArray = new DynArray<Integer>(Integer.class);
        dynArray.append(9);
        dynArray.remove(0);
        assert dynArray.count == 0;
        assert dynArray.capacity == 16;
    }

    @Test
    public void test_remove_with_decreasing() {
        DynArray<Integer> dynArray = new DynArray<Integer>(Integer.class);
        for (int i = 0; i < 30; i++) {
            dynArray.append(i);
        }
        for (int i = 0; i < 15; i++) {
            dynArray.remove(i);
        }
        assert dynArray.count == 15;
        assert dynArray.capacity == 21;
    }

    @Test
    public void test_remove_with_minimal_size() {
        DynArray<Integer> dynArray = new DynArray<Integer>(Integer.class);
        for (int i = 0; i < 16; i++) {
            dynArray.append(i);
        }
        dynArray.remove(15);
        assert dynArray.count == 15;
        assert dynArray.capacity == 16;
    }

    @Test
    public void test_remove_with_decreasing_to_minimal_size() {
        DynArray<Integer> dynArray = new DynArray<Integer>(Integer.class);
        for (int i = 0; i < 17; i++) {
            dynArray.append(i);
        }
        for (int i = 0; i < 9; i++) {
            dynArray.remove(i);
        }
        assert dynArray.count == 8;
        assert dynArray.capacity == 16;
    }

    @Test
    public void test_remove_all() {
        DynArray<Integer> dynArray = new DynArray<Integer>(Integer.class);
        for (int i = 0; i < 16; i++) {
            dynArray.append(i);
        }
        for (int i = 0; i < 16; i++) {
            dynArray.remove(0);
        }
        assert dynArray.count == 0;
        assert dynArray.capacity == 16;
    }
}
