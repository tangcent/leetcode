package com.itangcent.leetcode_513_find_bottom_left_tree_value;

/*
 * @lc app=leetcode id=513 lang=java
 *
 * [513] Find Bottom Left Tree Value
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
    public int findBottomLeftValue(TreeNode root) {
        return findBottomLeftValueWithLevel(root, 0).val;
    }

    private Pair findBottomLeftValueWithLevel(TreeNode root, int level) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            return new Pair(root.val, level);
        }
        if (root.left == null) {
            return findBottomLeftValueWithLevel(root.right, level + 1);
        } else if (root.right == null) {
            return findBottomLeftValueWithLevel(root.left, level + 1);
        }
        Pair left = findBottomLeftValueWithLevel(root.left, level + 1);
        Pair right = findBottomLeftValueWithLevel(root.right, level + 1);

        if (right.level > left.level) {
            return right;
        } else {
            return left;
        }
    }

    private static class Pair {
        int val;
        int level;

        public Pair(int val, int level) {
            this.val = val;
            this.level = level;
        }
    }
}
// @lc code=end

