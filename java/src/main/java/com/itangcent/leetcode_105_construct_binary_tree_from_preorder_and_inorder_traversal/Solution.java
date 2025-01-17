package com.itangcent.leetcode_105_construct_binary_tree_from_preorder_and_inorder_traversal;

/*
 * @lc app=leetcode id=105 lang=java
 *
 * [105] Construct Binary Tree from Preorder and Inorder Traversal
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }
        return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    public TreeNode buildTree(
            int[] preorder, int preStart, int preEnd,
            int[] inorder, int inStart, int inEnd
    ) {
        TreeNode root = new TreeNode(preorder[preStart]);
        int rootIndex = inStart;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == preorder[preStart]) {
                rootIndex = i;
                break;
            }
        }
        int leftSize = rootIndex - inStart;
        int rightSize = inEnd - rootIndex;
        if (leftSize > 0) {
            root.left = buildTree(
                    preorder, preStart + 1, preStart + leftSize,
                    inorder, inStart, rootIndex - 1
            );
        }
        if (rightSize > 0) {
            root.right = buildTree(
                    preorder, preStart + 1 + leftSize, preEnd,
                    inorder, rootIndex + 1, inEnd
            );
        }
        return root;
    }
}
// @lc code=end

