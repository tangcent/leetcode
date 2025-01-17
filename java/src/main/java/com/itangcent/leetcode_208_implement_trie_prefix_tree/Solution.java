package com.itangcent.leetcode_208_implement_trie_prefix_tree;


/*
 * @lc app=leetcode id=208 lang=java
 *
 * [208] Implement Trie (Prefix Tree)
 */

// @lc code=start
class Trie {
    TrieNode root = new TrieNode();

    public Trie() {
    }

    public void insert(String word) {
        root.insert(word, 0);
    }

    public boolean search(String word) {
        return root.search(word);
    }

    public boolean startsWith(String prefix) {
        return root.startsWith(prefix);
    }

    private static class TrieNode {
        boolean hasEnd = false;
        TrieNode[] children = new TrieNode[26];

        public void insert(String word, int index) {
            if (index == word.length()) {
                hasEnd = true;
                return;
            }
            char c = word.charAt(index);
            TrieNode child = children[c - 'a'];
            if (child == null) {
                child = new TrieNode();
                children[c - 'a'] = child;
            }
            child.insert(word, index + 1);
        }

        public TrieNode findTrieNode(String word, int index) {
            if (index == word.length()) {
                return this;
            }
            char c = word.charAt(index);
            TrieNode child = children[c - 'a'];
            if (child == null) {
                return null;
            }
            return child.findTrieNode(word, index + 1);
        }

        public boolean startsWith(String prefix) {
            return findTrieNode(prefix, 0) != null;
        }

        public boolean search(String prefix) {
            TrieNode trieNode = findTrieNode(prefix, 0);
            return trieNode != null && trieNode.hasEnd;
        }
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
// @lc code=end

