import highArray.HighArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HighArrayTest {


    @Test
    void insertElement(){
        int maxSize = 100;
        HighArray array = new HighArray(maxSize);
        assertEquals(0, array.insert(12));
        assertEquals(1, array.insert(1));
        assertEquals(2, array.insert(11));
        assertEquals(3, array.insert(178));
    }

    @Test
    void findElement() {
        int maxSize = 100;
        HighArray array = new HighArray(maxSize);
        array.insert(12);
        array.insert(11);
        assertFalse(array.find(34));
        assertTrue(array.find(11));
        assertTrue(array.find(12));
    }

    @Test
    void deleteElement(){
        int maxSize = 100;
        HighArray array = new HighArray(maxSize);
        assertFalse(array.delete(0));
        array.insert(45);
        assertTrue(array.delete(45));
    }
}
