package com.itangcent.leetcode_337_house_robber_iii;

/*
 * @lc app=leetcode id=337 lang=java
 *
 * [337] House Robber III
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

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
    public int rob(TreeNode root) {
        cache.clear();
        return rob("", root, true);
    }

    private Map<String, Integer> cache = new HashMap<>();

    public int rob(String path, TreeNode root, boolean canRob) {
        if (root == null) {
            return 0;
        }
        String key = path + (canRob ? "c" : "");
        if (cache.containsKey(key)) {
            return cache.get(key);
        }

        int notRobThis = rob(path + "l", root.left, true) + rob(path + "r", root.right, true);
        if (!canRob) {
            return notRobThis;
        }
        int robThis = root.val + rob(path + "l", root.left, false) + rob(path + "r", root.right, false);
        int value = Math.max(notRobThis, robThis);
        cache.put(key, value);
        return value;
    }
}
// @lc code=end

