package arrays;

import java.util.HashMap;
import java.util.Map;

/*
136. Single Number

Given a non-empty array of integers nums, every element appears twice except for one.
Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:

Input: nums = [2,2,1]
Output: 1

Example 2:

Input: nums = [4,1,2,1,2]
Output: 4

Example 3:

Input: nums = [1]
Output: 1

Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 1;
        for (int n : nums) {
            Integer integer = map.putIfAbsent(n, count);
            if (integer != null) {
                map.put(n, count + 1);
            }
        }
        for (var k : map.keySet()) {
            if (map.get(k) == 1) {
                return k;
            }
        }
        return nums[0];
    }
}
