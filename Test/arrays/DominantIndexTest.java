package arrays;

import org.junit.Assert;
import org.junit.Test;

public class DominantIndexTest {
    @Test
    public void whenIndex1() {
        int[] nums = {3, 6, 1, 0};
        int expected = 1;
        DominantIndex s = new DominantIndex();
        int rsl = s.dominantIndex(nums);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenIndexMinus1() {
        int[] nums = {1, 2, 3, 4};
        int expected = -1;
        DominantIndex s = new DominantIndex();
        int rsl = s.dominantIndex(nums);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenIndex0() {
        int[] nums = {1};
        int expected = 0;
        DominantIndex s = new DominantIndex();
        int rsl = s.dominantIndex(nums);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenIndex3() {
        int[] nums = {0, 1, 0, 2};
        int expected = 3;
        DominantIndex s = new DominantIndex();
        int rsl = s.dominantIndex(nums);
        Assert.assertEquals(expected, rsl);
    }
}