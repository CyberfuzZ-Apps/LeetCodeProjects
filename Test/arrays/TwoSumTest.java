package arrays;

import org.junit.Test;
import static org.junit.Assert.*;

public class TwoSumTest {
    @Test
    public void whenTarget9then01() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        TwoSum twoSum = new TwoSum();
        int[] rsl = twoSum.twoSum(nums, target);
        assertArrayEquals(expected, rsl);
    }

    @Test
    public void whenTarget6then12() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        TwoSum twoSum = new TwoSum();
        int[] rsl = twoSum.twoSum(nums, target);
        assertArrayEquals(expected, rsl);
    }

    @Test
    public void whenTarget6then01() {
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        TwoSum twoSum = new TwoSum();
        int[] rsl = twoSum.twoSum(nums, target);
        assertArrayEquals(expected, rsl);
    }

    @Test
    public void whenTarget6then02() {
        int[] nums = {3, 2, 3};
        int target = 6;
        int[] expected = {0, 2};
        TwoSum twoSum = new TwoSum();
        int[] rsl = twoSum.twoSum(nums, target);
        assertArrayEquals(expected, rsl);
    }
}