package com.itangcent.leetcode_491_non_decreasing_subsequences;


/*
 * @lc app=leetcode id=491 lang=java
 *
 * [491] Non-decreasing Subsequences
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// @lc code=start
class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 2) {
            return result;
        }
        List<Integer> path = new ArrayList<>();
        dfs(nums, result, path, 0);
        return result;
    }

    private void dfs(int[] nums, List<List<Integer>> result, List<Integer> path, int start) {
        Set<Integer> used = new HashSet<>();
        for (int i = start; i < nums.length; i++) {
            int num = nums[i];
            if (!path.isEmpty() && num < path.get(path.size() - 1)) {
                continue;
            }
            if (used.contains(num)) {
                continue;
            }
            
            used.add(num);
            path.add(num);
            if (path.size() >= 2) {
                result.add(new ArrayList<>(path));
            }
            dfs(nums, result, path, i + 1);
            path.remove(path.size() - 1);
        }
    }
}
// @lc code=end
