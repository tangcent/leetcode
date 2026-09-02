package com.itangcent.leetcode_76_minimum_window_substring;

/*
 * @lc app=leetcode id=76 lang=java
 *
 * [76] Minimum Window Substring
 */

// @lc code=start
class Solution {
    public String minWindow(String s, String t) {
        int[] charCount = new int[128];
        for (char c : t.toCharArray()) {
            charCount[c]++;
        }

        int left = 0;
        int right = 0;
        int count = t.length();
        if (count == 0) {
            return "";
        }

        int minStart = -1;
        int minLen = Integer.MAX_VALUE;

        int len = s.length();
        if (len < count) {
            return "";
        }

        while (right < len) {
            if (--charCount[s.charAt(right)] >= 0) {
                --count;
            }

            while (count == 0) {
                int currLen = right - left;
                if (currLen < minLen) {
                    minLen = currLen;
                    minStart = left;
                }

                do {
                    if (++charCount[s.charAt(left)] > 0) {
                        ++count;
                    }
                    left++;
                } while (left < right && charCount[s.charAt(left)] < 0);
            }

            right++;
        }

        if (minStart == -1) {
            return "";
        }
        return s.substring(minStart, minStart + minLen + 1);
    }
}
// @lc code=end

