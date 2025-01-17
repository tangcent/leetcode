package com.itangcent.leetcode_147_insertion_sort_list;

/*
 * @lc app=leetcode id=147 lang=java
 *
 * [147] Insertion Sort List
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
    public ListNode insertionSortList(ListNode head) {
        ListNode curr = head.next;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        dummy.next.next = null;

        while (curr != null) {
            ListNode next = curr.next;
            ListNode prev = dummy;
            while (prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
            }
            curr.next = prev.next;
            prev.next = curr;

            curr = next;
        }
        return dummy.next;
    }
}
// @lc code=end

