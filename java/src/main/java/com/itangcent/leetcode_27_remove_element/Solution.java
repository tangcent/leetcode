package com.itangcent.leetcode_27_remove_element;

/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        if (len < 2) {
            return len;
        }
        int k = 0;
        int i = 0;
        for (; i < len; i++) {
            if (nums[i] != val) {
                k++;
                continue;
            }
            break;
        }
        for (; i < len; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
        
    }
}
// @lc code=end

