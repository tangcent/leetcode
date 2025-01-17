package com.itangcent.leetcode_189_rotate_array;


/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        if (length <= 1 || k % length == 0) {
            return;
        }

        k = k % length;

        //Input: nums = [1,2,3,4,5,6,7], k = 3
        //Output: [5,6,7,1,2,3,4]

        // 1. Reverse the entire array
        // [1,2,3,4,5,6,7] -> [7,6,5,4,3,2,1]
        reverse(nums, 0, length - 1);

        // 2. Reverse the first k elements
        // [7,6,5,4,3,2,1] -> [5,6,7,4,3,2,1]
        reverse(nums, 0, k - 1);

        // 3. Reverse the last n-k elements
        // [5,6,7,4,3,2,1] -> [5,6,7,1,2,3,4]
        reverse(nums, k, length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
// @lc code=end

