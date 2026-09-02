package com.itangcent.leetcode_111_minimum_depth_of_binary_tree;

/*
 * @lc app=leetcode id=111 lang=java
 *
 * [111] Minimum Depth of Binary Tree
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
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) {
            return 1;
        }
        int leftDepth = root.left == null ? Integer.MAX_VALUE : minDepth(root.left);
        int rightDepth = root.right == null ? Integer.MAX_VALUE : minDepth(root.right);
        return Math.min(leftDepth, rightDepth) + 1;
    }
}
// @lc code=end

