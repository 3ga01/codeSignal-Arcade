import org.junit.Test;
import static org.junit.Assert.*;

public class AddTest {
    @Test
    public void testAddPositiveNumbers() {
        Add addFxn = new Add();

        int result = addFxn.add(2, 1);

        assertEquals(3, result);
    }

    @Test
    public void testAddPositiveAndNegativeNumbers() {
        Add addFxn = new Add();

        int result = addFxn.add(-3, 1);

        assertEquals(-2, result);
    }

    @Test
    public void testAddNegativeNumbers() {
        Add addFxn = new Add();

        int result = addFxn.add(-2, -1);

        assertEquals(-3, result);
    }

    @Test
    public void testAddZeroAndPositiveNumber() {
        Add addFxn = new Add();

        int actual = addFxn.add(0, 2);

        assertEquals(2, actual);
    }

    @Test
    public void testAddZeroAndNegativeNumber() {
        Add addFxn = new Add();
        int actual = addFxn.add(0, -2);
        assertEquals(-2, actual);
    }

    @Test
    public void testAddLargeNumbers() {
        Add addFxn = new Add();
        int actual = addFxn.add(4000, 8000);
        assertEquals(12000, actual);
    }

}
