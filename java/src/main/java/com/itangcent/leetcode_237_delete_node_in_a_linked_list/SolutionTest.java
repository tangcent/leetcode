package com.itangcent.leetcode_237_delete_node_in_a_linked_list;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1: Delete middle node
        ListNode head1 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node1 = new ListNode(1);
        ListNode node9 = new ListNode(9);
        head1.next = node5;
        node5.next = node1;
        node1.next = node9;
        
        solution.deleteNode(node5);
        System.out.println("Test case 1: Delete middle node (5)");
        printList(head1); // Should print 4 -> 1 -> 9
        
        // Test case 2: Delete first node (when given access to it)
        ListNode head2 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        head2.next = node2;
        node2.next = node3;
        
        solution.deleteNode(head2);
        System.out.println("Test case 2: Delete first node (1)");
        printList(head2); // Should print 2 -> 3
    }
    
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}