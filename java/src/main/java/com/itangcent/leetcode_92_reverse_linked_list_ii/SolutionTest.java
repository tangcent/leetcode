package com.itangcent.leetcode_92_reverse_linked_list_ii;

/**
 * Test class for the solution to LeetCode problem #92: reverse-linked-list-ii
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #92: reverse-linked-list-ii");
        
        // Test case 1: [1,2,3,4,5], left=2, right=4
        ListNode list1 = createLinkedList(new int[]{1, 2, 3, 4, 5});
        System.out.println("Test case 1:");
        System.out.println("Input: " + printLinkedList(list1) + ", left=2, right=4");
        ListNode result1 = solution.reverseBetween(list1, 2, 4);
        System.out.println("Output: " + printLinkedList(result1));
        System.out.println("Expected: [1,4,3,2,5]");
        System.out.println();
        
        // Test case 2: [5], left=1, right=1
        ListNode list2 = createLinkedList(new int[]{5});
        System.out.println("Test case 2:");
        System.out.println("Input: " + printLinkedList(list2) + ", left=1, right=1");
        ListNode result2 = solution.reverseBetween(list2, 1, 1);
        System.out.println("Output: " + printLinkedList(result2));
        System.out.println("Expected: [5]");
        System.out.println();
        
        // Test case 3: [1,2,3,4,5], left=1, right=5
        ListNode list3 = createLinkedList(new int[]{1, 2, 3, 4, 5});
        System.out.println("Test case 3:");
        System.out.println("Input: " + printLinkedList(list3) + ", left=1, right=5");
        ListNode result3 = solution.reverseBetween(list3, 1, 5);
        System.out.println("Output: " + printLinkedList(result3));
        System.out.println("Expected: [5,4,3,2,1]");
    }
    
    // Helper method to create a linked list from an array of integers
    private static ListNode createLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }
    
    // Helper method to print a linked list
    private static String printLinkedList(ListNode head) {
        StringBuilder sb = new StringBuilder("[");
        ListNode current = head;
        while (current != null) {
            sb.append(current.val);
            if (current.next != null) {
                sb.append(",");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
