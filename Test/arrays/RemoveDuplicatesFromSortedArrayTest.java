package arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesFromSortedArrayTest {
    @Test
    public void when2() {
        var remove = new RemoveDuplicatesFromSortedArray();
        int[] nums = {1, 1, 2};
        int[] expected = {1, 2};
        int k = remove.removeDuplicates(nums);
        assertEquals(2, k);
        for (int i = 0; i < k; i++) {
            assertEquals(remove.numsCopy[i], expected[i]);
        }
    }

    @Test
    public void when5() {
        var remove = new RemoveDuplicatesFromSortedArray();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expected = {0, 1, 2, 3, 4};
        int k = remove.removeDuplicates(nums);
        assertEquals(5, k);
        for (int i = 0; i < k; i++) {
            assertEquals(remove.numsCopy[i], expected[i]);
        }
    }
}