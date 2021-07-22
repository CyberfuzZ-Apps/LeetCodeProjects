package arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortedArrayTest {
    @Test
    public void example1() {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        int[] expected = {1, 2, 2, 3, 5, 6};
        int[] rsl = mergeSortedArray.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, rsl);
    }

    @Test
    public void example2() {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = {1};
        int[] nums2 = {};
        int m = 1;
        int n = 0;
        int[] expected = {1};
        int[] rsl = mergeSortedArray.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, rsl);
    }

    @Test
    public void example3() {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = {};
        int[] nums2 = {1};
        int m = 0;
        int n = 1;
        int[] expected = {1};
        int[] rsl = mergeSortedArray.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, rsl);
    }

    @Test
    public void example4() {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = {0};
        int[] nums2 = {1};
        int m = 0;
        int n = 1;
        int[] expected = {1};
        int[] rsl = mergeSortedArray.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, rsl);
    }

    @Test
    public void example5() {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        int[] nums2 = {1, 2, 3};
        int m = 3;
        int n = 3;
        int[] expected = {1, 2, 3, 4, 5, 6};
        int[] rsl = mergeSortedArray.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, rsl);
    }
}