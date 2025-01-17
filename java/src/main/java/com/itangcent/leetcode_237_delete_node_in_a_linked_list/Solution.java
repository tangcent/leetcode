package com.itangcent.leetcode_237_delete_node_in_a_linked_list;

/*
 * @lc app=leetcode id=237 lang=java
 *
 * [237] Delete Node in a Linked List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // Copy next node's value to current node
        node.val = node.next.val;
        // Skip next node
        node.next = node.next.next;
    }
}
// @lc code=end
