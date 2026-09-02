package com.itangcent.leetcode_234_palindrome_linked_list;

import com.itangcent.leetcode_234_palindrome_linked_list.ListNode;

/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
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
    public boolean isPalindrome(ListNode head) {
        ListNode quick = head;
        ListNode slow = head;
        ListNode pre = null;
        while (quick != null && quick.next != null) {
            quick = quick.next.next;
            ListNode next = slow.next;
            slow.next = pre;
            pre = slow;
            slow = next;
        }

        if (quick != null) {
            slow = slow.next;
        }
        while (pre != null) {
            if (pre.val != slow.val) {
                return false;
            }
            pre = pre.next;
            slow = slow.next;
        }
        return true;

        //1 -> 2 -> 3 -> 4
        //quick: 1      slow: 1     pre: null
        //quick: 3      slow: 2     pre: 1       | null <- 1 2 -> 3 -> 4
        //quick: null   slow: 3     pre: 2       | null <- 1 <- 2  3 -> 4

        //1 -> 2 -> 3 -> 4 -> 5
        //quick: 1      slow: 1     pre: null
        //quick: 3      slow: 2     pre: 1       | null <- 1 2 -> 3 -> 4 -> 5
        //quick: 5      slow: 3     pre: 2       | null <- 1 <- 2  3 -> 4 -> 5
    }
}
// @lc code=end

