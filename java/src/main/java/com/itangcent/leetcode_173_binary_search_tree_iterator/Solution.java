package com.itangcent.leetcode_173_binary_search_tree_iterator;

import com.itangcent.leetcode_173_binary_search_tree_iterator.TreeNode;

import java.rmi.NoSuchObjectException;
import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode id=173 lang=java
 *
 * [173] Binary Search Tree Iterator
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
class BSTIterator {

    private LinkedList<TreeNode> queue = new LinkedList<TreeNode>();

    public BSTIterator(TreeNode root) {
        pushNode(root);
    }

    public int next() {
        TreeNode node = queue.pop();
        if (node.right != null) {
            pushNode(node.right);
        }
        return node.val;
    }

    public boolean hasNext() {
        return !queue.isEmpty();
    }

    private void pushNode(TreeNode node) {
        do {
            queue.push(node);
            node = node.left;
        } while (node != null);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
// @lc code=end

