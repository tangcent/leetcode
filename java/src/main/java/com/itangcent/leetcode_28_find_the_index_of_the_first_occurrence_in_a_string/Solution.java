package com.itangcent.leetcode_28_find_the_index_of_the_first_occurrence_in_a_string;
/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Find the Index of the First Occurrence in a String
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        char[] haystackChars = haystack.toCharArray();
        char[] needleChars = needle.toCharArray();
        int haystackLen = haystackChars.length;
        int needleLen = needleChars.length;

        if (needleLen > haystackLen) return -1;

        for (int i = 0; i <= haystackLen - needleLen; i++) {
            int j;
            for (j = 0; j < needleLen; j++) {
                if (haystackChars[i + j] != needleChars[j]) {
                    break;
                }
            }
            if (j == needleLen) {
                return i;
            }
        }
        return -1;
    }
}
// @lc code=end

