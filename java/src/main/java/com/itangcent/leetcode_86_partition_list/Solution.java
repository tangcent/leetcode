package com.itangcent.leetcode_86_partition_list;

/*
 * @lc app=leetcode id=86 lang=java
 *
 * [86] Partition List
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
    public ListNode partition(ListNode head, int x) {
        ListNode lessHead = new ListNode(0);
        ListNode lessP = lessHead;
        ListNode greaterHead = new ListNode(0);
        ListNode greaterP = greaterHead;
        ListNode curr = head;
        while (curr != null) {
            if (curr.val < x) {
                lessP.next = curr;
                lessP = curr;
            } else {
                greaterP.next = curr;
                greaterP = curr;
            }
            curr = curr.next;
        }
        lessP.next = greaterHead.next;
        greaterP.next = null;
        return lessHead.next;
    }
}
// @lc code=end

