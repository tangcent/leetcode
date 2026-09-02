package com.itangcent.leetcode_515_find_largest_value_in_each_tree_row;

import com.itangcent.leetcode_515_find_largest_value_in_each_tree_row.TreeNode;

import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=515 lang=java
 *
 * [515] Find Largest Value in Each Tree Row
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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> maxList = new ArrayList<>();
        findLargestValues(root, 0, maxList);
        return maxList;
    }

    private void findLargestValues(TreeNode treeNode, int level, List<Integer> maxList) {
        if (treeNode == null) {
            return;
        }
        if (maxList.size() <= level) {
            maxList.add(treeNode.val);
        } else if (maxList.get(level) < treeNode.val) {
            maxList.set(level, treeNode.val);
        }
        findLargestValues(treeNode.left, level + 1, maxList);
        findLargestValues(treeNode.right, level + 1, maxList);
    }
}
// @lc code=end

