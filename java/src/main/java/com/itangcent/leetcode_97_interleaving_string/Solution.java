package com.itangcent.leetcode_97_interleaving_string;

/*
 * @lc app=leetcode id=97 lang=java
 *
 * [97] Interleaving String
 */

import java.util.Map;

// @lc code=start
class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        return isInterleave(s1, s2, s3, 0, 0, 0);
    }

    private final Map<Integer, Boolean> cache = new java.util.HashMap<>();

    public boolean isInterleave(String s1, String s2, String s3,
                                int i, int j, int k) {
        if (k == s3.length()) {
            return true;
        }
        int idx = i << 16 | j;
        if (cache.get(idx) == Boolean.FALSE) {
            return false;
        }
        if (i < s1.length() && s1.charAt(i) == s3.charAt(k)) {
            if (isInterleave(s1, s2, s3, i + 1, j, k + 1)) {
                return true;
            }
        }
        if (j < s2.length() && s2.charAt(j) == s3.charAt(k)) {
            if (isInterleave(s1, s2, s3, i, j + 1, k + 1)) {
                return true;
            }
        }
        cache.put(idx, Boolean.FALSE);
        return false;
    }
}
// @lc code=end

