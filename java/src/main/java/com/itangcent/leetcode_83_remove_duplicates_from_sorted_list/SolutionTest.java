package com.itangcent.leetcode_83_remove_duplicates_from_sorted_list;

public class SolutionTest {
    private static final Solution solution = new Solution();

    private static void assertEquals(ListNode expected, ListNode actual) {
        ListNode e = expected;
        ListNode a = actual;
        while (e != null && a != null) {
            if (e.val != a.val) {
                throw new AssertionError("Expected " + e.val + " but got " + a.val);
            }
            e = e.next;
            a = a.next;
        }
        if (e != null || a != null) {
            throw new AssertionError("Lists have different lengths");
        }
    }

    private static ListNode createList(int... values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        // Test empty list
        assertEquals(null, solution.deleteDuplicates(null));

        // Test single node
        assertEquals(createList(1), solution.deleteDuplicates(createList(1)));

        // Test no duplicates
        assertEquals(createList(1, 2, 3), solution.deleteDuplicates(createList(1, 2, 3)));

        // Test with duplicates
        assertEquals(createList(1, 2, 3), solution.deleteDuplicates(createList(1, 1, 2, 3, 3)));

        // Test all same values
        assertEquals(createList(1), solution.deleteDuplicates(createList(1, 1, 1)));

        System.out.println("All tests passed!");
    }
} 