package DynArray;

import org.junit.Test;

public class MakeArrayTest {

    @Test
    public void makeNewArrayTest() {
        DynArray<Integer> dynArray = new DynArray<Integer>(Integer.class);
        dynArray.makeArray(30);
        assert dynArray.array.length == 30;
        assert dynArray.count == 0;
        assert dynArray.capacity == 30;
    }
}
