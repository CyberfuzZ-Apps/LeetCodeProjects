package arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchInsertPositionTest {
    @Test
    public void example1() {
        //Input: nums = [1,3,5,6], target = 5
        //Output: 2
        var insert = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int expected = 2;
        int rsl = insert.searchInsert(nums, target);
        assertEquals(expected, rsl);
    }

    @Test
    public void example2() {
        //Input: nums = [1,3,5,6], target = 2
        //Output: 1
        var insert = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        int expected = 1;
        int rsl = insert.searchInsert(nums, target);
        assertEquals(expected, rsl);
    }

    @Test
    public void example3() {
        //Input: nums = [1,3,5,6], target = 7
        //Output: 4
        var insert = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int expected = 4;
        int rsl = insert.searchInsert(nums, target);
        assertEquals(expected, rsl);
    }

    @Test
    public void example4() {
        //Input: nums = [1,3,5,6], target = 0
        //Output: 0
        var insert = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        int target = 0;
        int expected = 0;
        int rsl = insert.searchInsert(nums, target);
        assertEquals(expected, rsl);
    }

    @Test
    public void example5() {
        //Input: nums = [1], target = 0
        //Output: 0
        var insert = new SearchInsertPosition();
        int[] nums = {1};
        int target = 0;
        int expected = 0;
        int rsl = insert.searchInsert(nums, target);
        assertEquals(expected, rsl);
    }
}
