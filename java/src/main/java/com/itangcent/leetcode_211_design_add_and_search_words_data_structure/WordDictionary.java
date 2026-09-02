package com.itangcent.leetcode_211_design_add_and_search_words_data_structure;


/*
 * @lc app=leetcode id=211 lang=java
 *
 * [211] Design Add and Search Words Data Structure
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// @lc code=start
class WordDictionary {
    Node root = new Node();

    public WordDictionary() {

    }

    public void addWord(String word) {
        root.addWord(word, 0);
    }

    public boolean search(String word) {
        return root.search(word, 0);
    }

    private static class Node {
        private boolean leaf = false;
        private Map<Character, Node> nextNodes;

        private void addWord(String word, int index) {
            if (nextNodes == null) {
                nextNodes = new HashMap<>();
            }
            char nextChar = word.charAt(index);
            Node nextNode = nextNodes.computeIfAbsent(nextChar,
                    k -> new Node());
            ++index;
            if (index < word.length()) {
                nextNode.addWord(word, index);
            } else {
                nextNode.leaf = true;
            }
        }

        private boolean search(String word, int index) {
            if (index == word.length()) {
                return leaf;
            }
            if (nextNodes == null) {
                return false;
            }

            char nextChar = word.charAt(index);
            ++index;
            if (nextChar == '.') {
                for (Node nextNode : nextNodes.values()) {
                    if (nextNode.search(word, index)) {
                        return true;
                    }
                }
                return false;
            }

            Node nextNode = nextNodes.get(nextChar);
            if (nextNode == null) {
                return false;
            }
            return nextNode.search(word, index);
        }
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
// @lc code=end

