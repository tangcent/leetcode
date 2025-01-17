package com.itangcent.leetcode_142_linked_list_cycle_ii;

/**
 * Test class for the solution to LeetCode problem #142: linked-list-cycle-ii
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #142: linked-list-cycle-ii");
        
        // Test case 1: List with cycle at position 1 (0-indexed)
        // 3 -> 2 -> 0 -> -4
        //      ^         |
        //      |_________|
        ListNode list1 = createLinkedListWithCycle(new int[]{3, 2, 0, -4}, 1);
        runTestCase("List with cycle at position 1", solution, list1, 1);
        
        // Test case 2: List with cycle at position 0
        // 1 -> 2
        // ^    |
        // |____|
        ListNode list2 = createLinkedListWithCycle(new int[]{1, 2}, 0);
        runTestCase("List with cycle at position 0", solution, list2, 0);
        
        // Test case 3: No cycle
        // 1 -> null
        ListNode list3 = createLinkedListWithCycle(new int[]{1}, -1);
        runTestCase("List with no cycle", solution, list3, -1);
        
        // Test case 4: Long list with cycle far from beginning
        // 1->2->3->4->5->6->7->8->9->10
        //             ^              |
        //             |______________|
        ListNode list4 = createLinkedListWithCycle(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 4);
        runTestCase("Long list with cycle at position 4", solution, list4, 4);
    }
    
    /**
     * Creates a linked list with a cycle at the specified position
     * @param values Array of values for the linked list
     * @param cyclePos Position where the cycle starts (0-indexed), or -1 for no cycle
     * @return Head of the created linked list
     */
    private static ListNode createLinkedListWithCycle(int[] values, int cyclePos) {
        if (values == null || values.length == 0) {
            return null;
        }
        
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        ListNode cycleNode = null;
        
        // Create the linked list
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
            
            // Remember the node where cycle should start
            if (i == cyclePos) {
                cycleNode = current;
            }
        }
        
        // Create cycle if needed
        if (cyclePos >= 0 && cyclePos < values.length) {
            // If cyclePos is 0, we connect the last node to the head
            if (cyclePos == 0) {
                current.next = head;
            } else {
                current.next = cycleNode;
            }
        }
        
        return head;
    }
    
    /**
     * Runs a test case and prints the result
     * @param caseName Name of the test case
     * @param solution Solution instance
     * @param head Head of the linked list
     * @param expectedPos Expected position of cycle (-1 means no cycle)
     */
    private static void runTestCase(String caseName, Solution solution, ListNode head, int expectedPos) {
        ListNode cycleEntry = solution.detectCycle(head);
        
        if (expectedPos == -1) {
            // Should not find a cycle
            if (cycleEntry == null) {
                System.out.println("Test case for " + caseName + ": PASSED");
            } else {
                System.out.println("Test case for " + caseName + ": FAILED");
                System.out.println("  Expected: null");
                System.out.println("  Actual: cycle detected");
            }
        } else {
            // Should find a cycle
            if (cycleEntry == null) {
                System.out.println("Test case for " + caseName + ": FAILED");
                System.out.println("  Expected: cycle at position " + expectedPos);
                System.out.println("  Actual: null (no cycle detected)");
            } else {
                // Verify cycle node is at the expected position
                ListNode current = head;
                int actualPos = 0;
                boolean foundCycle = false;
                
                while (current != null && actualPos <= expectedPos) {
                    if (current == cycleEntry) {
                        foundCycle = true;
                        break;
                    }
                    current = current.next;
                    actualPos++;
                }
                
                if (foundCycle && actualPos == expectedPos) {
                    System.out.println("Test case for " + caseName + ": PASSED");
                } else {
                    System.out.println("Test case for " + caseName + ": FAILED");
                    System.out.println("  Expected: cycle at position " + expectedPos);
                    System.out.println("  Actual: cycle at position " + (foundCycle ? actualPos : "not found"));
                }
            }
        }
    }
}
