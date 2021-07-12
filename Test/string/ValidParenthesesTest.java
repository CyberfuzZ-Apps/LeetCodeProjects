package string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesesTest {
    private ValidParentheses validParentheses;

    @Before
    public void setUp() {
        validParentheses = new ValidParentheses();
    }

    @Test
    public void whenTrue() {
        String input = "()";
        assertTrue(validParentheses.isValid(input));
    }

    @Test
    public void whenTrue2() {
        String input = "()[]{}";
        assertTrue(validParentheses.isValid(input));
    }

    @Test
    public void whenTrue3() {
        String input = "{[]}";
        assertTrue(validParentheses.isValid(input));
    }

    @Test
    public void whenFalse() {
        String input = "(]";
        assertFalse(validParentheses.isValid(input));
    }

    @Test
    public void whenFalse2() {
        String input = "([)]";
        assertFalse(validParentheses.isValid(input));
    }
}