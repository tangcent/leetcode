package com.itangcent.leetcode_58_length_of_last_word;

/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        int l = 0;
        int end = s.length() - 1;
        while (end >= 0 && isEmpty(s.charAt(end))) {
            --end;
        }

        while (end >= 0 && !isEmpty(s.charAt(end))) {
            ++l;
            --end;
        }

        return l;
    }

    private boolean isEmpty(char ch) {
        return ch == ' ' || ch == '\n' || ch == '\r';
    }
}
// @lc code=end

