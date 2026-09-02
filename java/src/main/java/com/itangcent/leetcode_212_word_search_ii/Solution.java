package com.itangcent.leetcode_212_word_search_ii;


/*
 * @lc app=leetcode id=212 lang=java
 *
 * [212] Word Search II
 */

import java.util.*;

// @lc code=start
class Solution {
    private static final int[][] DIRS = new int[][]{
            new int[]{-1, 0},
            new int[]{1, 0},
            new int[]{0, -1},
            new int[]{0, 1}
    };

    public List<String> findWords(char[][] board, String[] words) {
        TrieNode root = new TrieNode();
        for (String word : words) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                int idx = c - 'a';
                if (node.next[idx] == null) {
                    node.next[idx] = new TrieNode();
                }
                node = node.next[idx];
            }
            node.word = word;
        }

        List<String> found = new ArrayList<>();
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                dfs(board, i, j, root, found);
            }
        }
        return found;
    }

    private void dfs(char[][] board, int i, int j,
                     TrieNode node, List<String> found) {
        int idx = board[i][j] - 'a';
        TrieNode child = node.next[idx];
        if (child == null) {
            return;
        }
        if (child.word != null) {
            found.add(child.word);
            child.word = null; // avoid duplicates in result
        }

        char ch = board[i][j];
        board[i][j] = 0; // mark visited
        for (int[] dir : DIRS) {
            int nx = i + dir[0];
            int ny = j + dir[1];
            if (nx >= 0 && nx < board.length && ny >= 0 && ny < board[0].length
                    && board[nx][ny] != 0) {
                dfs(board, nx, ny, child, found);
            }
        }
        board[i][j] = ch; // restore
    }

    private static class TrieNode {
        TrieNode[] next = new TrieNode[26];
        String word = null;
    }
}
// @lc code=end

