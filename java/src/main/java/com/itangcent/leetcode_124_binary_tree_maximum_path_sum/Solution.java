package com.itangcent.leetcode_124_binary_tree_maximum_path_sum;

/*
 * @lc app=leetcode id=124 lang=java
 *
 * [124] Binary Tree Maximum Path Sum
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
    private int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        maxSidePathSum(root);
        return maxSum;
    }

    public int maxSidePathSum(TreeNode root) {
        if (root == null) return 0;
        int left = maxSidePathSum(root.left);
        int right = maxSidePathSum(root.right);
        maxSum = Math.max(root.val, Math.max(maxSum, root.val + left + right));
        int sideMaxSum = root.val + Math.max(0, Math.max(left, right));
        maxSum = Math.max(maxSum, sideMaxSum);
        return sideMaxSum;
    }
}
// @lc code=end

