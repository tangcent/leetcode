package com.itangcent.leetcode_216_combination_sum_iii;


/*
 * @lc app=leetcode id=216 lang=java
 *
 * [216] Combination Sum III
 */

import java.util.ArrayList;
import java.util.List;

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(res, path, k, n, 1);
        return res;
    }

    private void dfs(List<List<Integer>> res, List<Integer> path, int k, int n, int start) {
        if (k == 0 && n == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        
        if (k == 0 || n <= 0) {
            return;
        }
        
        for (int i = start; i <= 9; i++) {
            path.add(i);
            dfs(res, path, k - 1, n - i, i + 1);
            path.remove(path.size() - 1);
        }
    }
}
// @lc code=end

