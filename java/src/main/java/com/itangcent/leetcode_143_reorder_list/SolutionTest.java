package com.itangcent.leetcode_143_reorder_list;

/**
 * Test class for the solution to LeetCode problem #143: reorder-list
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #143: reorder-list");
        
        // Test case 1: [1,2,3,4]
        ListNode head1 = createList(new int[]{1, 2, 3, 4});
        System.out.print("Test case for List [1,2,3,4]: ");
        System.out.print("Before: ");
        printList(head1);
        
        solution.reorderList(head1);
        
        boolean result1 = compareList(head1, new int[]{1, 4, 2, 3});
        System.out.println("After: ");
        printList(head1);
        System.out.println("Test case for [1,2,3,4]: " + (result1 ? "PASSED" : "FAILED"));
        
        // Test case 2: [1,2,3,4,5]
        ListNode head2 = createList(new int[]{1, 2, 3, 4, 5});
        System.out.print("Test case for List [1,2,3,4,5]: ");
        System.out.print("Before: ");
        printList(head2);
        
        solution.reorderList(head2);
        
        boolean result2 = compareList(head2, new int[]{1, 5, 2, 4, 3});
        System.out.println("After: ");
        printList(head2);
        System.out.println("Test case for [1,2,3,4,5]: " + (result2 ? "PASSED" : "FAILED"));
        
        // Test case 3: Single node [1]
        ListNode head3 = createList(new int[]{1});
        System.out.print("Test case for List [1]: ");
        System.out.print("Before: ");
        printList(head3);
        
        solution.reorderList(head3);
        
        boolean result3 = compareList(head3, new int[]{1});
        System.out.println("After: ");
        printList(head3);
        System.out.println("Test case for [1]: " + (result3 ? "PASSED" : "FAILED"));
    }
    
    // Helper method to create a linked list from an array of integers
    private static ListNode createList(int[] values) {
        if (values == null || values.length == 0) {
            return null;
        }
        
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        
        return head;
    }
    
    // Helper method to print a linked list
    private static void printList(ListNode head) {
        if (head == null) {
            System.out.println("[]");
            return;
        }
        
        StringBuilder sb = new StringBuilder("[");
        ListNode current = head;
        
        while (current != null) {
            sb.append(current.val);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        
        sb.append("]");
        System.out.println(sb.toString());
    }
    
    // Helper method to compare a linked list with expected values
    private static boolean compareList(ListNode head, int[] expected) {
        if (head == null && (expected == null || expected.length == 0)) {
            return true;
        }
        
        if (head == null || expected == null || expected.length == 0) {
            return false;
        }
        
        ListNode current = head;
        int i = 0;
        
        while (current != null && i < expected.length) {
            if (current.val != expected[i]) {
                return false;
            }
            current = current.next;
            i++;
        }
        
        return current == null && i == expected.length;
    }
}
