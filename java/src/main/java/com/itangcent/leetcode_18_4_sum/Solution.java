package com.itangcent.leetcode_18_4_sum;

/*
 * @lc app=leetcode id=18 lang=java
 *
 * [18] 4Sum
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) return result;

        Arrays.sort(nums);
        int n = nums.length;
        long longTarget = target; // Convert target to long once

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicates
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue; // skip duplicates
                int left = j + 1, right = n - 1;
                long twoSum = (long) nums[i] + nums[j]; // Use long for sum
                while (left < right) {
                    long sum = twoSum + nums[left] + nums[right]; // Use long for sum
                    if (sum == longTarget) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) left++; // skip duplicates
                        while (left < right && nums[right] == nums[right - 1]) right--; // skip duplicates
                        left++;
                        right--;
                    } else if (sum < longTarget) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}
// @lc code=end

