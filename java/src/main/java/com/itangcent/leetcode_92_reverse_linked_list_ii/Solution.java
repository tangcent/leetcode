package com.itangcent.leetcode_92_reverse_linked_list_ii;

/*
 * @lc app=leetcode id=92 lang=java
 *
 * [92] Reverse Linked List II
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
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode leftP = dummy;
        for (int i = 0; i < left - 1; i++) {
            leftP = leftP.next;
        }
        ListNode leftPNext = leftP.next; // The node at position 'left'

        ListNode pre = leftP.next; // The first node to be reversed
        ListNode cur = pre.next;
        int len = right - left;
        for (int i = 0; i < len; i++) {
            if (cur == null) {
                break;
            }
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }

        leftP.next = pre;
        leftPNext.next = cur;
        return dummy.next;
    }
}
// @lc code=end

