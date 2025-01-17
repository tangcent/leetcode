package com.itangcent.leetcode_396_rotate_function;


/*
 * @lc app=leetcode id=396 lang=java
 *
 * [396] Rotate Function
 */

// @lc code=start
class Solution {
    public int maxRotateFunction(int[] nums) {
        int singleCircle = 0;
        for (int num : nums) {
            singleCircle += num;
        }

        int total = 0;
        int index = 0;
        for (int num : nums) {
            total += (index * num);
            ++index;
        }

        int max = total;
        int length = nums.length;
        for (int i = length - 1; i >= 0; i--) {
            int rotateTotal = total + singleCircle - nums[i] * length;
            if (rotateTotal > max) {
                max = rotateTotal;
            }
            total = rotateTotal;
        }
        return max;
    }
}
// @lc code=end

