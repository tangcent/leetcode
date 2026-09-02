package com.itangcent.leetcode_53_maximum_subarray;

/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        return maxSubArray(nums, 0, nums.length - 1);
    }

    public int maxSubArray(int[] nums, int start, int end) {
        return max(getLeftMax(nums, start, end), getMidMax(nums, start, end), getRightMax(nums, start, end));
    }

    public int getMidMax(int[] nums, int start, int end) {
        if (start > end) {
            return 0;
        }
        if (start == end) {
            return nums[start];
        }
        int mid = (start + end) / 2;
        return max(getMidMax(nums, start, mid), getMidMax(nums, mid + 1, end), getRightMax(nums, start, mid) + getLeftMax(nums, mid + 1, end));
    }


    private int getLeftMax(int[] nums, int start, int end) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = start; i <= end; ++i) {
            sum += nums[i];
            max = Math.max(max, sum);
        }
        return max;
    }

    private int getRightMax(int[] nums, int start, int end) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = end; i >= start; --i) {
            sum += nums[i];
            max = Math.max(max, sum);
        }
        return max;
    }

    private int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
// @lc code=end

