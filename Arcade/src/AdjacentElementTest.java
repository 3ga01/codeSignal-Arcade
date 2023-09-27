import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AdjacentElementTest {

    @Test
    public void testAdjacentElement() {
        int[] inputArray = { 1, 0, 1, 0 };

        AdjacentElement test = new AdjacentElement();

        int exact = test.adjacentElement(inputArray);

        assertEquals(0, exact);
    }
}
