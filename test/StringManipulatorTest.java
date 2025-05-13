import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringManipulatorTest {

    private final StringManipulator manipulator = new StringManipulator();

    @Test
    void testConcatenate() {
        assertEquals("HelloWorld", manipulator.concatenate("Hello", "World"));
        assertEquals("Java", manipulator.concatenate("", "Java"));
        assertEquals("Test", manipulator.concatenate("Test", ""));
    }

    @Test
    void testFindLength() {
        assertEquals(5, manipulator.findLength("Hello"));
        assertEquals(0, manipulator.findLength(""));
    }

    @Test
    void testConvertToUpperCase() {
        assertEquals("HELLO", manipulator.convertToUpperCase("hello"));
        assertEquals("JAVA123", manipulator.convertToUpperCase("java123"));
    }

    @Test
    void testConvertToLowerCase() {
        assertEquals("hello", manipulator.convertToLowerCase("HELLO"));
        assertEquals("java123", manipulator.convertToLowerCase("JAVA123"));
    }

    @Test
    void testContainsSubstring() {
        assertTrue(manipulator.containsSubstring("Hello, World", "World"));
        assertFalse(manipulator.containsSubstring("Hello", "world"));
        assertTrue(manipulator.containsSubstring("abc", ""));
    }
}
