package arrays;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PascalsTriangle2Test {
    @Test
    public void when0() {
        var pascal = new PascalsTriangle2();
        List<Integer> expected = List.of(1);
        List<Integer> rsl = pascal.getRow(0);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when3() {
        var pascal = new PascalsTriangle2();
        List<Integer> expected = List.of(1, 3, 3, 1);
        List<Integer> rsl = pascal.getRow(3);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when1() {
        var pascal = new PascalsTriangle2();
        List<Integer> expected = List.of(1, 1);
        List<Integer> rsl = pascal.getRow(1);
        assertThat(rsl, is(expected));
    }
}