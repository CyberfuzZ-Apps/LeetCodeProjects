package math;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanToIntegerTest {
    @Test
    public void whenIIIto3() {
        RomanToInteger roman = new RomanToInteger();
        int rsl = roman.romanToInt("III");
        int expected = 3;
        assertEquals(expected, rsl);
    }

    @Test
    public void whenIVto4() {
        RomanToInteger roman = new RomanToInteger();
        int rsl = roman.romanToInt("IV");
        int expected = 4;
        assertEquals(expected, rsl);
    }

    @Test
    public void whenIXto9() {
        RomanToInteger roman = new RomanToInteger();
        int rsl = roman.romanToInt("IX");
        int expected = 9;
        assertEquals(expected, rsl);
    }

    @Test
    public void whenLVIIIto58() {
        RomanToInteger roman = new RomanToInteger();
        int rsl = roman.romanToInt("LVIII");
        int expected = 58;
        assertEquals(expected, rsl);
    }

    @Test
    public void whenMCMXCIVto1994() {
        RomanToInteger roman = new RomanToInteger();
        int rsl = roman.romanToInt("MCMXCIV");
        int expected = 1994;
        assertEquals(expected, rsl);
    }
}