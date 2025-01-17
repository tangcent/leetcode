package com.itangcent.leetcode_34_find_first_and_last_position_of_element_in_sorted_array;

/*
 * @lc app=leetcode id=34 lang=java
 *
 * [34] Find First and Last Position of Element in Sorted Array
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                break;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (left > right) {
            return new int[]{-1, -1};
        }

        // Find the first position
        int m = 0;
        int l = left;
        int r = mid;
        while (l <= r) {
            m = (l + r) / 2;
            if (nums[m] == target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        result[0] = l;

        // Find the last position
        l = mid;
        r = right;
        while (l <= r) {
            m = (l + r) / 2;
            if (nums[m] == target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        result[1] = r;

        return result;
    }
}
// @lc code=end

