package com.itangcent.leetcode_160_intersection_of_two_linked_lists;

/**
 * Test class for the solution to LeetCode problem #160: intersection-of-two-linked-lists
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test Case 1: Intersection at node with value 8
        // List A: 4->1->8->4->5
        // List B: 5->6->1->8->4->5
        // Intersection at node with value 8
        ListNode commonNode1 = new ListNode(8);
        commonNode1.next = new ListNode(4);
        commonNode1.next.next = new ListNode(5);
        
        ListNode headA1 = new ListNode(4);
        headA1.next = new ListNode(1);
        headA1.next.next = commonNode1;
        
        ListNode headB1 = new ListNode(5);
        headB1.next = new ListNode(6);
        headB1.next.next = new ListNode(1);
        headB1.next.next.next = commonNode1;
        
        ListNode result1 = solution.getIntersectionNode(headA1, headB1);
        System.out.println("Test case for intersection at node 8: " + 
                            (result1 == commonNode1 ? "PASSED" : "FAILED"));
        
        // Test Case 2: Intersection at node with value 2
        // List A: 1->9->1->2->4
        // List B: 3->2->4
        // Intersection at node with value 2
        ListNode commonNode2 = new ListNode(2);
        commonNode2.next = new ListNode(4);
        
        ListNode headA2 = new ListNode(1);
        headA2.next = new ListNode(9);
        headA2.next.next = new ListNode(1);
        headA2.next.next.next = commonNode2;
        
        ListNode headB2 = new ListNode(3);
        headB2.next = commonNode2;
        
        ListNode result2 = solution.getIntersectionNode(headA2, headB2);
        System.out.println("Test case for intersection at node 2: " + 
                            (result2 == commonNode2 ? "PASSED" : "FAILED"));
        
        // Test Case 3: No Intersection
        // List A: 2->6->4
        // List B: 1->5
        ListNode headA3 = new ListNode(2);
        headA3.next = new ListNode(6);
        headA3.next.next = new ListNode(4);
        
        ListNode headB3 = new ListNode(1);
        headB3.next = new ListNode(5);
        
        ListNode result3 = solution.getIntersectionNode(headA3, headB3);
        System.out.println("Test case for no intersection: " + 
                            (result3 == null ? "PASSED" : "FAILED"));
    }
}
