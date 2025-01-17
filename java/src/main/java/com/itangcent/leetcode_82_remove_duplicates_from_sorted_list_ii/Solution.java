package com.itangcent.leetcode_82_remove_duplicates_from_sorted_list_ii;

/*
 * @lc app=leetcode id=82 lang=java
 *
 * [82] Remove Duplicates from Sorted List II
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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            if (next == null) {
                break;
            }
            if (cur.val != next.val) {
                pre.next = cur;
                pre = cur;
                cur = next;
                continue;
            }

            while (cur.val == next.val) {
                next = next.next;
                if (next == null) {
                    break;
                }
            }
            cur = next;
        }

        pre.next = cur;
        return dummy.next;
    }
}
// @lc code=end

