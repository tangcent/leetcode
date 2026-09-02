package com.itangcent.leetcode_328_odd_even_linked_list;

/*
 * @lc app=leetcode id=328 lang=java
 *
 * [328] Odd Even Linked List
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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) return head;

        ListNode dummyHead = new ListNode(0);

        ListNode odd = head;
        ListNode even = dummyHead;
        while (odd.next != null) {
            ListNode next = odd.next;

            even.next = next;
            even = even.next;

            if (next.next == null) {
                break;
            }

            odd.next = next.next;
            odd = next.next;
        }
        even.next = null;
        odd.next = dummyHead.next;
        return head;
    }
}
// @lc code=end

