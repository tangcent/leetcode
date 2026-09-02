package com.itangcent.leetcode_437_path_sum_iii;

/*
 * @lc app=leetcode id=437 lang=java
 *
 * [437] Path Sum III
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
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        
        // Count paths starting from current node plus paths in subtrees
        return countPathsFromNode(root, targetSum) 
             + pathSum(root.left, targetSum) 
             + pathSum(root.right, targetSum);
    }

    private int countPathsFromNode(TreeNode node, long targetSum) {
        if (node == null) {
            return 0;
        }
        
        int count = 0;
        // If current node's value equals target, we found a path
        if (node.val == targetSum) {
            count = 1;
        }
        
        // Continue checking for paths that include current node
        count += countPathsFromNode(node.left, targetSum - node.val);
        count += countPathsFromNode(node.right, targetSum - node.val);
        
        return count;
    }
}
// @lc code=end

