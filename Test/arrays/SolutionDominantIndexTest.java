package arrays;

import org.junit.Assert;
import org.junit.Test;

public class SolutionDominantIndexTest {
    @Test
    public void whenIndex1() {
        int[] nums = {3, 6, 1, 0};
        int expected = 1;
        SolutionDominantIndex s = new SolutionDominantIndex();
        int rsl = s.dominantIndex(nums);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenIndexMinus1() {
        int[] nums = {1, 2, 3, 4};
        int expected = -1;
        SolutionDominantIndex s = new SolutionDominantIndex();
        int rsl = s.dominantIndex(nums);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenIndex0() {
        int[] nums = {1};
        int expected = 0;
        SolutionDominantIndex s = new SolutionDominantIndex();
        int rsl = s.dominantIndex(nums);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenIndex3() {
        int[] nums = {0, 1, 0, 2};
        int expected = 3;
        SolutionDominantIndex s = new SolutionDominantIndex();
        int rsl = s.dominantIndex(nums);
        Assert.assertEquals(expected, rsl);
    }
}