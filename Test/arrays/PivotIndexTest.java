package arrays;

import org.junit.Assert;
import org.junit.Test;

public class PivotIndexTest {

    @Test
    public void whenIndex3() {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int expected = 3;
        PivotIndex pivotIndex = new PivotIndex();
        int rsl = pivotIndex.pivotIndex(nums);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenIndexMinus1() {
        int[] nums = {1, 2, 3};
        int expected = -1;
        PivotIndex pivotIndex = new PivotIndex();
        int rsl = pivotIndex.pivotIndex(nums);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenIndex0() {
        int[] nums = {2, 1, -1};
        int expected = 0;
        PivotIndex pivotIndex = new PivotIndex();
        int rsl = pivotIndex.pivotIndex(nums);
        Assert.assertEquals(expected, rsl);
    }
}