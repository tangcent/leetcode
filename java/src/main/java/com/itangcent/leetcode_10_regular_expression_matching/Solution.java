package com.itangcent.leetcode_10_regular_expression_matching;

/*
 * @lc app=leetcode id=10 lang=java
 *
 * [10] Regular Expression Matching
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// @lc code=start
public class Solution {
    private Map<String, Boolean> memo = new HashMap<>();

    public boolean isMatch(String s, String p) {
        memo.clear();
        Node[] nodes = parse(p);
        return isMatch(s, nodes, 0, 0);
    }

    private boolean isMatch(String s, Node[] nodes, int i, int j) {
        String key = i + "," + j;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        if (i == s.length()) {
            if (j == nodes.length) {
                return true;
            }
            if (nodes[j].matchZeroOrMore()) {
                return isMatch(s, nodes, i, j + 1);
            }
            return false;
        }
        if (j == nodes.length) {
            return false;
        }
        Node node = nodes[j];
        boolean result = false;
        if (node.match(s.charAt(i))) {
            if (isMatch(s, nodes, i + 1, j + 1)) {
                result = true;
            } else if (node.matchZeroOrMore() && isMatch(s, nodes, i + 1, j)) {
                result = true;
            }
        }
        if (!result && node.matchZeroOrMore()) {
            result = isMatch(s, nodes, i, j + 1);
        }
        memo.put(key, result);
        return result;
    }

    public Node[] parse(String p) {
        List<Node> nodes = new ArrayList<>();
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            if (c == '.') {
                nodes.add(new AnyNode());
            } else if (c == '*') {
                nodes.set(nodes.size() - 1, new StarNode(nodes.get(nodes.size() - 1)));
            } else {
                nodes.add(new ExactNode(c));
            }
        }
        return nodes.toArray(new Node[0]);
    }

    interface Node {
        boolean match(char c);

        boolean matchZeroOrMore();
    }

    class ExactNode implements Node {
        char c;

        public ExactNode(char c) {
            this.c = c;
        }

        @Override
        public boolean match(char c) {
            return this.c == c;
        }

        @Override
        public boolean matchZeroOrMore() {
            return false;
        }
    }

    class AnyNode implements Node {
        public boolean match(char c) {
            return true;
        }

        @Override
        public boolean matchZeroOrMore() {
            return false;
        }
    }

    class StarNode implements Node {
        Node node;

        public StarNode(Node node) {
            this.node = node;
        }

        @Override
        public boolean match(char c) {
            return node.match(c);
        }

        @Override
        public boolean matchZeroOrMore() {
            return true;
        }
    }
}
// @lc code=end

