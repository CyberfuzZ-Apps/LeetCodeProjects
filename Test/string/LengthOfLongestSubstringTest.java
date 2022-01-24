package string;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Класс LengthOfLongestSubstringTest
 *
 * @author Evgeniy Zaytsev
 * @version 1.0
 */
public class LengthOfLongestSubstringTest {

    @Test
    public void solution1() {
        LengthOfLongestSubstring l = new LengthOfLongestSubstring();
        String s = "abcabcbb";
        int expected = 3;
        int result = l.solution(s);
        assertThat(result, is(expected));
    }

    @Test
    public void solution2() {
        LengthOfLongestSubstring l = new LengthOfLongestSubstring();
        String s = "bbbbb";
        int expected = 1;
        int result = l.solution(s);
        assertThat(result, is(expected));
    }

    @Test
    public void solution3() {
        LengthOfLongestSubstring l = new LengthOfLongestSubstring();
        String s = "pwwkew";
        int expected = 3;
        int result = l.solution(s);
        assertThat(result, is(expected));
    }

    @Test
    public void solution4() {
        LengthOfLongestSubstring l = new LengthOfLongestSubstring();
        String s = "";
        int expected = 0;
        int result = l.solution(s);
        assertThat(result, is(expected));
    }

    @Test
    public void solution5() {
        LengthOfLongestSubstring l = new LengthOfLongestSubstring();
        String s = "dvdf";
        int expected = 3;
        int result = l.solution(s);
        assertThat(result, is(expected));
    }

    @Test
    public void solution6() {
        LengthOfLongestSubstring l = new LengthOfLongestSubstring();
        String s = "tmmzuxt";
        int expected = 5;
        int result = l.solution(s);
        assertThat(result, is(expected));
    }
}