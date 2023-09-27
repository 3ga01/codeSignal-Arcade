import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeTest {

    @Test
    public void TestPalindrome() {

        Palindrome palindrome = new Palindrome();

        boolean actual = palindrome.checkPalindrome("aba");

        assertTrue("Should be true", actual);
    }
}
