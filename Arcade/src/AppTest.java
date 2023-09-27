import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void testAdd() {
        Add add = new Add();

        int result = add.add(1, 1);

        assertEquals(2, result);
    }

}
