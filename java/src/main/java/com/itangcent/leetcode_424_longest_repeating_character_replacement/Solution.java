package com.itangcent.leetcode_424_longest_repeating_character_replacement;


/*
 * @lc app=leetcode id=424 lang=java
 *
 * [424] Longest Repeating Character Replacement
 */

// @lc code=start
class Solution {
    public int characterReplacement(String s, int k) {
        if (s.isEmpty()) {
            return 0;
        }
        int[] counts = new int[128];
        int maxLength = 0;
        int maxCount = 0;
        int left = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            counts[ch]++;
            maxCount = Math.max(maxCount, counts[ch]);
            
            int windowSize = right - left + 1;
            if (windowSize - maxCount > k) {
                counts[s.charAt(left)]--;
                left++;
            } else {
                maxLength = Math.max(maxLength, windowSize);
            }
        }
        return maxLength;
    }
}
// @lc code=end
