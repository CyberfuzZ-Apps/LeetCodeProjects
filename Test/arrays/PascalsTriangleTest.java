package arrays;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PascalsTriangleTest {

    @Test
    public void when5() {
        var pascal = new PascalsTriangle();
        List<List<Integer>> expected = List.of(
                List.of(1),
                List.of(1, 1),
                List.of(1, 2, 1),
                List.of(1, 3, 3, 1),
                List.of(1, 4, 6, 4, 1)
        );
        List<List<Integer>> rsl = pascal.generate(5);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when1() {
        var pascal = new PascalsTriangle();
        List<List<Integer>> expected = List.of(
                List.of(1)
        );
        List<List<Integer>> rsl = pascal.generate(1);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when2() {
        var pascal = new PascalsTriangle();
        List<List<Integer>> expected = List.of(
                List.of(1),
                List.of(1, 1)
        );
        List<List<Integer>> rsl = pascal.generate(2);
        assertThat(rsl, is(expected));
    }
}