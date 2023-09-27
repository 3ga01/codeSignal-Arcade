import org.junit.Test;
import static org.junit.Assert.*;

public class CenturyTest {

    @Test
    public void testYear() {
        CenturyFromYear centuryFromYear = new CenturyFromYear();

        int actual = centuryFromYear.centutry(374);

        assertEquals(4, actual);
    }

}
