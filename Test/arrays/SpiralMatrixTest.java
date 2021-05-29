package arrays;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SpiralMatrixTest {
    @Test
    public void when3x3Matrix() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> expectedList =
                new ArrayList<>(Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5));
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        List<Integer> actualList = spiralMatrix.spiralOrder(matrix);
        assertThat(actualList, is(expectedList));
    }

    @Test
    public void when4x3Matrix() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        List<Integer> expectedList =
                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7));
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        List<Integer> actualList = spiralMatrix.spiralOrder(matrix);
        assertThat(actualList, is(expectedList));
    }

    @Test
    public void when1x1Matrix() {
        int[][] matrix = {
                {1}
        };
        List<Integer> expectedList =
                new ArrayList<>(Arrays.asList(1));
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        List<Integer> actualList = spiralMatrix.spiralOrder(matrix);
        assertThat(actualList, is(expectedList));
    }

    @Test
    public void when0Matrix() {
        int[][] matrix = {
                {}
        };
        List<Integer> expectedList =
                new ArrayList<>();
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        List<Integer> actualList = spiralMatrix.spiralOrder(matrix);
        assertThat(actualList, is(expectedList));
    }
}