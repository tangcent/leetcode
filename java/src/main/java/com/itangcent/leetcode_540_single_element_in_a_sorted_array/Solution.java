package com.itangcent.leetcode_540_single_element_in_a_sorted_array;


/*
 * @lc app=leetcode id=540 lang=java
 *
 * [540] Single Element in a Sorted Array
 */

// @lc code=start
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int latest = nums.length - 1;
        for (int i = 0; i < latest; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[latest];
    }
}
// @lc code=end

