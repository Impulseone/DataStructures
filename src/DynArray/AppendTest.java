package DynArray;

import org.junit.Test;

public class AppendTest {
    @Test
    public void appendInEmptyArrayTest() {
        DynArray<Integer> array = new DynArray<Integer>(Integer.class);
        array.append(5);
        array.append(10);
        assert array.count == 2;
        assert array.capacity == 16;
        assert array.array.length == 16;
    }

    @Test
    public void appendInFullArrayTest() {
        DynArray<Integer> array = new DynArray<Integer>(Integer.class);
        for (int i = 0; i < 20; i++) {
            array.append(i);
        }
        assert array.count == 20;
        assert array.capacity == 32;
    }
}
