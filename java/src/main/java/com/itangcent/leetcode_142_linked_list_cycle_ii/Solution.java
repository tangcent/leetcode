package com.itangcent.leetcode_142_linked_list_cycle_ii;


/*
 * @lc app=leetcode id=142 lang=java
 *
 * [142] Linked List Cycle II
 */

// @lc code=start

/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // Step 1: Detect if there is a cycle using fast and slow pointers
        ListNode fast = head;
        ListNode slow = head;
        
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            
            // If cycle detected, find the start of the cycle
            if (fast == slow) {
                // Reset slow pointer to head, keep fast at meeting point
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow; // This is the start of the cycle
            }
        }
        
        return null; // No cycle found
    }
}
// @lc code=end

