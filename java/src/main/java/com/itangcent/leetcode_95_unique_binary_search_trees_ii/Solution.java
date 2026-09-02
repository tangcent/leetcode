package com.itangcent.leetcode_95_unique_binary_search_trees_ii;

/*
 * @lc app=leetcode id=95 lang=java
 *
 * [95] Unique Binary Search Trees II
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> result = new ArrayList<>();
        result.add(new TreeNode(1));
        for (int i = 1; i < n; i++) {
            int value = i + 1;
            result = result.stream()
                    .flatMap(treeNode -> insert(treeNode, value).stream())
                    .collect(Collectors.toList());
        }
        return result;
    }

    private List<TreeNode> insert(TreeNode node, int value) {
        List<TreeNode> treeList = new ArrayList<>();

        if (value > node.val) {
            //append as root
            if (value > getMax(node)) {
                TreeNode root = new TreeNode(value);
                root.left = node;
                treeList.add(root);
            }

            // append as child
            if (node.right != null) {
                List<TreeNode> rightTrees = insert(node.right, value);
                for (TreeNode rightTree : rightTrees) {
                    TreeNode newRoot = copyWithoutRight(node);
                    newRoot.right = rightTree;
                    treeList.add(newRoot);
                }
            } else {
                TreeNode newRoot = copy(node);
                newRoot.right = new TreeNode(value);
                treeList.add(newRoot);
            }
        } else {
            // append as root
            if (value < getMin(node)) {
                TreeNode root = new TreeNode(value);
                root.right = node;
                treeList.add(root);
            }

            //append as child
            if (node.left != null) {
                List<TreeNode> leftTrees = insert(node.left, value);
                for (TreeNode leftTree : leftTrees) {
                    TreeNode newRoot = copyWithoutLeft(node);
                    newRoot.left = leftTree;
                    treeList.add(newRoot);
                }
            } else {
                TreeNode newRoot = copy(node);
                newRoot.left = new TreeNode(value);
                treeList.add(newRoot);
            }
        }

        return treeList;
    }

    private int getMax(TreeNode node) {
        int max = node.val;
        while (node.right != null) {
            max = node.right.val;
            node = node.right;
        }
        return max;
    }

    private int getMin(TreeNode node) {
        int min = node.val;
        while (node.left != null) {
            min = node.left.val;
            node = node.left;
        }
        return min;
    }

    private TreeNode copyWithoutLeft(TreeNode node) {
        TreeNode newNode = new TreeNode(node.val);
        newNode.right = copy(node.right);
        return newNode;
    }

    private TreeNode copyWithoutRight(TreeNode node) {
        TreeNode newNode = new TreeNode(node.val);
        newNode.left = copy(node.left);
        return newNode;
    }

    private TreeNode copy(TreeNode node) {
        if (node == null) return null;
        TreeNode newNode = new TreeNode(node.val);
        newNode.left = copy(node.left);
        newNode.right = copy(node.right);
        return newNode;
    }
}
// @lc code=end

