import arrayExample.ArraysDemo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayTest {
    ArraysDemo arr = new ArraysDemo(10);

    @Test
    void searchKey() {
        assertEquals(34, arr.setElem(0,34));
        assertEquals(15, arr.setElem(9, 15));
        assertEquals(34, arr.getElem(0));
        assertEquals(15, arr.getElem(9));
    }
}
