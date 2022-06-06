package DynArray;

import org.junit.Test;

public class GetItemTest {
    @Test
    public void getItemInEmptyListTest() {
        DynArray<Integer> dynArray = new DynArray<Integer>(Integer.class);
        Integer item = dynArray.getItem(0);
        assert item == null;
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getItemExceptionTest() {
        DynArray<Integer> dynArray = new DynArray<Integer>(Integer.class);
        Integer item = dynArray.getItem(20);
    }

    @Test
    public void getItemNormalTestInOneElementArray() {
        DynArray<Integer> dynArray = new DynArray<Integer>(Integer.class);
        dynArray.append(6);
        Integer item = dynArray.getItem(0);
        assert item == 6;
    }

    @Test
    public void getItemNormalTestInMAnyElementsArray() {
        DynArray<Integer> dynArray = new DynArray<Integer>(Integer.class);
        dynArray.append(6);
        dynArray.append(9);
        dynArray.append(8);
        Integer item = dynArray.getItem(1);
        assert item == 9;
    }
}
