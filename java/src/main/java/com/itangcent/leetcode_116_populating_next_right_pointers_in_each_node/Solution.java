package com.itangcent.leetcode_116_populating_next_right_pointers_in_each_node;

import java.util.LinkedList;

/*
 * @lc app=leetcode id=116 lang=java
 *
 * [116] Populating Next Right Pointers in Each Node
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        LinkedList<Node> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }
        Node dummy = new Node();
        while (!queue.isEmpty()) {
            int size = queue.size();
            Node pre = dummy;
            for (int i = 0; i < size; i++) {
                Node next = queue.poll();
                if (next.left != null) {
                    queue.add(next.left);
                }
                if (next.right != null) {
                    queue.add(next.right);
                }
                pre.next = next;
                pre = pre.next;
            }
        }
        return root;
    }
}
// @lc code=end

