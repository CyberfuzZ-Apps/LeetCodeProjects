package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
54. Spiral Matrix

Given an m x n matrix, return all elements of the matrix in spiral order.

Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]

Example 2:

Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100
 */
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> rsl = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        if (m * n == 1) {
            rsl.add(matrix[0][0]);
            return rsl;
        } else if (m * n == 0) {
            return rsl;
        }
        int row = 0;
        int cell = 0;
        while (row < m && cell < n) {
            if (cell <= n - 1) {
                rsl.add(matrix[row][cell++]);
            } else {
                cell -= 1;
                row += 1;
                rsl.add(matrix[row++][cell]);
            }
        }
        return rsl;
    }
}
