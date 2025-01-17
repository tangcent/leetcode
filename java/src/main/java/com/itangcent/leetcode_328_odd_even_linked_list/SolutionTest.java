package com.itangcent.leetcode_328_odd_even_linked_list;

/**
 * Test class for the solution to LeetCode problem #328: odd-even-linked-list
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #328: odd-even-linked-list");
        
        // Test case 1: [1,2,3,4,5] -> [1,3,5,2,4]
        testCase1(solution);
        
        // Test case 2: [2,1,3,5,6,4,7] -> [2,3,6,7,1,5,4]
        testCase2(solution);
        
        // Test case 3: Empty list
        testCase3(solution);
        
        // Test case 4: Single node
        testCase4(solution);
        
        // Test case 5: Two nodes
        testCase5(solution);
        
        // Test case 6: Eight nodes
        testCase6(solution);
    }
    
    private static void testCase1(Solution solution) {
        // Create input: [1,2,3,4,5]
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        
        // Expected output: [1,3,5,2,4]
        ListNode expected = new ListNode(1, new ListNode(3, new ListNode(5, new ListNode(2, new ListNode(4)))));
        
        // Run the solution
        ListNode result = solution.oddEvenList(head);
        
        // Verify the result
        boolean passed = compareLinkedLists(result, expected);
        System.out.println("Test case for [1,2,3,4,5]: " + (passed ? "PASSED" : "FAILED"));
        if (!passed) {
            System.out.println("  Expected: " + linkedListToString(expected));
            System.out.println("  Actual: " + linkedListToString(result));
        }
    }
    
    private static void testCase2(Solution solution) {
        // Create input: [2,1,3,5,6,4,7]
        ListNode head = new ListNode(2, new ListNode(1, new ListNode(3, new ListNode(5, 
                       new ListNode(6, new ListNode(4, new ListNode(7)))))));
        
        // Expected output: [2,3,6,7,1,5,4]
        ListNode expected = new ListNode(2, new ListNode(3, new ListNode(6, new ListNode(7,
                          new ListNode(1, new ListNode(5, new ListNode(4)))))));
        
        // Run the solution
        ListNode result = solution.oddEvenList(head);
        
        // Verify the result
        boolean passed = compareLinkedLists(result, expected);
        System.out.println("Test case for [2,1,3,5,6,4,7]: " + (passed ? "PASSED" : "FAILED"));
        if (!passed) {
            System.out.println("  Expected: " + linkedListToString(expected));
            System.out.println("  Actual: " + linkedListToString(result));
        }
    }
    
    private static void testCase3(Solution solution) {
        // Create input: []
        ListNode head = null;
        
        // Expected output: []
        ListNode expected = null;
        
        // Run the solution
        ListNode result = solution.oddEvenList(head);
        
        // Verify the result
        boolean passed = (result == null && expected == null);
        System.out.println("Test case for empty list: " + (passed ? "PASSED" : "FAILED"));
        if (!passed) {
            System.out.println("  Expected: " + linkedListToString(expected));
            System.out.println("  Actual: " + linkedListToString(result));
        }
    }
    
    private static void testCase4(Solution solution) {
        // Create input: [1]
        ListNode head = new ListNode(1);
        
        // Expected output: [1]
        ListNode expected = new ListNode(1);
        
        // Run the solution
        ListNode result = solution.oddEvenList(head);
        
        // Verify the result
        boolean passed = compareLinkedLists(result, expected);
        System.out.println("Test case for single node [1]: " + (passed ? "PASSED" : "FAILED"));
        if (!passed) {
            System.out.println("  Expected: " + linkedListToString(expected));
            System.out.println("  Actual: " + linkedListToString(result));
        }
    }
    
    private static void testCase5(Solution solution) {
        // Create input: [1,2]
        ListNode head = new ListNode(1, new ListNode(2));
        
        // Expected output: [1,2]
        ListNode expected = new ListNode(1, new ListNode(2));
        
        // Run the solution
        ListNode result = solution.oddEvenList(head);
        
        // Verify the result
        boolean passed = compareLinkedLists(result, expected);
        System.out.println("Test case for two nodes [1,2]: " + (passed ? "PASSED" : "FAILED"));
        if (!passed) {
            System.out.println("  Expected: " + linkedListToString(expected));
            System.out.println("  Actual: " + linkedListToString(result));
        }
    }
    
    private static void testCase6(Solution solution) {
        // Create input: [1,2,3,4,5,6,7,8]
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, 
                      new ListNode(5, new ListNode(6, new ListNode(7, new ListNode(8))))))));
        
        // Expected output: [1,3,5,7,2,4,6,8]
        ListNode expected = new ListNode(1, new ListNode(3, new ListNode(5, new ListNode(7,
                          new ListNode(2, new ListNode(4, new ListNode(6, new ListNode(8))))))));
        
        // Run the solution
        ListNode result = solution.oddEvenList(head);
        
        // Verify the result
        boolean passed = compareLinkedLists(result, expected);
        System.out.println("Test case for [1,2,3,4,5,6,7,8]: " + (passed ? "PASSED" : "FAILED"));
        if (!passed) {
            System.out.println("  Expected: " + linkedListToString(expected));
            System.out.println("  Actual: " + linkedListToString(result));
        }
    }
    
    // Helper method to compare two linked lists
    private static boolean compareLinkedLists(ListNode list1, ListNode list2) {
        while (list1 != null && list2 != null) {
            if (list1.val != list2.val) {
                return false;
            }
            list1 = list1.next;
            list2 = list2.next;
        }
        // Both lists should end at the same time
        return list1 == null && list2 == null;
    }
    
    // Helper method to convert a linked list to string for debugging
    private static String linkedListToString(ListNode head) {
        if (head == null) {
            return "[]";
        }
        
        StringBuilder sb = new StringBuilder("[");
        while (head != null) {
            sb.append(head.val);
            if (head.next != null) {
                sb.append(",");
            }
            head = head.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
