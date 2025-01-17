package com.itangcent.leetcode_377_combination_sum_iv;


/*
 * @lc app=leetcode id=377 lang=java
 *
 * [377] Combination Sum IV
 */

import java.util.HashMap;
import java.util.Map;

// @lc code=start
class Solution {

    private Map<Integer, Integer> cache = new HashMap<>();

    public int combinationSum4(int[] nums, int target) {
        cache.clear();
        return combinationSum(nums, target);
    }

    public int combinationSum(int[] nums, int target) {
        if (cache.containsKey(target)) return cache.get(target);
        int res = 0;
        for (int num : nums) {
            if (num == target) {
                res += 1;
            } else if (num <= target) {
                res += combinationSum(nums, target - num);
            }
        }
        cache.put(target, res);
        return res;
    }
}
// @lc code=end

