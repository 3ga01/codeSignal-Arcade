import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class LongestArrayElementTest {
    @Test
    public void test() {
        String[] inputArray = { "a","abc","cbd","zzzzz","a" };
        LongestArrayElement test = new LongestArrayElement();

        String[] actual = test.longestArrayElement(inputArray);

        String[] expected = { "zzzzz" };

        assertArrayEquals(expected, actual);
    }

}
