package com.itangcent.leetcode_108_convert_sorted_array_to_binary_search_tree;

/*
 * @lc app=leetcode id=108 lang=java
 *
 * [108] Convert Sorted Array to Binary Search Tree
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
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    public TreeNode sortedArrayToBST(int[] nums, int left, int right) {
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        if (left < mid) {
            root.left = sortedArrayToBST(nums, left, mid - 1);
        }
        if (right > mid) {
            root.right = sortedArrayToBST(nums, mid + 1, right);
        }
        return root;
    }
}
// @lc code=end

