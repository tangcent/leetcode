package com.itangcent.leetcode_26_remove_duplicates_from_sorted_array;

/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return len;
        }
        int k = 1;
        int lastNum = nums[0];
        int i = 1;
        for (; i < len; i++) {
            if (nums[i] != lastNum) {
                lastNum = nums[i];
                k++;
                continue;
            }
            break;
        }
        for (; i < len; i++) {
            if (nums[i] != lastNum) {
                nums[k] = nums[i];
                lastNum = nums[i];
                k++;
            }
        }
        return k;
    }
}
// @lc code=end

