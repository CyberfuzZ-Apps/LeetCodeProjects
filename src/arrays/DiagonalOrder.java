package arrays;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
498. Diagonal Traverse

Solution
Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.

Example 1:

Input: mat = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,4,7,5,3,6,8,9]

Example 2:

Input: mat = [[1,2],[3,4]]
Output: [1,2,3,4]

Constraints:

m == mat.length
n == mat[i].length
1 <= m, n <= 104
1 <= m * n <= 104
-105 <= mat[i][j] <= 105
 */
public class DiagonalOrder {
    public int[] findDiagonalOrder(int[][] mat) {
        int[] rsl = new int[mat.length * mat[0].length];
        if (rsl.length == 1) {
            rsl[0] = mat[0][0];
        }
        int indexRow = 0;
        int indexCell = 0;
        for (int i = 0; i < rsl.length; i++) {
            rsl[i] = mat[indexRow][indexCell];
            if ((indexRow + indexCell) % 2 == 0) {
                if (indexCell == mat[0].length - 1) {
                    indexRow++;
                } else if (indexRow == 0) {
                    indexCell++;
                } else {
                    indexCell++;
                    indexRow--;
                }
            } else {
                if (indexRow == mat.length - 1) {
                    indexCell++;
                } else if (indexCell == 0) {
                    indexRow++;
                } else {
                    indexCell--;
                    indexRow++;
                }
            }
        }
        return rsl;
    }
}

/**
 * Тут я тренируюсь создавать собственные аннотации
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {       //собственная аннотация
    String OS() default "Android";
    int yearOfCompanyCreation() default 2010;
}

@SmartPhone
class Xiaomi {
    private String model;
    private double price;
}

@SmartPhone(OS = "IOS", yearOfCompanyCreation = 1976)
class IPhone {
    private String model;
    private double price;

}
