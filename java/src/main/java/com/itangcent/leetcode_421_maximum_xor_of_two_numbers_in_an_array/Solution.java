package com.itangcent.leetcode_421_maximum_xor_of_two_numbers_in_an_array;

/*
 * @lc app=leetcode id=421 lang=java
 *
 * [421] Maximum XOR of Two Numbers in an Array
 */

// @lc code=start
class Solution {
    private static class TrieNode {
        TrieNode[] children = new TrieNode[2];
    }

    public int findMaximumXOR(int[] nums) {
        // Build the bitwise trie
        TrieNode root = new TrieNode();
        for (int num : nums) {
            TrieNode node = root;
            for (int i = 31; i >= 0; i--) {
                int bit = (num >> i) & 1;
                if (node.children[bit] == null) {
                    node.children[bit] = new TrieNode();
                }
                node = node.children[bit];
            }
        }

        int max = 0;
        for (int num : nums) {
            TrieNode node = root;
            int currentMax = 0;
            for (int i = 31; i >= 0; i--) {
                int bit = (num >> i) & 1;
                int toggleBit = 1 - bit; // Look for opposite bit to maximize XOR
                
                if (node.children[toggleBit] != null) {
                    currentMax += (1 << i);
                    node = node.children[toggleBit];
                } else {
                    node = node.children[bit];
                }
            }
            max = Math.max(max, currentMax);
        }
        return max;
    }
}
// @lc code=end
