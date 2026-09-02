package com.itangcent.leetcode_90_subsets_ii;

/*
 * @lc app=leetcode id=90 lang=java
 *
 * [90] Subsets II
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// @lc code=start
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        result.add(Collections.emptyList());
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> path, int[] nums, int start) {
        for (int i = start; i < nums.length; i++) {
            // skip duplicates
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            path.add(nums[i]);
            result.add(new ArrayList<>(path)); // add the current subset
            backtrack(result, path, nums, i + 1); // move to the next element
            path.remove(path.size() - 1); // backtrack
        }
    }
}
// @lc code=end

