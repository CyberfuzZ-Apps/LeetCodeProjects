package arrays;

import java.util.ArrayList;
import java.util.List;
/*
119. Pascal's Triangle II
Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:

Input: rowIndex = 3
Output: [1,3,3,1]

Example 2:

Input: rowIndex = 0
Output: [1]

Example 3:

Input: rowIndex = 1
Output: [1,1]

Constraints:

0 <= rowIndex <= 33

Follow up: Could you optimize your algorithm to use only O(rowIndex) extra space?
 */
public class PascalsTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> rsl = new ArrayList<>(rowIndex);
        if (rowIndex == 0) {
            return List.of(1);
        } else {
            rsl.add(List.of(1));
            rsl.add(List.of(1, 1));
        }
        for (int i = 2; i <= rowIndex; i++) {
            List<Integer> tmp = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    tmp.add(1);
                    continue;
                }
                tmp.add(rsl.get(i - 1).get(j - 1) + rsl.get(i - 1).get(j));
            }
            rsl.add(i, tmp);
        }
        return rsl.get(rowIndex);
    }
}
