package com.itangcent.leetcode_78_subsets;

/*
 * @lc app=leetcode id=78 lang=java
 *
 * [78] Subsets
 */

import java.util.ArrayList;
import java.util.List;

// @lc code=start
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(result, path, nums, 0);
        return result;
    }

    private void dfs(List<List<Integer>> result, List<Integer> path, int[] nums, int start) {
        result.add(new ArrayList<>(path));
        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            dfs(result, path, nums, i + 1);
            path.remove(path.size() - 1);
        }
    }
}
// @lc code=end

