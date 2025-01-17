package com.itangcent.leetcode_77_combinations;

/*
 * @lc app=leetcode id=77 lang=java
 *
 * [77] Combinations
 */

import java.util.ArrayList;
import java.util.List;

// @lc code=start
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>(k);
        dfs(result, path, n, k, 1);
        return result;
    }

    private void dfs(List<List<Integer>> result, List<Integer> path, int n, int k, int start) {
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i <= n; ++i) {
            path.add(i);
            dfs(result, path, n, k, i + 1);
            path.remove(path.size() - 1);
        }
    }
}
// @lc code=end 