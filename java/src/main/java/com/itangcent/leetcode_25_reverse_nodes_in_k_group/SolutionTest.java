package com.itangcent.leetcode_25_reverse_nodes_in_k_group;

public class SolutionTest {
    private static Solution solution = new Solution();

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

    private static int[] toArray(ListNode head) {
        int size = 0;
        ListNode current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        
        int[] result = new int[size];
        current = head;
        for (int i = 0; i < size; i++) {
            result[i] = current.val;
            current = current.next;
        }
        return result;
    }

    private static void assertArrayEquals(int[] expected, int[] actual) {
        if (expected.length != actual.length) {
            System.out.println("Test failed: Arrays have different lengths");
            return;
        }
        for (int i = 0; i < expected.length; i++) {
            if (expected[i] != actual[i]) {
                System.out.println("Test failed: Arrays differ at index " + i);
                return;
            }
        }
        System.out.println("Test passed!");
    }

    private static void testReverseKGroupBasic() {
        System.out.println("Testing basic case (k=2)...");
        ListNode head = createList(1, 2, 3, 4);
        ListNode result = solution.reverseKGroup(head, 2);
        assertArrayEquals(new int[]{2, 1, 4, 3}, toArray(result));
    }

    private static void testReverseKGroupK3() {
        System.out.println("Testing k=3 case...");
        ListNode head = createList(1, 2, 3, 4, 5, 6);
        ListNode result = solution.reverseKGroup(head, 3);
        assertArrayEquals(new int[]{3, 2, 1, 6, 5, 4}, toArray(result));
    }

    private static void testReverseKGroupSingleNode() {
        System.out.println("Testing single node case...");
        ListNode head = createList(1);
        ListNode result = solution.reverseKGroup(head, 2);
        assertArrayEquals(new int[]{1}, toArray(result));
    }

    private static void testReverseKGroupEmptyList() {
        System.out.println("Testing empty list case...");
        ListNode result = solution.reverseKGroup(null, 2);
        if (result == null) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed: Expected null result");
        }
    }

    private static void testReverseKGroupNotDivisibleByK() {
        System.out.println("Testing list not divisible by k...");
        ListNode head = createList(1, 2, 3, 4, 5);
        ListNode result = solution.reverseKGroup(head, 2);
        assertArrayEquals(new int[]{2, 1, 4, 3, 5}, toArray(result));
    }

    public static void main(String[] args) {
        testReverseKGroupBasic();
        testReverseKGroupK3();
        testReverseKGroupSingleNode();
        testReverseKGroupEmptyList();
        testReverseKGroupNotDivisibleByK();
    }
} 