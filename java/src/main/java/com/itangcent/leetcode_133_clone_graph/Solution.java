package com.itangcent.leetcode_133_clone_graph;


/*
 * @lc app=leetcode id=133 lang=java
 *
 * [133] Clone Graph
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
    private final Map<Integer, Node> nodes = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) return null;
        nodes.clear();

        return cloneNode(node);
    }

    public Node cloneNode(Node node) {
        Node existedNode = nodes.get(node.val);
        if (existedNode != null) {
            return existedNode;
        }

        Node newNode = new Node(
                node.val,
                new ArrayList<>(node.neighbors.size())
        );
        nodes.put(node.val, newNode);

        for (Node neighbor : node.neighbors) {
            newNode.neighbors.add(cloneNode(neighbor));
        }

        return newNode;
    }
}
// @lc code=end

