package com.itangcent.leetcode_147_insertion_sort_list;

/**
 * Test class for the solution to LeetCode problem #147: insertion-sort-list
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #147: insertion-sort-list");
        
        // Test case 1: [4,2,1,3]
        ListNode testCase1 = createList(new int[]{4, 2, 1, 3});
        ListNode expected1 = createList(new int[]{1, 2, 3, 4});
        testInsertionSort(solution, testCase1, expected1, "Test case 1: [4,2,1,3]");
        
        // Test case 2: [-1,5,3,4,0]
        ListNode testCase2 = createList(new int[]{-1, 5, 3, 4, 0});
        ListNode expected2 = createList(new int[]{-1, 0, 3, 4, 5});
        testInsertionSort(solution, testCase2, expected2, "Test case 2: [-1,5,3,4,0]");
        
        // Test case 3: Single element
        ListNode testCase3 = new ListNode(1);
        ListNode expected3 = new ListNode(1);
        testInsertionSort(solution, testCase3, expected3, "Test case 3: Single element [1]");
        
        // Test case 4: Already sorted
        ListNode testCase4 = createList(new int[]{1, 2, 3, 4, 5});
        ListNode expected4 = createList(new int[]{1, 2, 3, 4, 5});
        testInsertionSort(solution, testCase4, expected4, "Test case 4: Already sorted [1,2,3,4,5]");
        
        // Test case 5: Reverse sorted
        ListNode testCase5 = createList(new int[]{5, 4, 3, 2, 1});
        ListNode expected5 = createList(new int[]{1, 2, 3, 4, 5});
        testInsertionSort(solution, testCase5, expected5, "Test case 5: Reverse sorted [5,4,3,2,1]");
    }
    
    /**
     * Creates a linked list from an array of integers
     */
    private static ListNode createList(int[] values) {
        if (values == null || values.length == 0) {
            return null;
        }
        
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        
        return dummy.next;
    }
    
    /**
     * Compares two linked lists to check if they are equal
     */
    private static boolean areListsEqual(ListNode list1, ListNode list2) {
        while (list1 != null && list2 != null) {
            if (list1.val != list2.val) {
                return false;
            }
            list1 = list1.next;
            list2 = list2.next;
        }
        
        // Both lists should be null at the end if they're of the same length
        return list1 == null && list2 == null;
    }
    
    /**
     * Converts a linked list to string for display
     */
    private static String listToString(ListNode head) {
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
    
    /**
     * Tests the insertion sort function with the given input and expected output
     */
    private static void testInsertionSort(Solution solution, ListNode input, ListNode expected, String testName) {
        // Create a copy of the input to display
        ListNode originalInput = duplicateList(input);
        
        // Run the solution
        ListNode result = solution.insertionSortList(input);
        
        // Check if the result matches the expected output
        boolean passed = areListsEqual(result, expected);
        
        // Print the test result
        System.out.println("Test case for " + testName + ": " + (passed ? "PASSED" : "FAILED"));
        
        if (!passed) {
            System.out.println("  Input: " + listToString(originalInput));
            System.out.println("  Expected: " + listToString(expected));
            System.out.println("  Actual: " + listToString(result));
        }
    }
    
    /**
     * Creates a duplicate of the linked list
     */
    private static ListNode duplicateList(ListNode head) {
        if (head == null) {
            return null;
        }
        
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        ListNode node = head;
        
        while (node != null) {
            current.next = new ListNode(node.val);
            current = current.next;
            node = node.next;
        }
        
        return dummy.next;
    }
}
