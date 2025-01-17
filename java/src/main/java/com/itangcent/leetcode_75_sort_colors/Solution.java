package com.itangcent.leetcode_75_sort_colors;

/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        int left = 0, right = nums.length - 1;
        for (int i = 0; i <= right; i++) {
            if (nums[i] == 0) {
                swap(nums, i, left);
                left++;
            } else if (nums[i] == 2) {
                swap(nums, i, right);
                right--;
                i--;
            }
        }
    }
    
    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        if (temp == nums[b]) {
            return;
        }
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
// @lc code=end 