import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PalindromeCheckerTest {

    @Test
    public void testSimplePalindrome() {
        PalindromeChecker checker = new PalindromeChecker();
        assertTrue(checker.isPalindrome("radar"));
    }

    @Test
    public void testPalindromeWithMixedCase() {
        PalindromeChecker checker = new PalindromeChecker();
        assertTrue(checker.isPalindrome("RaceCar"));
    }

    @Test
    public void testPalindromeWithSpacesAndPunctuation() {
        PalindromeChecker checker = new PalindromeChecker();
        assertTrue(checker.isPalindrome("A man, a plan, a canal, Panama"));
    }

    @Test
    public void testNonPalindrome() {
        PalindromeChecker checker = new PalindromeChecker();
        assertFalse(checker.isPalindrome("hello"));
    }

    @Test
    public void testEmptyString() {
        PalindromeChecker checker = new PalindromeChecker();
        assertTrue(checker.isPalindrome(""));
    }

    @Test
    public void testSingleCharacter() {
        PalindromeChecker checker = new PalindromeChecker();
        assertTrue(checker.isPalindrome("a"));
    }

    @Test
    public void testPalindromeWithNumbers() {
        PalindromeChecker checker = new PalindromeChecker();
        assertTrue(checker.isPalindrome("12321"));
        assertFalse(checker.isPalindrome("12345"));
    }
}
