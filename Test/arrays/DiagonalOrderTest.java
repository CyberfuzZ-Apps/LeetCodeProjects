package arrays;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiagonalOrderTest {
    @Test
    public void whenMat3x3Then123456789() {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] expected = {1, 2, 4, 7, 5, 3, 6, 8, 9};
        DiagonalOrder d = new DiagonalOrder();
        int[] rsl = d.findDiagonalOrder(mat);
        Assert.assertArrayEquals(expected, rsl);
    }

}