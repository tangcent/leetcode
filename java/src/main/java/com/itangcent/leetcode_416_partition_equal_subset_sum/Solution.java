package com.itangcent.leetcode_416_partition_equal_subset_sum;


/*
 * @lc app=leetcode id=416 lang=java
 *
 * [416] Partition Equal Subset Sum
 */

import java.util.HashMap;
import java.util.Map;

// @lc code=start
class Solution {
    private Map<Integer, Boolean> memo = new HashMap<>();

    // DP solution - O(n*sum) time, O(sum) space
    public boolean canPartition(int[] nums) {
        int totalSum = 0;
        for (int num : nums) totalSum += num;
        if ((totalSum & 1) == 1) return false;

        int target = totalSum / 2;
        memo.clear();
        return canSum(nums, target, 0);
    }

    private boolean canSum(int[] nums, int target, int start) {
        int key = (target << 16) | start;
        if (memo.containsKey(key)) return memo.get(key);

        if (target == 0) return true;
        if (target < 0 || start >= nums.length) return false;

        boolean result = canSum(nums, target - nums[start], start + 1) ||
                canSum(nums, target, start + 1);
        memo.put(key, result);
        return result;
    }
}
// @lc code=end
