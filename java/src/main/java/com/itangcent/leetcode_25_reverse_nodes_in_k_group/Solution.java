package com.itangcent.leetcode_25_reverse_nodes_in_k_group;/*
 * @lc app=leetcode id=25 lang=java
 *
 * [25] Reverse Nodes in k-Group
 */

// @lc code=start

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        return reverseKNodes(head, k);
    }

    private ListNode reverseKNodes(ListNode head, int k) {
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        int count = 0;

        while (current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        if (count < k) {
            return reverseKNodes(prev, count);
        }

        if (next != null) {
            head.next = reverseKNodes(next, k);
        }

        return prev;
    }
}
// @lc code=end

