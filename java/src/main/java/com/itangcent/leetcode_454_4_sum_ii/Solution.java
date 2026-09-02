package com.itangcent.leetcode_454_4_sum_ii;


/*
 * @lc app=leetcode id=454 lang=java
 *
 * [454] 4Sum II
 */

import java.util.*;

// @lc code=start
class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Long, Integer> counts = new HashMap<>();
        for (int num : nums1) {
            counts.put((long) num, counts.getOrDefault((long) num, 0) + 1);
        }
        counts = appendNums(counts, nums2);
        counts = appendNums(counts, nums3);
        counts = appendNums(counts, nums4);
        return counts.getOrDefault(0L, 0);
    }

    private Map<Long, Integer> appendNums(Map<Long, Integer> counts, int[] nums) {
        Map<Long, Integer> newCounts = new HashMap<>(counts.size() + nums.length);
        for (Map.Entry<Long, Integer> entry : counts.entrySet()) {
            long num1 = entry.getKey();
            int count = entry.getValue();
            for (int num : nums) {
                long sum = num1 + num;
                newCounts.put(sum, newCounts.getOrDefault(sum, 0) + count);
            }
        }
        return newCounts;
    }
}
// @lc code=end

