package com.itangcent.leetcode_2_add_two_numbers;

/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode head2 = l2;
        int carry = 0;
        ListNode result = new ListNode(0);
        ListNode p = result;
        while (head1 != null || head2 != null) {
            int sum = carry;
            if (head1 != null) {
                sum += head1.val;
                head1 = head1.next;
            }
            if (head2 != null) {
                sum += head2.val;
                head2 = head2.next;
            }
            carry = sum / 10;
            p.next = new ListNode(sum % 10);
            p = p.next;
        }
        if (carry > 0) {
            p.next = new ListNode(carry);
        }
        return result.next;
    }
}
// @lc code=end

