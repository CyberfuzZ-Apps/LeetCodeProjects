package arrays;

import org.junit.Assert;
import org.junit.Test;

public class PlusOneTest {
    @Test
    public void when123To124() {
        int[] nums = {1, 2, 3};
        int[] expected = {1, 2, 4};
        PlusOne p = new PlusOne();
        int[] rsl = p.plusOne(nums);
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void when4321To4322() {
        int[] nums = {4, 3, 2, 1};
        int[] expected = {4, 3, 2, 2};
        PlusOne p = new PlusOne();
        int[] rsl = p.plusOne(nums);
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void when0To1() {
        int[] nums = {0};
        int[] expected = {1};
        PlusOne p = new PlusOne();
        int[] rsl = p.plusOne(nums);
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void when9To10() {
        int[] nums = {9};
        int[] expected = {1, 0};
        PlusOne p = new PlusOne();
        int[] rsl = p.plusOne(nums);
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void when99To100() {
        int[] nums = {9, 9};
        int[] expected = {1, 0, 0};
        PlusOne p = new PlusOne();
        int[] rsl = p.plusOne(nums);
        Assert.assertArrayEquals(expected, rsl);
    }
}