import com.ironhack.KeywordChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KeywordCheckerTest {

    @Test
    public void testContainsJavaKeyword() {
        KeywordChecker checker = new KeywordChecker();

        // Test case 1: String with a keyword as a complete word
        assertTrue(checker.containsJavaKeyword("Don´t break my heart"));

        // Test case 2: String with a keyword as part of another word
        assertFalse(checker.containsJavaKeyword("I love to breakdance"));

        // Test case 3: String with multiple keywords
        assertTrue(checker.containsJavaKeyword("if you continue to break the rules, return home"));

        // Test case 4: Empty string
        assertFalse(checker.containsJavaKeyword(""));

        // Test case 5: String with no keywords
        assertFalse(checker.containsJavaKeyword("Hello World"));

        // Test case 6: Case sensitivity - Java keywords are case-sensitive
        assertTrue(checker.containsJavaKeyword("BREAK is not a keyword, but break is"));
        assertTrue(checker.containsJavaKeyword("break is a keyword, but BREAK is not"));

        // Test case 7: Check for a keyword at the beginning of a string
        assertTrue(checker.containsJavaKeyword("final answer is this"));

        // Test case 8: Check for a keyword at the end of a string
        assertTrue(checker.containsJavaKeyword("this is my final"));

        // Test case 9: Check for keyword with punctuation
        assertTrue(checker.containsJavaKeyword("void, and other keywords!"));

        // Test case 10: null input
        assertFalse(checker.containsJavaKeyword(null));

    }
}
