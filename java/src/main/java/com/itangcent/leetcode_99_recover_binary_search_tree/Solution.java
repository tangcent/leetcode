package com.itangcent.leetcode_99_recover_binary_search_tree;

/*
 * @lc app=leetcode id=99 lang=java
 *
 * [99] Recover Binary Search Tree
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
    private TreeNode first = null;
    private TreeNode second = null;
    private TreeNode pre = null;

    public void recoverTree(TreeNode root) {
        first = null;
        second = null;
        pre = null;

        inOrder(root);

        if (first != null && second != null) {
            int temp = first.val;
            first.val = second.val;
            second.val = temp;
        }
    }

    private void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);

        if (pre != null && root.val < pre.val) {
            if (first == null) {
                first = pre;
            }
            second = root;
        }

        pre = root;

        inOrder(root.right);
    }
}
// @lc code=end

