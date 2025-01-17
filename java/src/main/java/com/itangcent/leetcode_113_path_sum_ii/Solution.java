package com.itangcent.leetcode_113_path_sum_ii;

import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=113 lang=java
 *
 * [113] Path Sum II
 */

// @lc code=start

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        pathSum(root, targetSum, new ArrayList<>(), result);
        return result;
    }

    private void pathSum(TreeNode root, int targetSum, List<Integer> path, List<List<Integer>> result) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            if (root.val == targetSum) {
                List<Integer> list = new ArrayList<>(path);
                list.add(root.val);
                result.add(list);
            }
            return;
        }
        int remain = targetSum - root.val;
        path.add(root.val);
        pathSum(root.left, remain, path, result);
        pathSum(root.right, remain, path, result);
        path.remove(path.size() - 1);
    }
}
// @lc code=end

