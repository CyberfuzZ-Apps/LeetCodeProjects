package math;
/*
13. Roman to Integer

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together.
12 is written as XII, which is simply X + II. The number 27 is written as XXVII,
which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right.
However, the numeral for four is not IIII. Instead, the number four is written as IV.
Because the one is before the five we subtract it making four.
The same principle applies to the number nine, which is written as IX.
There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.



Example 1:

Input: s = "III"
Output: 3

Example 2:

Input: s = "IV"
Output: 4

Example 3:

Input: s = "IX"
Output: 9

Example 4:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.

Example 5:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

Constraints:

1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].

Hint:
Problem is simpler to solve by working the string from back to front and using a map.

Success
Details
Runtime: 3 ms, faster than 99.81% of Java online submissions for Roman to Integer.
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        int number = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[chars.length - 1 - i] == 'I') {
                number += 1;
                continue;
            }
            if (chars[chars.length - 1 - i] == 'V') {
                number += 5;
                if (i != chars.length - 1 && chars[chars.length - 2 - i] == 'I') {
                    number -= 1;
                    i++;
                }
                continue;
            }
            if (chars[chars.length - 1 - i] == 'X') {
                number += 10;
                if (i != chars.length - 1 && chars[chars.length - 2 - i] == 'I') {
                    number -= 1;
                    i++;
                }
                continue;
            }
            if (chars[chars.length - 1 - i] == 'L') {
                number += 50;
                if (i != chars.length - 1 && chars[chars.length - 2 - i] == 'X') {
                    number -= 10;
                    i++;
                }
                continue;
            }
            if (chars[chars.length - 1 - i] == 'C') {
                number += 100;
                if (i != chars.length - 1 && chars[chars.length - 2 - i] == 'X') {
                    number -= 10;
                    i++;
                }
                continue;
            }
            if (chars[chars.length - 1 - i] == 'D') {
                number += 500;
                if (i != chars.length - 1 && chars[chars.length - 2 - i] == 'C') {
                    number -= 100;
                    i++;
                }
                continue;
            }
            if (chars[chars.length - 1 - i] == 'M') {
                number += 1000;
                if (i != chars.length - 1 && chars[chars.length - 2 - i] == 'C') {
                    number -= 100;
                    i++;
                }
            }
        }
        return number;
    }
}
