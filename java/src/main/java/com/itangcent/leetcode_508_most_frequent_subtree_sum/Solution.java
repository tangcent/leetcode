package com.itangcent.leetcode_508_most_frequent_subtree_sum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode id=508 lang=java
 *
 * [508] Most Frequent Subtree Sum
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

    Map<Integer, Integer> counts = new HashMap<>();

    public int[] findFrequentTreeSum(TreeNode root) {
        counts.clear();
        sum(root);
        int max = 0;
        List<Integer> nums = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            int count = entry.getValue();
            if (count > max) {
                max = count;
                nums.clear();
                nums.add(entry.getKey());
            } else if (count == max) {
                nums.add(entry.getKey());
            }
        }
        int[] res = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            Integer num = nums.get(i);
            res[i] = num;
        }
        return res;
    }

    private int sum(TreeNode node) {
        if (node == null) return 0;
        int num = node.val + sum(node.left) + sum(node.right);
        counts.put(num, counts.getOrDefault(num, 0) + 1);
        return num;
    }
}
// @lc code=end

