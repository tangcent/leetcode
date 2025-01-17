package com.itangcent.leetcode_128_longest_consecutive_sequence;


/*
 * @lc app=leetcode id=128 lang=java
 *
 * [128] Longest Consecutive Sequence
 */

import java.util.HashMap;
import java.util.Map;

// @lc code=start
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        int maxLength = 1;
        
        for (int num : nums) {
            if (map.containsKey(num)) continue;
            
            int left = map.getOrDefault(num - 1, 0);
            int right = map.getOrDefault(num + 1, 0);
            int currentLength = left + right + 1;
            
            // Update the length for the current number
            map.put(num, currentLength);
            
            // Update the length for the boundaries
            if (left > 0) map.put(num - left, currentLength);
            if (right > 0) map.put(num + right, currentLength);
            
            maxLength = Math.max(maxLength, currentLength);
        }
        
        return maxLength;
    }
}
// @lc code=end

