/*
7. Reverse Integer

Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer range
[-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:

Input: x = 123
Output: 321

Example 2:

Input: x = -123
Output: -321

Example 3:

Input: x = 120
Output: 21

Example 4:

Input: x = 0
Output: 0

Constraints:

-231 <= x <= 231 - 1
 */
public class ReverseInteger {
    public static int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        StringBuilder stringBuilder = new StringBuilder();
        String strIn = String.valueOf(x);
        String[] strInArray = strIn.split("");
        for (int i = 0; i < strInArray.length; i++) {
            stringBuilder.append(strInArray[strInArray.length - 1 - i]);
        }
        try {
            if ("-".equals(strInArray[0])) {
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                return Integer.parseInt(stringBuilder.toString()) * -1;
            }
            return Integer.parseInt(stringBuilder.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(ReverseInteger.reverse(-12345));
    }
}
