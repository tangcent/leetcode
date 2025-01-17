package com.itangcent.leetcode_454_4_sum_ii;


/*
 * @lc app=leetcode id=454 lang=java
 *
 * [454] 4Sum II
 */

import java.util.HashMap;
import java.util.Map;

// @lc code=start
class Solution2 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        // First compute all possible sums of nums1 + nums2 with their counts
        Map<Integer, Integer> sumCounts = new HashMap<>();
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                int sum = num1 + num2;
                sumCounts.put(sum, sumCounts.getOrDefault(sum, 0) + 1);
            }
        }
        
        // Then check all possible sums of nums3 + nums4 against the complement
        int result = 0;
        for (int num3 : nums3) {
            for (int num4 : nums4) {
                int complement = -(num3 + num4);
                result += sumCounts.getOrDefault(complement, 0);
            }
        }
        return result;
    }
}
// @lc code=end
