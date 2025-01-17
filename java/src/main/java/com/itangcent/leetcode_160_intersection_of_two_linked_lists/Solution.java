package com.itangcent.leetcode_160_intersection_of_two_linked_lists;

import com.itangcent.leetcode_160_intersection_of_two_linked_lists.ListNode;

/*
 * @lc app=leetcode id=160 lang=java
 *
 * [160] Intersection of Two Linked Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        
        ListNode pointerA = headA;
        ListNode pointerB = headB;
        
        // If the two linked lists have different lengths, this approach will ensure 
        // both pointers reach the intersection point at the same time
        while (pointerA != pointerB) {
            // When pointerA reaches the end, redirect it to headB
            pointerA = (pointerA == null) ? headB : pointerA.next;
            
            // When pointerB reaches the end, redirect it to headA
            pointerB = (pointerB == null) ? headA : pointerB.next;
        }
        
        // If there is no intersection, both pointers will become null eventually
        // If there is an intersection, both pointers will meet at the intersection
        return pointerA;
    }
}
// @lc code=end

