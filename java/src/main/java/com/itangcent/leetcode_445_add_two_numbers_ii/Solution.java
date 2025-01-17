package com.itangcent.leetcode_445_add_two_numbers_ii;

/*
 * @lc app=leetcode id=445 lang=java
 *
 * [445] Add Two Numbers II
 */

// @lc code=start

import java.util.List;

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
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode dummy = new ListNode();
        ListNode p = dummy;

        int flag = 0;
        while (l1 != null || l2 != null) {
            int num = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + flag;
            if (num >= 10) {
                num -= 10;
                flag = 1;
            } else {
                flag = 0;
            }
            p.next = new ListNode(num);
            p = p.next;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        if (flag != 0) {
            p.next = new ListNode(1);
        }
        return reverse(dummy.next);
    }

    private ListNode reverse(ListNode node) {
        ListNode pre = null;
        ListNode curr = node;
        while (true) {
            ListNode next = curr.next;
            if (next == null) {
                break;
            }
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        curr.next = pre;
        return curr;
    }
}
// @lc code=end

