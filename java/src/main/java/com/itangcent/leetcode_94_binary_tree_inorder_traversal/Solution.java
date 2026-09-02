package com.itangcent.leetcode_94_binary_tree_inorder_traversal;

/*
 * @lc app=leetcode id=94 lang=java
 *
 * [94] Binary Tree Inorder Traversal
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> path = new ArrayList<>();
        inorderTraversal(path, root);
        return path;
    }

    public void inorderTraversal(List<Integer> path, TreeNode node) {
        if (node == null) {
            return;
        }
        inorderTraversal(path, node.left);
        path.add(node.val);
        inorderTraversal(path, node.right);
    }
}
// @lc code=end

