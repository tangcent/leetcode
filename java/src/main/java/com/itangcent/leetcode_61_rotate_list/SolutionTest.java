package com.itangcent.leetcode_61_rotate_list;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: [1,2,3,4,5], k = 2
        System.out.println("Test case 1: [1,2,3,4,5], k = 2");
        ListNode head1 = createList(new int[]{1, 2, 3, 4, 5});
        ListNode result1 = solution.rotateRight(head1, 2);
        printList(result1);
        System.out.println();

        // Test case 2: [0,1,2], k = 4
        System.out.println("Test case 2: [0,1,2], k = 4");
        ListNode head2 = createList(new int[]{0, 1, 2});
        ListNode result2 = solution.rotateRight(head2, 4);
        printList(result2);
        System.out.println();

        // Test case 3: [1,2], k = 1
        System.out.println("Test case 3: [1,2], k = 1");
        ListNode head3 = createList(new int[]{1, 2});
        ListNode result3 = solution.rotateRight(head3, 1);
        printList(result3);
        System.out.println();

        // Test case 4: [1,2,3], k = 3
        System.out.println("Test case 4: [1,2,3], k = 3");
        ListNode head4 = createList(new int[]{1, 2, 3});
        ListNode result4 = solution.rotateRight(head4, 3);
        printList(result4);
        System.out.println();
    }

    private static ListNode createList(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    private static void printList(ListNode head) {
        ListNode current = head;
        System.out.print("[");
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(",");
            }
            current = current.next;
        }
        System.out.print("]");
    }
} 