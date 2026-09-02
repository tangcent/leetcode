package com.itangcent.leetcode_86_partition_list;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1: [1,4,3,2,5,2], x = 3
        ListNode head1 = createLinkedList(new int[]{1, 4, 3, 2, 5, 2});
        ListNode result1 = solution.partition(head1, 3);
        System.out.println("Test case 1:");
        printLinkedList(result1);
        System.out.println("Expected: [1,2,2,4,3,5]");
        System.out.println();
        
        // Test case 2: [2,1], x = 2
        ListNode head2 = createLinkedList(new int[]{2, 1});
        ListNode result2 = solution.partition(head2, 2);
        System.out.println("Test case 2:");
        printLinkedList(result2);
        System.out.println("Expected: [1,2]");
        System.out.println();
        
        // Test case 3: [], x = 0
        ListNode head3 = null;
        ListNode result3 = solution.partition(head3, 0);
        System.out.println("Test case 3:");
        printLinkedList(result3);
        System.out.println("Expected: []");
    }
    
    private static ListNode createLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : arr) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }
    
    private static void printLinkedList(ListNode head) {
        if (head == null) {
            System.out.println("[]");
            return;
        }
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
        System.out.println(sb.toString());
    }
} 