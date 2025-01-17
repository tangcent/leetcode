package com.itangcent.leetcode_143_reorder_list;

/*
 * @lc app=leetcode id=143 lang=java
 *
 * [143] Reorder List
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
    public void reorderList(ListNode head) {
        if (head.next == null) {
            return;
        }

        ListNode fast = head;
        ListNode slow = head;
        ListNode preOfSlow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            preOfSlow = slow;
            slow = slow.next;
        }
        preOfSlow.next = null;

        ListNode p2 = reverse(slow);
        combine(head, p2);
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    private void combine(ListNode p1, ListNode p2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (p1 != null && p2 != null) {
            ListNode next1 = p1.next;
            ListNode next2 = p2.next;

            curr.next = p1;
            curr = p1;
            curr.next = p2;
            curr = p2;

            p1 = next1;
            p2 = next2;
        }
        if (p1 != null) {
            curr.next = p1;
        }
    }
}
// @lc code=end

