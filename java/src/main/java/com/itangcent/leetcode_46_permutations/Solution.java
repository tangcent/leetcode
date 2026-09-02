package com.itangcent.leetcode_46_permutations;

/*
 * @lc app=leetcode id=46 lang=java
 *
 * [46] Permutations
 */

import java.util.ArrayList;
import java.util.List;

// @lc code=start
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> initialPath = new ArrayList<>();
        initialPath.add(nums[0]);
        result.add(initialPath);
        for (int i = 1; i < nums.length; i++) {
            appendNum(nums[i], result);
        }
        return result;
    }

    private void appendNum(int num, List<List<Integer>> result) {
        List<List<Integer>> newResult = new ArrayList<>();
        for (List<Integer> path : result) {
            for (int i = 0; i <= path.size(); i++) {
                List<Integer> newPath = new ArrayList<>(path);
                newPath.add(i, num);
                newResult.add(newPath);
            }
        }
        result.clear();
        result.addAll(newResult);
    }
}
// @lc code=end

