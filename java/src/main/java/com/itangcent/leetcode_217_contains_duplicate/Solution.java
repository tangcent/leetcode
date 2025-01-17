package com.itangcent.leetcode_217_contains_duplicate;


/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

import java.util.HashSet;

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) return true;
        }
        return false;
    }
}
// @lc code=end

