package com.itangcent.leetcode_445_add_two_numbers_ii;

/**
 * Test class for the solution to LeetCode problem #445: add-two-numbers-ii
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #445: add-two-numbers-ii");
        
        // Test case 1: Basic addition (342 + 465 = 807)
        ListNode l1 = createList(new int[]{2, 4, 3});
        ListNode l2 = createList(new int[]{5, 6, 4});
        ListNode result = solution.addTwoNumbers(l1, l2);
        System.out.println("Test case for basic addition: " + 
            (listToNumber(result) == 807 ? "PASSED" : "FAILED") + 
            " (Expected: 807, Actual: " + listToNumber(result) + ")");
        
        // Test case 2: Different length numbers (9999 + 1 = 10000)
        l1 = createList(new int[]{9, 9, 9, 9});
        l2 = createList(new int[]{1});
        result = solution.addTwoNumbers(l1, l2);
        System.out.println("Test case for different lengths: " + 
            (listToNumber(result) == 10000 ? "PASSED" : "FAILED") + 
            " (Expected: 10000, Actual: " + listToNumber(result) + ")");
        
        // Test case 3: Zero addition (0 + 0 = 0)
        l1 = createList(new int[]{0});
        l2 = createList(new int[]{0});
        result = solution.addTwoNumbers(l1, l2);
        System.out.println("Test case for zero addition: " + 
            (listToNumber(result) == 0 ? "PASSED" : "FAILED") + 
            " (Expected: 0, Actual: " + listToNumber(result) + ")");
    }
    
    // Helper method to create a linked list from array
    private static ListNode createList(int[] digits) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int digit : digits) {
            current.next = new ListNode(digit);
            current = current.next;
        }
        return dummy.next;
    }
    
    // Helper method to convert linked list to number
    private static int listToNumber(ListNode node) {
        int num = 0;
        while (node != null) {
            num = num * 10 + node.val;
            node = node.next;
        }
        return num;
    }
}
