package com.itangcent.leetcode_80_remove_duplicates_from_sorted_array_ii;

/*
 * @lc app=leetcode id=80 lang=java
 *
 * [80] Remove Duplicates from Sorted Array II
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int current = 0;
        int count = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (count == 0 || num != current) {
                current = num;
                count = 1;
            } else if (count == 2) {
                continue;
            } else {
                count++;
            }
            if(index!=i){
               nums[index] = num;
            }
            index++;
        }
        return index;
    }
}
// @lc code=end

