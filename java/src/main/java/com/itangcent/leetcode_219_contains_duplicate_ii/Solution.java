package com.itangcent.leetcode_219_contains_duplicate_ii;


/*
 * @lc app=leetcode id=219 lang=java
 *
 * [219] Contains Duplicate II
 */

import java.util.HashSet;
import java.util.Set;

// @lc code=start
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int length = nums.length;
        int m = Math.min(length, k + 1);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < m; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        }
        for (int i = m; i < length; ++i) {
            set.remove(nums[i - m]);
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
// @lc code=end

