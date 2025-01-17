package com.itangcent.leetcode_525_contiguous_array;


/*
 * @lc app=leetcode id=525 lang=java
 *
 * [525] Contiguous Array
 */

import java.util.HashMap;
import java.util.Map;

// @lc code=start
class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // Initialize with count 0 at index -1
        int maxLen = 0;
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            count += (nums[i] == 1) ? 1 : -1;
            if (map.containsKey(count)) {
                maxLen = Math.max(maxLen, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxLen;
    }
}
// @lc code=end
