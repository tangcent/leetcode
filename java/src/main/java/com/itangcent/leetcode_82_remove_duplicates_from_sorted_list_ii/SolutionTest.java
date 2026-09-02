package com.itangcent.leetcode_82_remove_duplicates_from_sorted_list_ii;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1: Example from LeetCode - List with duplicates
        ListNode head1 = createList(new int[]{1,2,3,3,4,4,5});
        System.out.println("Test Case 1:");
        printList(solution.deleteDuplicates(head1)); // Expected: 1->2->5

        // Test Case 2: Example from LeetCode - List with all duplicates except one
        ListNode head2 = createList(new int[]{1,1,1,2,3});
        System.out.println("\nTest Case 2:");
        printList(solution.deleteDuplicates(head2)); // Expected: 2->3

        // Test Case 3: Empty list
        ListNode head3 = null;
        System.out.println("\nTest Case 3:");
        printList(solution.deleteDuplicates(head3)); // Expected: null

        // Test Case 4: List with all duplicates
        ListNode head4 = createList(new int[]{1,1,1,1,1});
        System.out.println("\nTest Case 4:");
        printList(solution.deleteDuplicates(head4)); // Expected: null
        
        // Test Case 5: List with no duplicates
        ListNode head5 = createList(new int[]{1,2,3,4,5});
        System.out.println("\nTest Case 5:");
        printList(solution.deleteDuplicates(head5)); // Expected: 1->2->3->4->5
    }
    
    // Helper method to create a linked list from array
    private static ListNode createList(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : arr) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }
    
    // Helper method to print the linked list
    private static void printList(ListNode head) {
        if (head == null) {
            System.out.println("null");
            return;
        }
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print("->");
            }
            current = current.next;
        }
        System.out.println();
    }
} 