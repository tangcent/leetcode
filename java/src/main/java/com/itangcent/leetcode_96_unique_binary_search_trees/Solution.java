package com.itangcent.leetcode_96_unique_binary_search_trees;

/*
 * @lc app=leetcode id=96 lang=java
 *
 * [96] Unique Binary Search Trees
 */

import java.util.HashMap;
import java.util.Map;

// @lc code=start
class Solution {
    private final Map<Integer, Integer> cache = new HashMap<>();

    public int numTrees(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        Integer cachedValue = cache.get(n);
        if (cachedValue != null) {
            return cachedValue;
        }

        int res = 0;
        for (int i = 1; i <= n; i++) {
            // The number of unique BSTs with i as the root is equal to the number of unique
            // BSTs that can be formed with the left and right subtrees.
            int leftTrees = numTrees(i - 1); // Number of unique BSTs in the left subtree
            int rightTrees = numTrees(n - i); // Number of unique BSTs in the right subtree
            res += leftTrees * rightTrees; // Multiply them to get the total count for this root
        }
        cache.put(n, res);
        return res;
    }
}
// @lc code=end

