package com.itangcent.ii_add_two_numbers;

/**
 * https://leetcode.com/problems/add-two-numbers/
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example:
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);

        ListNode result = head;
        boolean carry = false;
        for (; l1 != null && l2 != null; l1 = l1.next, l2 = l2.next) {
            int sum = l1.val + l2.val;
            if (carry) {
                carry = false;
                ++sum;
            }
            if (sum >= 10) {
                carry = true;
                sum -= 10;
            }
            result.next = new ListNode(sum);
            result = result.next;
        }
        ListNode rest = l1 == null ? l2 : l1;
        if (rest != null) {
            if (carry) {
                while (rest != null) {
                    if (rest.val == 9) {
                        result.next = new ListNode(0);
                        result = result.next;
                        rest = rest.next;
                    } else {
                        result.next = new ListNode(rest.val + 1);
                        result = result.next;
                        rest = rest.next;
                        carry = false;
                        break;
                    }
                }
            }
            result.next = rest;
        }
        if (carry) {
            result.next = new ListNode(1);
        }
        return head.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode result = new Solution().addTwoNumbers(parse("98"), parse("1"));
        while (result != null) {
            System.out.print(result.val);
            result = result.next;
        }
    }

    static ListNode parse(String num) {
        ListNode head = new ListNode(0);
        ListNode p = head;
        for (char c : num.toCharArray()) {
            p.next = new ListNode(c - '0');
            p = p.next;
        }
        return head.next;
    }
}
