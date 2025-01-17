package com.itangcent.leetcode_395_longest_substring_with_at_least_k_repeating_characters;


/*
 * @lc app=leetcode id=395 lang=java
 *
 * [395] Longest Substring with At Least K Repeating Characters
 */

// @lc code=start
class Solution {
    public int longestSubstring(String s, int k) {
        if (s.length() < k) {
            return 0;
        }
        int[] counts = new int[128];
        for (int i = 0; i < s.length(); i++) {
            ++counts[s.charAt(i)];
        }

        int max = 0;
        int pre = 0;
        for (int i = 0; i < s.length(); i++) {
            if (counts[s.charAt(i)] < k) {
                if (i >= pre) {
                    max = Math.max(max, longestSubstring(s.substring(pre, i), k));
                }
                pre = i + 1;
            }
        }
        if (pre == 0) {
            return s.length();
        }
        if (s.length() > pre) {
            max = Math.max(max, longestSubstring(s.substring(pre), k));
        }
        return max;
    }
}
// @lc code=end

