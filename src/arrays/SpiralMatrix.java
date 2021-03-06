package arrays;

import java.util.ArrayList;
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

        if (matrix.length * matrix[0].length == 1) {
            rsl.add(matrix[0][0]);
            return rsl;
        } else if (matrix.length * matrix[0].length == 0) {
            return rsl;
        }
        int row = 0;
        int cell = 0;
        int lastRow = matrix.length - 1;
        int lastCell = matrix[0].length - 1;
        while (row <= lastRow && cell <= lastCell) {
            for (int i = cell; i <= lastCell; i++) {
                rsl.add(matrix[row][i]);
            }
            row++;
            for (int i = row; i <= lastRow; i++) {
                rsl.add(matrix[i][lastCell]);
            }
            lastCell--;
            if (row <= lastRow) {
                for (int i = lastCell; i >= cell; i--) {
                    rsl.add(matrix[lastRow][i]);
                }
                lastRow--;
            }
            if (cell <= lastCell) {
                for (int i = lastRow; i >= row; i--) {
                    rsl.add(matrix[i][cell]);
                }
                cell++;
            }
        }
        return rsl;
    }
}
