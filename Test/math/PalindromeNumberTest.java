package math;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeNumberTest {

    @Test
    public void whenTrue() {
        var palindrom = new PalindromeNumber();
        assertTrue(palindrom.isPalindrome(121));
    }

    @Test
    public void whenTrue2() {
        var palindrom = new PalindromeNumber();
        assertTrue(palindrom.isPalindrome(12321));
    }

    @Test
    public void whenFalse() {
        var palindrom = new PalindromeNumber();
        assertFalse(palindrom.isPalindrome(-121));
    }

    @Test
    public void whenFalse2() {
        var palindrom = new PalindromeNumber();
        assertFalse(palindrom.isPalindrome(-101));
    }

    @Test
    public void whenFalse3() {
        var palindrom = new PalindromeNumber();
        assertFalse(palindrom.isPalindrome(10));
    }
}