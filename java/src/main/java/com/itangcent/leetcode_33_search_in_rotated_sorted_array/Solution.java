package com.itangcent.leetcode_33_search_in_rotated_sorted_array;
/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 *
 * Problem Description:
 * Given a sorted array that has been rotated at some pivot point, and a target value,
 * return the index of target if it exists in the array, otherwise return -1.
 * The array may contain duplicates.
 * 
 * Example:
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 * 
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

// @lc code=start
class Solution {
    /**
     * Searches for a target value in a rotated sorted array using modified binary search.
     * 
     * @param nums   The rotated sorted array to search in
     * @param target The value to search for
     * @return The index of target if found, -1 otherwise
     */
    public int search(int[] nums, int target) {
        int length = nums.length;
        if (length == 0) {
            return -1;
        }
        
        int left = 0;
        int right = length - 1;
        
        while (left <= right) {
            int mid = (right + left) / 2;  // Calculate middle point
            int midNum = nums[mid];
            
            // If we found the target, return its index
            if (midNum == target) {
                return mid;
            }
            
            // If left half is sorted
            if (nums[left] <= midNum) {
                // Check if target is in the left sorted portion
                if (nums[left] <= target && target < midNum) {
                    right = mid - 1;  // Search in left half
                    continue;
                } else if(midNum < target || target <= nums[right]) {
                    left = mid + 1;   // Search in right half
                    continue;
                }
            }
            
            // If right half is sorted
            if (midNum < target && target <= nums[right]) {
                left = mid + 1;       // Search in right half
                continue;
            } else if (target >= nums[left] || target < midNum) {
                right = mid - 1;      // Search in left half
                continue;
            }
            
            return -1;  // Target not found in either half
        }
        return -1;      // Target not found in array
    }
}
// @lc code=end

