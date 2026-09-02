package com.itangcent.leetcode_47_permutations_ii;
/*
 * @lc app=leetcode id=47 lang=java
 *
 * [47] Permutations II
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// @lc code=start
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> initialPath = new ArrayList<>();
        initialPath.add(nums[0]);
        result.add(initialPath);
        for (int i = 1; i < nums.length; i++) {
            result = appendNum(result, nums[i]);
        }
        return result;
    }

    private static List<List<Integer>> appendNum(List<List<Integer>> result, int num) {
        List<List<Integer>> newResult = new ArrayList<>();
        for (List<Integer> path : result) {
            // For each existing permutation, try inserting the new number
            // at each position, but skip if it would create a duplicate
            for (int j = 0; j <= path.size(); j++) {
                boolean shouldSkip = isShouldSkip(num, path, j);
                if (shouldSkip) continue;

                List<Integer> newPath = new ArrayList<>(path);
                newPath.add(j, num);
                newResult.add(newPath);
            }
        }
        result = newResult;
        return result;
    }

    private static boolean isShouldSkip(int num, List<Integer> path, int end) {
        // Skip if inserting at this position would create a duplicate
        // by checking all previous positions
        boolean shouldSkip = false;
        for (int i = 0; i < end; i++) {
            if (path.get(i) == num) {
                shouldSkip = true;
                break;
            }
        }
        return shouldSkip;
    }
}
// @lc code=end

