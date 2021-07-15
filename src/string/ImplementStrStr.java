package string;
/*
28. Implement strStr()

Return the index of the first occurrence of needle in haystack,
or -1 if needle is not part of haystack.

Clarification:

What should we return when needle is an empty string?
This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string.
This is consistent to C's strstr() and Java's indexOf().



Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2

Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1

Example 3:

Input: haystack = "", needle = ""
Output: 0

Constraints:

0 <= haystack.length, needle.length <= 5 * 104
haystack and needle consist of only lower-case English characters.
 */
public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        if (!haystack.contains(needle)) {
            return -1;
        }
        int pointHaystack = 0;
        int rsl = 0;
        boolean contains = false;
        while (pointHaystack != haystack.length() && !contains) {
            if (haystack.charAt(pointHaystack) != needle.charAt(0)) {
                pointHaystack++;
                rsl = -1;
            } else {
                rsl = pointHaystack;
                contains = true;
                for (int i = 0; i < needle.length(); i++) {
                    if (haystack.charAt(pointHaystack++) != needle.charAt(i)) {
                        pointHaystack = rsl + 1;
                        rsl = -1;
                        contains = false;
                        break;
                    }
                }
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        ImplementStrStr i = new ImplementStrStr();
        int rsl = i.strStr("mississippi", "issip");
        System.out.println(rsl); // 4
    }
}
