package com.itangcent.leetcode_24_swap_nodes_in_pairs;

/*
 * @lc app=leetcode id=24 lang=java
 *
 * [24] Swap Nodes in Pairs
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode p = dummy;
        while(true){
            ListNode first = p.next;
            if(first==null){
                break;
            }
            ListNode second = first.next;
            if(second==null){
                break;
            }
            p.next = second;
            first.next = second.next;
            second.next = first;
            p = first;
        }
        return dummy.next;
    }
}
// @lc code=end

