package com.itangcent.leetcode_141_linked_list_cycle;

/**
 * Test class for the solution to LeetCode problem #141: linked-list-cycle
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #141: linked-list-cycle");
        
        // Test Case 1: List with a cycle
        ListNode head1 = new ListNode(3);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(-4);
        head1.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1; // Creates a cycle: 3 -> 2 -> 0 -> -4 -> 2
        boolean result1 = solution.hasCycle(head1);
        System.out.println("Test case for list with cycle: " + (result1 ? "PASSED" : "FAILED"));
        
        // Test Case 2: List with a cycle at the head
        ListNode head2 = new ListNode(1);
        ListNode node4 = new ListNode(2);
        head2.next = node4;
        node4.next = head2; // Creates a cycle: 1 -> 2 -> 1
        boolean result2 = solution.hasCycle(head2);
        System.out.println("Test case for list with cycle at head: " + (result2 ? "PASSED" : "FAILED"));
        
        // Test Case 3: Single element list with no cycle
        ListNode head3 = new ListNode(1);
        boolean result3 = solution.hasCycle(head3);
        System.out.println("Test case for single element list with no cycle: " + (!result3 ? "PASSED" : "FAILED"));
        
        // Test Case 4: List with multiple elements but no cycle
        ListNode head4 = new ListNode(1);
        ListNode node5 = new ListNode(2);
        ListNode node6 = new ListNode(3);
        ListNode node7 = new ListNode(4);
        head4.next = node5;
        node5.next = node6;
        node6.next = node7;
        boolean result4 = solution.hasCycle(head4);
        System.out.println("Test case for list with multiple elements but no cycle: " + (!result4 ? "PASSED" : "FAILED"));
        
        // Test Case 5: Empty list (null)
        ListNode head5 = null;
        boolean result5 = solution.hasCycle(head5);
        System.out.println("Test case for empty list: " + (!result5 ? "PASSED" : "FAILED"));
    }
}
