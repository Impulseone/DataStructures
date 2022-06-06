package DynArray;

import org.junit.Test;

public class CreateArrayTest {
    @Test
    public void createArray() {
        DynArray<Integer> dynArray = new DynArray<Integer>(Integer.class);
        assert dynArray.array.length == 16;
        assert dynArray.count == 0;
        assert dynArray.capacity == 16;
        assert dynArray.clazz == Integer.class;
    }
}