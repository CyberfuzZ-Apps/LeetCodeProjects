package string;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LongestCommonPrefixTest {
    @Test
    public void whenPrefix() {
        var prefix = new LongestCommonPrefix();
        String[] input = {"flower", "flow", "flight"};
        String expected = "fl";
        String rsl = prefix.longestPrefix(input);
        assertThat(expected, is(rsl));
    }

    @Test
    public void whenNoPrefix() {
        var prefix = new LongestCommonPrefix();
        String[] input = {"dog", "racecar", "car"};
        String expected = "";
        String rsl = prefix.longestPrefix(input);
        assertThat(expected, is(rsl));
    }

    @Test
    public void whenLength1() {
        var prefix = new LongestCommonPrefix();
        String[] input = {"a"};
        String expected = "a";
        String rsl = prefix.longestPrefix(input);
        assertThat(expected, is(rsl));
    }

    @Test
    public void whenEmptyStrings() {
        var prefix = new LongestCommonPrefix();
        String[] input = {"", "", ""};
        String expected = "";
        String rsl = prefix.longestPrefix(input);
        assertThat(expected, is(rsl));
    }

    @Test
    public void whenEmptyThenNoEmpty() {
        var prefix = new LongestCommonPrefix();
        String[] input = {"", "a"};
        String expected = "";
        String rsl = prefix.longestPrefix(input);
        assertThat(expected, is(rsl));
    }
}