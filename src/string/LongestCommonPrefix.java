package string;
/*
14. Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lower-case English letters.
 */
public class LongestCommonPrefix {
    public String longestPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        } else if (strs.length == 0) {
            return "";
        }
        String rsl = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(rsl) != 0) {
                rsl = rsl.substring(0, rsl.length() - 1);
                if (rsl.isEmpty()) {
                    return "";
                }
            }
        }
        return rsl;
    }
}
