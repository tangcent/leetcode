package com.itangcent.leetcode_129_sum_root_to_leaf_numbers;

/*
 * @lc app=leetcode id=129 lang=java
 *
 * [129] Sum Root to Leaf Numbers
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
    public int sumNumbers(TreeNode root) {
        return sumNumbers(0, root);
    }

    public int sumNumbers(int parent, TreeNode root) {
        if (root == null) return 0;
        int number = parent * 10 + root.val;
        if (root.left == null && root.right == null) {
            return number;
        }
        return sumNumbers(number, root.left) + sumNumbers(number, root.right);
    }
}
// @lc code=end

