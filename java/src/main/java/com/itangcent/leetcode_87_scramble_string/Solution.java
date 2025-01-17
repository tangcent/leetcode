package com.itangcent.leetcode_87_scramble_string;

import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=87 lang=java
 *
 * [87] Scramble String
 */

// @lc code=start
class Solution {
    private final Map<String, Boolean> memo = new HashMap<>();

    public boolean isScramble(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            return false;
        }
        // Quick check for character frequency
        int[] freq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }
        for (int count : freq) {
            if (count != 0) return false;
        }
        memo.clear();
        return isScramble(s1, 0, s1.length(), s2, 0, s1.length());
    }

    public boolean isEquals(String s1, int s1Start, String s2, int s2Start, int len) {
        for (int i = 0; i < len; ++i) {
            if (s1.charAt(s1Start + i) != s2.charAt(s2Start + i)) {
                return false;
            }
        }
        return true;
    }

    public boolean isScramble(String s1, int s1Start, int s1End, String s2, int s2Start, int s2End) {
        String key = s1Start + "," + s1End + "," + s2Start;
        Boolean result = memo.get(key);
        if (result != null) {
            return result;
        }
        boolean scramble = checkIsScramble(s1, s1Start, s1End, s2, s2Start, s2End);
        memo.put(key, scramble);
        return scramble;
    }

    public boolean checkIsScramble(String s1, int s1Start, int s1End, String s2, int s2Start, int s2End) {
        int len = s1End - s1Start;

        if (len == 1) {
            return s1.charAt(s1Start) == s2.charAt(s2Start);
        }
        if (isEquals(s1, s1Start, s2, s2Start, len)) {
            return true;
        }
        for (int i = 1; i < len; ++i) {
            //keep order
            if (isScramble(s1, s1Start, s1Start + i, s2, s2Start, s2Start + i) &&
                    isScramble(s1, s1Start + i, s1End, s2, s2Start + i, s2End)) {
                return true;
            }

            //swap order
            if (isScramble(s1, s1Start, s1Start + i, s2, s2End - i, s2End) &&
                    isScramble(s1, s1Start + i, s1End, s2, s2Start, s2End - i)) {
                return true;
            }
        }
        return false;
    }
}
// @lc code=end

