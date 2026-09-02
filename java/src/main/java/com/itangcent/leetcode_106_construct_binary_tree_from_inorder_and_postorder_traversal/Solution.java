package com.itangcent.leetcode_106_construct_binary_tree_from_inorder_and_postorder_traversal;

/*
 * @lc app=leetcode id=106 lang=java
 *
 * [106] Construct Binary Tree from Inorder and Postorder Traversal
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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0) {
            return null;
        }
        return buildTree(postorder, 0, postorder.length - 1, inorder, 0, inorder.length - 1);
    }

    public TreeNode buildTree(
            int[] postorder, int postStart, int postEnd,
            int[] inorder, int inStart, int inEnd
    ) {
        int val = postorder[postEnd];
        TreeNode root = new TreeNode(val);

        int rootIndex = inStart;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == val) {
                rootIndex = i;
                break;
            }
        }
        int leftSize = rootIndex - inStart;
        int rightSize = inEnd - rootIndex;
        if (leftSize > 0) {
            root.left = buildTree(
                    postorder, postStart, postEnd - rightSize - 1,
                    inorder, inStart, rootIndex - 1
            );
        }
        if (rightSize > 0) {
            root.right = buildTree(
                    postorder, postEnd - rightSize, postEnd - 1,
                    inorder, rootIndex + 1, inEnd
            );
        }
        return root;
    }
}
// @lc code=end

