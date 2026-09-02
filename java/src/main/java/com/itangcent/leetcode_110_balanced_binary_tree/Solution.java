package com.itangcent.leetcode_110_balanced_binary_tree;

/*
 * @lc app=leetcode id=110 lang=java
 *
 * [110] Balanced Binary Tree
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
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return getDeep(root) != null;
    }

    public Integer getDeep(TreeNode root) {
        if (root == null) return 0;
        Integer deepLeft = getDeep(root.left);
        if (deepLeft == null) return null;
        Integer deepRight = getDeep(root.right);
        if (deepRight == null) return null;
        if (Math.abs(deepLeft - deepRight) > 1) {
            return null;
        }
        return Math.max(deepLeft, deepRight) + 1;
    }
}
// @lc code=end

