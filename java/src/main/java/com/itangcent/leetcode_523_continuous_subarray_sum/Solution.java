package com.itangcent.leetcode_523_continuous_subarray_sum;


/*
 * @lc app=leetcode id=523 lang=java
 *
 * [523] Continuous Subarray Sum
 */

import java.util.HashMap;
import java.util.Map;

// @lc code=start
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> remainders = new HashMap<>();
        remainders.put(0, -1);

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
            count %= k;
            if (remainders.containsKey(count)) {
                if (i - remainders.get(count) > 1) {
                    return true;
                }
            } else {
                remainders.put(count, i);
            }
        }
        return false;
    }
}
// @lc code=end

